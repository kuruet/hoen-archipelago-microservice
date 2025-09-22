package com.skyscanner.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CarRental {
    private String name;
    private String city;
    private double pricePerDay;

    public CarRental() {}

    public CarRental(String name, String city, double pricePerDay) {
        this.name = name;
        this.city = city;
        this.pricePerDay = pricePerDay;
    }

    @JsonProperty
    public String getName() { return name; }

    @JsonProperty
    public String getCity() { return city; }

    @JsonProperty
    public double getPricePerDay() { return pricePerDay; }
}
