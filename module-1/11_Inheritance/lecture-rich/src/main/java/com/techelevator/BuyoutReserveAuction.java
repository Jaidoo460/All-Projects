package com.techelevator;

public class BuyoutReserveAuction extends BuyoutAuction{

    private int reservePrice;

    public int getReservePrice() {
        return reservePrice;
    }

    public BuyoutReserveAuction(String itemForSale, int reservePrice, int buyoutPrice){

        super(itemForSale, buyoutPrice);
        this.reservePrice = reservePrice;

    }

    @Override
    public boolean placeBid(Bid offeredBid){
        boolean isCurrentWinningBid = false;

        if(offeredBid.getBidAmount() >= this.reservePrice){

            isCurrentWinningBid = super.placeBid(offeredBid);

        }

        return isCurrentWinningBid;
    }

}
