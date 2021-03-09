package com.example.groupproject.Model;

public class BookingData {
    private String movieTitle;
    private String showingDate;
    private String showingTime;
    private String seatNumber;
    private String foodAndBeverage;

    public BookingData() {
    }

    public BookingData(String movieTitle, String showingDate, String showingTime, String seatNumber, String foodAndBeverage) {
        this.movieTitle = movieTitle;
        this.showingDate = showingDate;
        this.showingTime = showingTime;
        this.seatNumber = seatNumber;
        this.foodAndBeverage = foodAndBeverage;
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }

    public String getShowingDate() {
        return showingDate;
    }

    public void setShowingDate(String showingDate) {
        this.showingDate = showingDate;
    }

    public String getShowingTime() {
        return showingTime;
    }

    public void setShowingTime(String showingTime) {
        this.showingTime = showingTime;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public String getFoodAndBeverage() {
        return foodAndBeverage;
    }

    public void setFoodAndBeverage(String foodAndBeverage) {
        this.foodAndBeverage = foodAndBeverage;
    }
}

