package com.xworkz.assignments.things;

public class Party {
    private String partyName;
    private String location;
    private String date;
    private int attendees;
    private boolean isIndoor;
    private boolean isFormal;
    private boolean isMusicPlaying;
    private int rating;

    public void startParty() {
        System.out.println("Party started!");
    }

    public void endParty() {
        System.out.println("Party ended!");
    }

    public void inviteGuest() {
        System.out.println("Inviting guest method.");
    }

    public void serveFood() {
        System.out.println("Serving food at the party.");
    }

    public void playMusic() {
        System.out.println("Playing music at the party.");
    }

    public Party() {
        System.out.println("No-argument constructor.");
        System.out.println("---------------------------------------");
    }

    public Party(String partyName, String location, String date, int attendees, boolean isIndoor,
                 boolean isFormal, boolean isMusicPlaying, int rating) {
        this.partyName = partyName;
        this.location = location;
        this.date = date;
        this.attendees = attendees;
        this.isIndoor = isIndoor;
        this.isFormal = isFormal;
        this.isMusicPlaying = isMusicPlaying;
        this.rating = rating;
        System.out.println("All-argument constructor.");
        System.out.println("Party Name: " + this.partyName + ", Location: " + this.location +
                ", Date: " + this.date + ", Attendees: " + this.attendees + ", Is Indoor? " +
                this.isIndoor + ", Is Formal? " + this.isFormal + ", Is Music Playing? " +
                this.isMusicPlaying + ", Rating: " + this.rating);
    }

    public void setPartyName(String partyName) {
        this.partyName = partyName;
    }

    public String getPartyName() {
        return this.partyName;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getLocation() {
        return this.location;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDate() {
        return this.date;
    }

    public void setAttendees(int attendees) {
        this.attendees = attendees;
    }

    public int getAttendees() {
        return this.attendees;
    }

    public void setIndoor(boolean isIndoor) {
        this.isIndoor = isIndoor;
    }

    public boolean isIndoor() {
        return this.isIndoor;
    }

    public void setFormal(boolean isFormal) {
        this.isFormal = isFormal;
    }

    public boolean isFormal() {
        return this.isFormal;
    }

    public void setMusicPlaying(boolean isMusicPlaying) {
        this.isMusicPlaying = isMusicPlaying;
    }

    public boolean isMusicPlaying() {
        return this.isMusicPlaying;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getRating() {
        return this.rating;
    }
}
