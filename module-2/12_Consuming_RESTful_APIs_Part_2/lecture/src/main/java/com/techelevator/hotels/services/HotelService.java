package com.techelevator.hotels.services;

import com.techelevator.hotels.model.Hotel;
import com.techelevator.hotels.model.Reservation;
import com.techelevator.util.BasicLogger;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;

import org.springframework.http.MediaType;
import org.springframework.web.client.ResourceAccessException;
import org.springframework.web.client.RestClientResponseException;
import org.springframework.web.client.RestTemplate;




public class HotelService {

    private static final String API_BASE_URL = "http://localhost:3000/";
    private final RestTemplate restTemplate = new RestTemplate();

    /**
     * Create a new reservation in the hotel reservation system
     */
    public Reservation addReservation(Reservation newReservation) {
        // TODO: Implement method

        //1: Define Headers Object
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        //2: Define Entity
        HttpEntity<Reservation> reservationEntity = new HttpEntity<>(newReservation, headers);

        //3: Make The Request
        Reservation createdReservation = null;

        String logEvent = "";

        try {
            //TODO: restTemplate Request Here

            createdReservation = restTemplate.postForObject(API_BASE_URL + "reservations", reservationEntity, Reservation.class);
        }

        //400 or 500 Series Response Status
        catch(RestClientResponseException rcrEx){

//            BasicLogger.log(rcrEx.getRawStatusCode() + ": " + rcrEx.getStatusText());
            logEvent = rcrEx.getRawStatusCode() + ": " + rcrEx.getStatusText();
        }
        //Server does not respond... for whatever reasons (wrong address, off-line, etc.)
        catch(ResourceAccessException raEx){

            logEvent = raEx.getCause().toString() + ": " + raEx.getLocalizedMessage();
        }
        finally{
           logEvent += "/n" + "Reservation for" + newReservation.getFullName() + "- Confirmation: " + ((createdReservation == null)?"FAILED":createdReservation.getId());
           BasicLogger.log(logEvent);
        }

        System.out.println("Reservation for " + newReservation.getFullName() + "- Confirmation: " + ((createdReservation == null)?"FAILED":createdReservation.getId()));

        return createdReservation;
    }

    /**
     * Updates an existing reservation by replacing the old one with a new
     * reservation
     */
    public boolean updateReservation(Reservation updatedReservation) {
        // TODO: Implement method
        Boolean result = false;
        //1. Define Headers
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        //2. Created Entity ( Building the Request)
        HttpEntity<Reservation> reservationEntity = new HttpEntity<>(updatedReservation, headers);

        //3. Send the request

        try{
            restTemplate.put(API_BASE_URL + "reservations/" + updatedReservation.getId(), reservationEntity);
            //If it doesn't throw an error, set update result to true to indicate success
            result = true;
        }
        catch (RestClientResponseException rcrEx){
            BasicLogger.log(rcrEx.getRawStatusCode() + ": " + rcrEx.getStatusText());
        }
        catch (ResourceAccessException raEx){
            BasicLogger.log(raEx.getMessage());
        }
        finally {
            return result;
        }
    }

    /**
     * Delete an existing reservation
     */
    public boolean deleteReservation(int id) {
        // TODO: Implement method

        Boolean result = false;

        try{
            restTemplate.delete(API_BASE_URL + "reservations/" + id);
            result = true;
        }
        catch(RestClientResponseException rcrEx){
            BasicLogger.log(rcrEx.getRawStatusCode() + ": " + rcrEx.getMessage());
        }
        catch (ResourceAccessException raEx){
            BasicLogger.log(raEx.getMessage());
        }
        finally{
            return result;
        }
    }

    /* DON'T MODIFY ANY METHODS BELOW */

    /**
     * List all hotels in the system
     */
    public Hotel[] listHotels() {
        Hotel[] hotels = null;
        try {
            hotels = restTemplate.getForObject(API_BASE_URL + "hotels", Hotel[].class);
        } catch (RestClientResponseException e) {
            // handles exceptions thrown by rest template and contains status codes
            BasicLogger.log(e.getRawStatusCode() + " : " + e.getStatusText());
        } catch (ResourceAccessException e) {
            // i/o error, ex: the server isn't running
            BasicLogger.log(e.getMessage());
        }
        return hotels;
    }

    /**
     * List all reservations in the hotel reservation system
     */
    public Reservation[] listReservations() {
        Reservation[] reservations = null;
        try {
            reservations = restTemplate.getForObject(API_BASE_URL + "reservations", Reservation[].class);
        } catch (RestClientResponseException e) {
            BasicLogger.log(e.getRawStatusCode() + " : " + e.getStatusText());
        } catch (ResourceAccessException e) {
            BasicLogger.log(e.getMessage());
        }
        return reservations;
    }

    /**
     * List all reservations by hotel id.
     */
    public Reservation[] listReservationsByHotel(int hotelId) {
        Reservation[] reservations = null;
        try {
            reservations = restTemplate.getForObject(API_BASE_URL + "hotels/" + hotelId + "/reservations", Reservation[].class);
        } catch (RestClientResponseException e) {
            BasicLogger.log(e.getRawStatusCode() + " : " + e.getStatusText());
        } catch (ResourceAccessException e) {
            BasicLogger.log(e.getMessage());
        }
        return reservations;
    }

    /**
     * Find a single reservation by the reservationId
     */
    public Reservation getReservation(int reservationId) {
        Reservation reservation = null;
        try {
            reservation = restTemplate.getForObject(API_BASE_URL + "reservations/" + reservationId, Reservation.class);
        } catch (RestClientResponseException e) {
            BasicLogger.log(e.getRawStatusCode() + " : " + e.getStatusText());
        } catch (ResourceAccessException e) {
            BasicLogger.log(e.getMessage());
        }
        return reservation;
    }

}