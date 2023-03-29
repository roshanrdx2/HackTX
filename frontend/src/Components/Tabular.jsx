import React, { useState, useEffect } from "react";
import { Chart as ChartJS, BarElement } from "chart.js";

ChartJS.register(BarElement);

const Tabular = ({county}) => {
  const [chart, setChart] = useState({});
  var baseUrl = `http://localhost:8081/getRanking/${county}`;
  useEffect(() => {
    const fetchCoins = async () => {
      await fetch(`${baseUrl}`, {
        method: "GET",
        headers: {
          "Content-Type": "application/json",
          "Access-Control-Allow-Origin": "*",
        },
      })
        .then((response) => {
          if (response.ok) {
            response.json().then((json) => {
              setChart(json);
            });
          }
        })
        .catch((error) => {
          console.log(error);
        });
    };
    fetchCoins();
  }, [baseUrl]);

  return (
    <div>
      <table id="rank">
                <thead>
                <tr>
                    <th>Crops</th>
                    <th>Rank in U.S.</th>
                    <th>Rank in State</th>
                </tr>
                </thead>
                <tbody>
                    {
                        chart.response?.map((item) => (
                            <tr key={item.id}>
                                <td>{item.crops}</td>
                                <td>{item.rankInUs}</td>
                                <td>{item.rankInState}</td>
                            </tr>
                        ))
                    }
                </tbody>
            </table>
    </div>
  );
};

export default Tabular;
