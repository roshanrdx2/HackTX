import React from 'react';
import GoogleMapReact from 'google-map-react';
import { Paper, Typography, useMediaQuery } from '@material-ui/core';
import LocationOnOutlinedIcon from '@material-ui/icons/LocationOnOutlined';
import Rating from '@material-ui/lab/Rating';
import axios from 'axios';
// import { Paper, Typography, useMediaQuery } from '@material-ui/core';
// import LocationOnOutlinedIcon from '@material-ui/icons/LocationOnOutlined';

import mapStyles from '../mapStyles.js';
import useStyles from './stylemap.js';
import BarChart from '../Charts/BarChart.js';
import BarHorizontalChart from '../Charts/BarHorizontalChart.js';
import Tabular from './Tabular.jsx';

const Map = ({weatherData,countyData}) => {
    const matches = useMediaQuery('(min-width:600px)');
    const classes = useStyles();
    
    const [county,setCounty]= React.useState("");
    const [post, setPost] = React.useState("");

    async  function handleClick(event) {
    var lat = event.lat, lng = event.lng;
    console.log(lat + " " + lng);
    try{
        axios.get('https://geo.fcc.gov/api/census/area?lat='+lat+'&lon='+lng+'&censusYear=2020&format=json')
        .then((response) => {var lastIndex = response.data.results[0].county_name.lastIndexOf(" ");
        setCounty(response.data.results[0].county_name.substring(0, lastIndex))});

        console.log("post::"+county);
    }catch(error){
        console.log(error);
    }
    return post;
    
    // return event
};
// async function getResponse () {
//     handleClick().then(response => {
//             console.log(response.results[0].county_name)
//     });
// }

// getResponse()



   const coords={lat: 	36.778259,lng:	-119.417931};

    return (
        <div className={classes.mapContainer}>
            <GoogleMapReact
            bootstrapURLKeys={{ key: 'AIzaSyDq3l12LdJgNoCWDwMkMDaC4c_mEO7zHPI'}}
            defaultCenter={coords}
            center={coords}
            defaultZoom={8}
            margin={[50, 50, 50, 50]}
            onClick ={(e)=> handleClick(e)}
            weatherData={weatherData}
            >
                {
                    console.log(weatherData)
                }
            </GoogleMapReact>
                {county!="" && county != undefined && <BarChart
                county={county}
                />}
                {county!="" && county != undefined && <Tabular
                county={county}
                />}
                {county!="" && county != undefined && <BarHorizontalChart
                county={county}
                />}
                


        </div>

    );
};

export default Map;