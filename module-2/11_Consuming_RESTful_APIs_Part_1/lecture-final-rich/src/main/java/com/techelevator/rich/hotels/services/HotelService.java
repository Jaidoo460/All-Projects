package com.techelevator.rich.hotels.services;

import com.techelevator.rich.hotels.model.City;
import com.techelevator.rich.hotels.model.Hotel;
import com.techelevator.rich.hotels.model.Review;
import org.springframework.web.client.RestTemplate;

public class HotelService {

    private static final String API_BASE_URL = "http://localhost:3000/";
    private final RestTemplate restTemplate = new RestTemplate();

    public Hotel[] listHotels() {

        Hotel[] result;
        result = restTemplate.getForObject(API_BASE_URL + "hotels", Hotel[].class);

        return result;

    }

    public Review[] listReviews() {

        Review[] reviews = restTemplate.getForObject(API_BASE_URL + "reviews", Review[].class);

        return  reviews;

    }

    public Hotel getHotelById(int id) {

        Hotel result;

        result = restTemplate.getForObject(API_BASE_URL + "hotels/" + id, Hotel.class);

        return result;

    }

    public Review[] getReviewsByHotelId(int hotelID) {

        Review[] hotelReviews = restTemplate.getForObject(API_BASE_URL + "hotels/" + hotelID + "/reviews", Review[].class);

        return hotelReviews;

    }

    public Hotel[] getHotelsByStarRating(int stars) {

        Hotel[] ratedHotels = restTemplate.getForObject(API_BASE_URL + "hotels?stars=" + stars, Hotel[].class);

        return ratedHotels;

    }

    public City getWithCustomQuery(){
        return null;
    }

}
