package com.techelevator.reservations.controllers;

import com.techelevator.reservations.dao.HotelDao;
import com.techelevator.reservations.dao.MemoryHotelDao;
import com.techelevator.reservations.dao.MemoryReservationDao;
import com.techelevator.reservations.dao.ReservationDao;
import com.techelevator.reservations.model.Hotel;
import com.techelevator.reservations.
import com.techelevator.reservations.model.Reservation;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;


@RestController
public class HotelController {

    private HotelDao hotelDao;
    private ReservationDao reservationDao;

    public HotelController() {
        this.hotelDao = new MemoryHotelDao();
        this.reservationDao = new MemoryReservationDao(hotelDao);
    }

    /**
     * Return All Hotels
     *
     * @return a list of all hotels in the system
     */
    @RequestMapping(path = "/hotels", method = RequestMethod.GET)
    public List<Hotel> list() {

        return hotelDao.list();
    }

    /**
     * Return hotel information
     *
     * @param id the id of the hotel
     * @return all info for a given hotel
     */
    @RequestMapping(path = "/hotels/{id}", method = RequestMethod.GET)
    public Hotel get(@PathVariable int id) {
        return hotelDao.get(id);
    }

    /**
     * Return All Reservations
     *
     * @return All Reservations
     */

    @RequestMapping(path = "/reservations", method = RequestMethod.GET)
    public List<Reservation> listReservations(){

        List<Reservation> result = new ArrayList<>();

        result = reservationDao.findAll();

        return result;
    }

    @RequestMapping(path="/reservations/{id}", method = RequestMethod.GET)
    public Reservation getReservationByID(@PathVariable int id){

        return reservationDao.get(id);
    }

    @RequestMapping(path="/hotels/{id}reservations", method=RequestMethod.GET)
    public List<Reservation> getHotelReservations(@PathVariable("id") int hotelId){

        return reservationDao.findByHotel(hotelId);
    }

    @RequestMapping(path="/reservations", method = RequestMethod.POST)
    public Reservation addReservation(RequestBody Reservation newReservation){

        return reservationDao.create(newReservation, newReservation.getHotelID());
    }

    /**
     * /hotels/filter?state=oh&city=cleveland
     *
     * @param state the state to filter by
     * @param city the city to filter by
     * @return a list of hotels that match the city & state
     */

    @RequestMapping(path = "/hotels/filter", method=RequestMethod.GET)
    public List<Hotel> hotelsFilteredByStateCity(@RequestParam String state, @RequestParam(required = false) String city){

        List<Hotel> filteredResults = new ArrayList<>();
        List<Hotel> allHotels = list();

        //process each hotel in allHotels, and add it to results if it matches by state and (optionally) city

        for ( Hotel hotel: allHotels){

            if(city != null){

                if(hotel.getAddress().getCity().equalsIgnoreCase(city) && hotel.getAddress().getState().equalsIgnoreCase(state)){
                    filteredResults.add(hotel);
                }
            }else{
                if (hotel.getAddress().getState().equalsIgnoreCase()) {
                    filteredResults.add(hotel).
                }
            }
        }

        return filteredResults;
    }
}
