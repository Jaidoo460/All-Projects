package com.techelevator.hotels.services;

import com.techelevator.hotels.model.Alert;
import org.springframework.web.client.RestTemplate;

public class WeatherService {

    private RestTemplate restTemplate = new RestTemplate();

    public static final String API_BASE_URL = "https://api.weather.gov/";

    public Alert getAlertByState(String stateCode){

        Alert result = restTemplate.getForObject(API_BASE_URL + "alert")
    }
}
