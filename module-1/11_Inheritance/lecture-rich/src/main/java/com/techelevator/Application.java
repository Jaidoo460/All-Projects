package com.techelevator;

import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void main(String[] args) {

        // Create a new general auction
        System.out.println("Starting a general auction");
        System.out.println("-----------------");

        Auction generalAuction = new Auction("Tech Elevator t-shirt");

        Bid bid1 = new Bid("Josh", 1);
        generalAuction.placeBid(bid1);

        generalAuction.placeBid(new Bid("Josh", 1));

        generalAuction.placeBid(new Bid("Fonz", 23));
        generalAuction.placeBid(new Bid("Rick Astley", 13));
        //....
        //....
        // This might go on until the auction runs out of time or hits a max # of bids


        BuyoutAuction boAuction = new BuyoutAuction("TE Yeti Mug", 50);

        boAuction.placeBid( new Bid("Ed", 10));
        boAuction.placeBid( new Bid("Mary", 20));
        boAuction.placeBid( new Bid("Jenn", 45));
        boAuction.placeBid( new Bid("Bob", 55));
        boAuction.placeBid( new Bid("Dave", 60));

        ReserveAuction raAuction = new ReserveAuction("TE Hoodie", 25);

        raAuction.placeBid( new Bid("Bob", 15));
        raAuction.placeBid( new Bid("Mary", 27));
        raAuction.placeBid( new Bid("Jenn", 30));


        BuyoutReserveAuction braAuction = new BuyoutReserveAuction("TE Laptop", 275, 500);

        braAuction.placeBid(new Bid("Bob", 250));
        braAuction.placeBid(new Bid("Mary", 300));
        braAuction.placeBid(new Bid("Jenn", 375));
        braAuction.placeBid(new Bid("Dave", 501));
        braAuction.placeBid(new Bid("Kate", 525));


        List<Auction> allAuctions = new ArrayList<>();

        allAuctions.add(generalAuction);
        allAuctions.add(boAuction);
        allAuctions.add(raAuction);
        allAuctions.add(braAuction);


        for(Auction auction : allAuctions){
            System.out.println("******************");
            System.out.println(auction.getItemForSale());
            System.out.println("******************");
            System.out.println("Current Winner is: " + auction.getHighBid().getBidder());

            System.out.println("----- Bid History -----");

            for(Bid auctionBid : auction.getAllBids()){
                System.out.println(auctionBid.getBidder() + ": " + auctionBid.getBidAmount());
            }

            System.out.println();

        }

    }
}
