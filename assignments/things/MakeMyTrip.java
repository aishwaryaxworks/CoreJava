package com.xworkz.assignments.things;

public class MakeMyTrip {
    private String destination;
    private String startDate;
    private String endDate;
    private int numberOfTravelers;
    private boolean isRoundTrip;
    private boolean isHotelBooking;
    private boolean isFlightBooking;
    private int rating;

    public void searchFlights() {
        System.out.println("Searching for flights...");
    }

    public void bookFlight() {
        System.out.println("Booking flight method.");
    }

    public void searchHotels() {
        System.out.println("Searching for hotels...");
    }

    public void bookHotel() {
        System.out.println("Booking hotel method.");
    }

    public void planItinerary() {
        System.out.println("Planning itinerary for the trip...");
    }

    public MakeMyTrip() {
        System.out.println("No-argument constructor.");
        System.out.println("---------------------------------------");
    }

    public MakeMyTrip(String destination, String startDate, String endDate, int numberOfTravelers,
                      boolean isRoundTrip, boolean isHotelBooking, boolean isFlightBooking, int rating) {
        this.destination = destination;
        this.startDate = startDate;
        this.endDate = endDate;
        this.numberOfTravelers = numberOfTravelers;
        this.isRoundTrip = isRoundTrip;
        this.isHotelBooking = isHotelBooking;
        this.isFlightBooking = isFlightBooking;
        this.rating = rating;
        System.out.println("All-argument constructor.");
        System.out.println("Destination: " + this.destination + ", Start Date: " + this.startDate +
                ", End Date: " + this.endDate + ", Number of Travelers: " + this.numberOfTravelers +
                ", Is Round Trip? " + this.isRoundTrip + ", Is Hotel Booking? " + this.isHotelBooking +
                ", Is Flight Booking? " + this.isFlightBooking + ", Rating: " + this.rating);
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDestination() {
        return this.destination;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getStartDate() {
        return this.startDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getEndDate() {
        return this.endDate;
    }

    public void setNumberOfTravelers(int numberOfTravelers) {
        this.numberOfTravelers = numberOfTravelers;
    }

    public int getNumberOfTravelers() {
        return this.numberOfTravelers;
    }

    public void setRoundTrip(boolean isRoundTrip) {
        this.isRoundTrip = isRoundTrip;
    }

    public boolean isRoundTrip() {
        return this.isRoundTrip;
    }

    public void setHotelBooking(boolean isHotelBooking) {
        this.isHotelBooking = isHotelBooking;
    }

    public boolean isHotelBooking() {
        return this.isHotelBooking;
    }

    public void setFlightBooking(boolean isFlightBooking) {
        this.isFlightBooking = isFlightBooking;
    }

    public boolean isFlightBooking() {
        return this.isFlightBooking;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getRating() {
        return this.rating;
    }
}

