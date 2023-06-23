package com.xworkz.assignments.things;

public class Telegram {
    private String username;
    private String phoneNumber;
    private String bio;
    private int totalMessages;
    private boolean isOnline;
    private boolean isVerified;
    private boolean isMuted;
    private int rating;

    public void sendMessage() {
        System.out.println("Sending message method.");
    }

    public void receiveMessage() {
        System.out.println("Received message method");
    }

    public void blockUser() {
        System.out.println("Blocking user method.");
    }

    public void unblockUser() {
        System.out.println("Unblocking user method.");
    }

    public void changeProfilePicture() {
        System.out.println("Changing profile picture method.");
    }

    public Telegram() {
        System.out.println("No-argument constructor.");
        System.out.println("---------------------------------------");
    }

    public Telegram(String username, String phoneNumber, String bio, int totalMessages, boolean isOnline,
                    boolean isVerified, boolean isMuted, int rating) {
        this.username = username;
        this.phoneNumber = phoneNumber;
        this.bio = bio;
        this.totalMessages = totalMessages;
        this.isOnline = isOnline;
        this.isVerified = isVerified;
        this.isMuted = isMuted;
        this.rating = rating;
        System.out.println("All-argument constructor.");
        System.out.println("Username: " + this.username + ", Phone Number: " + this.phoneNumber +
                ", Bio: " + this.bio + ", Total Messages: " + this.totalMessages + ", Is Online? " +
                this.isOnline + ", Is Verified? " + this.isVerified + ", Is Muted? " + this.isMuted +
                ", Rating: " + this.rating);
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return this.username;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getBio() {
        return this.bio;
    }

    public void setTotalMessages(int totalMessages) {
        this.totalMessages = totalMessages;
    }

    public int getTotalMessages() {
        return this.totalMessages;
    }

    public void setOnline(boolean isOnline) {
        this.isOnline = isOnline;
    }

    public boolean isOnline() {
        return this.isOnline;
    }

    public void setVerified(boolean isVerified) {
        this.isVerified = isVerified;
    }

    public boolean isVerified() {
        return this.isVerified;
    }

    public void setMuted(boolean isMuted) {
        this.isMuted = isMuted;
    }

    public boolean isMuted() {
        return this.isMuted;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getRating() {
        return this.rating;
    }
}

