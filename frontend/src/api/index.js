import axios from 'axios';

// export const getWeatherData = async (lat,lng)=> {

//     try{
//         const {data} = await axios.get(`https://api.openweathermap.org/data/3.0/onecall?`,{
//         params:{
//             lat:lat,
//             lng:lng
//         },  
//         headers: {
//                 'X-RapidAPI-Key': 'ded30534e9c0ac67f44b45dc36aa10a9',
//               }
//         });

//         return data;
//     }catch(error){
//         console.log(error)
//     }
// }


export const getCountyData = async (lat,lng)=>{
    try{
        
    const {data}= await axios.get('https://geo.fcc.gov/api/census/area?lat='+lat+'lon='+lng+'&censusYear=2020&format=json');
    console.log(data);
    return data;
}catch(error){
    console.log(error);
}
}