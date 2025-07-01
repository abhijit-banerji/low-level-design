package org.example;

public class Bidder implements Colleague{

    String name;
    AuctionMediator auctionMediator;

    Bidder(String name, AuctionMediator mediator) {
        this.name = name;
        this.auctionMediator = mediator;
        auctionMediator.addBidder(this);
    }

    @Override
    public void placeBid(int bidAmount) {
        auctionMediator.placeBid(this, bidAmount);
    }

    @Override
    public void receiveBidNotification(int bidAmount) {
        System.out.println("Dear Bidder : " + name + " - Please note, someone has put a bid of " + bidAmount);
    }

    @Override
    public String getName() {
        return name;
    }
}
