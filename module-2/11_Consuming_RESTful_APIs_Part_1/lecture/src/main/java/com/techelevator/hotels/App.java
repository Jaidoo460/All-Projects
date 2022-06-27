package com.techelevator.hotels;

import com.techelevator.hotels.model.Alert;
import com.techelevator.hotels.model.Hotel;
import com.techelevator.hotels.model.Review;
import com.techelevator.hotels.services.ConsoleService;
import com.techelevator.hotels.services.HotelService;
import com.techelevator.hotels.services.WeatherService;

public class App {

    private final ConsoleService consoleService = new ConsoleService();
    private final HotelService hotelService = new HotelService();

    public static void main(String[] args) {
        App app = new App();
        app.run();
    }

    private void run() {
        int menuSelection = -1;

        while (menuSelection != 0) {
            consoleService.printMainMenu();
            menuSelection = consoleService.promptForMenuSelection();
            if (menuSelection == 1) {
                Hotel[] hotels = hotelService.listHotels();
               consoleService.printHotels(hotels);

            } else if (menuSelection == 2) {

                consoleService.printReviews( hotelService.listReviews());

            } else if (menuSelection == 3) {

                consoleService.printHotel(hotelService.getHotelById(1));

        } else if (menuSelection == 4) {

                Review[] reviews = hotelService.getReviewsByHotelId(1);

                consoleService.printReviews(reviews);


        } else if (menuSelection == 5) {

                consoleService.printHotels( hotelService.getHotelsByStarRating(3) );

            } else if (menuSelection == 6) {

                WeatherService ws = new WeatherService();

                Alert selectedStateAlert = ws.getAlertByState("OH");

//                System.out.println( ws.getAlertByState("OH"));

//                System.out.println(selectedStateAlert);

                for(AlertFeature af : selectedStateAlert.getFeatures()){
                    System.out.println(af.getProperties().toString());
                }

            } else if (menuSelection == 0) {
                continue;
            } else {
                System.out.println("Invalid Selection");
            }
            consoleService.pause();
        }
    }

}
