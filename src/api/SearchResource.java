package com.skyscanner.api;

import com.skyscanner.model.Hotel;
import com.skyscanner.model.CarRental;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Path("/search")
@Produces(MediaType.APPLICATION_JSON)
public class SearchResource {

    private List<Hotel> hotels = new ArrayList<>();
    private List<CarRental> carRentals = new ArrayList<>();

    public SearchResource() {
        // Sample hotels
        hotels.add(new Hotel("Hoen Bay Resort", "Port Sibil", 120.0));
        hotels.add(new Hotel("Archipelago Inn", "Luma Island", 90.0));

        // Sample car rentals
        carRentals.add(new CarRental("Hoen Cars", "Port Sibil", 35.0));
        carRentals.add(new CarRental("Island Wheels", "Luma Island", 40.0));
    }

    @GET
    public SearchResult search(@QueryParam("city") String city) {
        List<Hotel> matchedHotels = hotels.stream()
                .filter(h -> h.getCity().equalsIgnoreCase(city))
                .collect(Collectors.toList());

        List<CarRental> matchedCars = carRentals.stream()
                .filter(c -> c.getCity().equalsIgnoreCase(city))
                .collect(Collectors.toList());

        return new SearchResult(matchedHotels, matchedCars);
    }

    public static class SearchResult {
        private List<Hotel> hotels;
        private List<CarRental> carRentals;

        public SearchResult(List<Hotel> hotels, List<CarRental> carRentals) {
            this.hotels = hotels;
            this.carRentals = carRentals;
        }

        public List<Hotel> getHotels() { return hotels; }
        public List<CarRental> getCarRentals() { return carRentals; }
    }
}
