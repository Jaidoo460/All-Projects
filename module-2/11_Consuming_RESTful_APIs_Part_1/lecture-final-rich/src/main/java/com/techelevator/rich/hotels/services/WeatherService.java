package com.techelevator.rich.hotels.services;

import com.techelevator.rich.hotels.model.Alert;
import org.springframework.web.client.RestTemplate;

public class WeatherService {

    private RestTemplate restTemplate = new RestTemplate();

    public static final String API_BASE_URL = "https://api.weather.gov/";

    public Alert getAlertByState(String stateCode){

        Alert result = restTemplate.getForObject(API_BASE_URL + "alerts/active?area=" + stateCode, Alert.class);

        return result;


    }

}
