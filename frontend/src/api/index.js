import axios from 'axios';

export const getCountyData = async (lat,lng)=>{
    try{
        
    const {data}= await axios.get('https://geo.fcc.gov/api/census/area?lat='+lat+'lon='+lng+'&censusYear=2020&format=json');
    console.log(data);
    return data;
}catch(error){
    console.log(error);
}
}