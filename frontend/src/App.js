import logo from "./logo.svg";
import "./App.css";
import Header from "./Components/Header/Header";
import Banner from "./Components/Banner";
import Form from "./Components/Form";
import Map from "./Components/Map";
import BarChart from "./Charts/BarChart";
import DoughnutChart from "./Charts/DoughnutChart";
import LineChart from "./Charts/LineChart";
import PieChart from "./Charts/PieChart";
import React, { useState, useEffect } from "react";
import BarHorizontalChart from "./Charts/BarHorizontalChart";
// import { getCountyData, getWeatherData } from './api';

const App = () => {
  const [coords, setCoords] = useState({});
  const [weatherData, setWeatherData] = useState({});
  const [countyData, setCountyData] = useState({});

  const [childClicked, setChildClicked] = useState(null);
  const [Bounds, setBounds] = useState(null);

  useEffect(() => {
    navigator.geolocation.getCurrentPosition(
      ({ coords: { latitude, longitude } }) => {
        setCoords({ lat: latitude, lng: longitude });
      }
    );
  }, []);

  //   useEffect(() =>{
  //       getWeatherData(coords.lat,coords.lng)
  //       .then((data) => setWeatherData(data));
  //   });
  //   useEffect(() =>{
  //     getCountyData(coords.lat,coords.lng)
  //     .then((data) => setCountyData(data));
  // });

  return (
    <>
      <Header />
      {/* <Banner /> */}
      {/* <Form /> */}
      <Map
        coords={coords}
        setCoords={setCoords}
        Bounds={Bounds}
        setBounds={setBounds}
        setChildClicked={setChildClicked}
        // setCountyData={setCountyData}
        // countyData={countyData}
      />
      <div className="App">
        {/* <BarChart />
        <BarHorizontalChart /> */}
        {/* <DoughnutChart /> */}
        {/* <LineChart /> */}
        {/* <PieChart /> */}
      </div>
    </>
  );
};

export default App;
