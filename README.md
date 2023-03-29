# HackTX - Farm.ly

## Inspiration
Due to an increase in food demands led by many factors such as population increase, people opting for certain food items, etc, there is expected to be a huge crunch in food availability in the next few decades. To make sure we are ready for this type of situation, the changes in the system should be started now to get its effects delivered later. This problem was our start point, We tried to solve this problem by trying to tackle the root cause of everything, that is In-efficient Farming!

## What it does
Farm.ly is a web app which allows users to select a particular area on Google Maps i.e a particular county and provides the past trends of farming data obtained from USDA. The factors that we have considered for aiding the user to make optimized decisions regarding their farm are:
1. Weather of the area ( This includes rainfall and water availability)
2. Soil reports of the farm
3. Socio-economic factors:
   a) The top 5 most produced crops in that area
   b) The top 5 most sold produce in that area

### Workflow
1. The user opens the dashboard
2. The user selects the geolocation of their farm on the map
3. Weather is fetched for that lat-lang
4. The two Socio-economic surveys for that area are fetched from the backend
5. The user inputs their soil testing reports, which are then passed to the ML model trained on soil data to get the appropriate suggestion of the crop for the farm.
6. The user sees the dashboard populated with all these data in chart format and the suggestion for the crop for the farm.

## How we built it
We started with collecting the data for the features that we selected from various websites (Most of this was from the USDA website). The backend API's were developed in Java Spring. The frontend is in React and few other modules such as Tailwind and Chart.js. We built an ML model using the soil data and deployed it using Flask. We also integrated the Google Maps API.

## Challenges we ran into
1. Deployment on GCP
2. Faced difficulties in finding appropriate Data
3. Realtime data was not available
4. Integrating Google Maps API and getting the lat-lang on-click

## Accomplishments that we're proud of
1. First time using React framework for frontend development
2. Google Maps API usage

## What we learned
Basically, we got better in all the technologies that we used.

## What's next for Farm.ly
There are other factors such as availability, price and quality of seeds and labor cost of the farm.

## Built With
- Chart.js
- CSS3
- Flask
- GCP
- HTML5
- Java
- JavaScript
- React
- Scikit-Learn
- Spring
- Tailwind
