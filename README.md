🌴 Hoen Archipelago Microservice

A Dropwizard microservice for searching hotels 🏨 and car rentals 🚗 in the Hoen Archipelago. Lightweight, modular, and ready for integration with platforms like Skyscanner!

📚 Table of Contents

Overview

Features ✨

Technologies 🛠️

Project Structure 🗂️

Setup & Running 🚀

API Documentation 📡

Sample Data 📁

Example Response 💬

Future Improvements 🔮

License 📝

🌟 Overview

The Hoen Archipelago has become a tourist hotspot 🐦🦎 thanks to its unique fauna.
This microservice handles searches for hotels and car rentals by city, returning results in JSON format.

Goals:

Lightweight & modular 🧩

Easy integration with other services 🔗

Demonstrates microservice architecture in Dropwizard ⚡

✨ Features

Search hotels 🏨 and car rentals 🚗 by city

JSON-based REST endpoint 🌐

Includes sample data for demonstration 📂

Modular & extendable structure for future growth 📈

🛠️ Technologies
Technology	Purpose
Java 11 ☕	Programming language
Dropwizard 2.x 🚀	Microservice framework
Jackson 🎨	JSON serialization/deserialization
Maven 📦	Build & dependency management
🗂️ Project Structure
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

🚀 Setup & Running
Prerequisites

Java 11+ ☕

Maven 3+ 📦

Clone the Repo
git clone https://github.com/kuruet/hoen-archipelago-microservice.git
cd hoen-archipelago-microservice

Build
mvn clean package

Run
java -jar target/hoen-archipelago-microservice-1.0-SNAPSHOT.jar server


Service runs at: http://localhost:8080 🌐

📡 API Documentation
Search Endpoint

URL: /search
Method: GET
Query Parameter:

city – Name of the city to search hotels 🏨 and car rentals 🚗

Example Request:

GET http://localhost:8080/search?city=Port%20Sibil


Example Response: 💬

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

📁 Sample Data

Located in src/main/resources:

hotels.json 🏨

cars.json 🚗

Tip: Replace with real data for production 🚀

🔮 Future Improvements

Replace static JSON with a database-backed search 🗄️

Add filters: price, rating, availability 🛎️

Unit & integration tests ✅

Multi-language & currency support 🌍

Swagger/OpenAPI documentation 📖

📝 License

MIT License © 2025 Kuruet
