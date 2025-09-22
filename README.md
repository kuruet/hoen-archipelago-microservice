Hoen Archipelago Microservice

A Dropwizard microservice providing hotel and car rental search functionality for the Hoen Archipelago. This service is designed to be a lightweight, modular component that could integrate with a platform like Skyscanner.

Table of Contents

Overview

Features

Technologies

Project Structure

Setup & Running

API Endpoints

Sample Data

Example Response

Future Improvements

Overview

The Hoen Archipelago has recently gained international attention for its unique fauna and tourist appeal. This microservice manages searches for hotels and car rental services in the region.

Users can search by city name.

Returns available hotels and car rentals in that city.

Built as a Dropwizard microservice for lightweight and independent deployment.

Features

RESTful search endpoint for hotels and car rentals.

Sample data included for demonstration.

Fully modular structure for easy future extension.

JSON-based response for easy integration with other services.

Technologies

Java 11 – programming language

Dropwizard 2.x – microservice framework

Jackson – JSON serialization/deserialization

Maven – project management & build tool

Project Structure
hoen-archipelago-microservice/
│
├─ pom.xml
├─ README.md
└─ src/
    └─ main/
        ├─ java/
        │   └─ com/skyscanner/
        │       ├─ HoenServiceApplication.java
        │       ├─ HoenServiceConfiguration.java
        │       ├─ api/SearchResource.java
        │       └─ model/
        │           ├─ Hotel.java
        │           └─ CarRental.java
        └─ resources/
            ├─ hotels.json
            └─ cars.json

Setup & Running
Prerequisites

Java 11 or higher

Maven 3.x

Steps

Clone the repository:

git clone https://github.com/kuruet/hoen-archipelago-microservice.git
cd hoen-archipelago-microservice


Build the project:

mvn clean package


Run the microservice:

java -jar target/hoen-archipelago-microservice-1.0-SNAPSHOT.jar server


The service will start on localhost:8080 by default.

API Endpoints
1. Search

URL: /search
Method: GET
Query Parameter:

city – The city name to search for hotels and car rentals

Example Request:

GET http://localhost:8080/search?city=Port%20Sibil


Response:

{
  "hotels": [
    {
      "name": "Hoen Bay Resort",
      "city": "Port Sibil",
      "price": 120.0
    }
  ],
  "carRentals": [
    {
      "name": "Hoen Cars",
      "city": "Port Sibil",
      "pricePerDay": 35.0
    }
  ]
}

Sample Data

Hotels: src/main/resources/hotels.json

Car Rentals: src/main/resources/cars.json

You can replace these JSON files with real data in the future.

Future Improvements

Add database integration instead of static JSON.

Implement search by additional filters (price range, rating, availability).

Add unit and integration tests for production readiness.

Extend to support multiple languages or currencies.
