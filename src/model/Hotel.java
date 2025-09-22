package com.skyscanner.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Hotel {
    private String name;
    private String city;
    private double price;

    public Hotel() {}

    public Hotel(String name, String city, double price) {
        this.name = name;
        this.city = city;
        this.price = price;
    }

    @JsonProperty
    public String getName() { return name; }

    @JsonProperty
    public String getCity() { return city; }

    @JsonProperty
    public double getPrice() { return price; }
}
