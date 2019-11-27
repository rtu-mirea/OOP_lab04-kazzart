package com.company;

public class Tour {
    private String tourName;
    private String country;
    private String city;
    private String hotelName;
    private int hotelStar;
    private int days;
    private int excursionNum;
    private int tourPrice;
    private String tourCompany;

    Tour(String tourName, String country, String city, String hotelName, int hotelStar, int days, int excursionNum,
         int tourPrice, String tourCompany) {
        this.setTourName(tourName);
        this.setCountry(country);
        this.setCity(city);
        this.setHotelName(hotelName);
        this.setHotelStar(hotelStar);
        this.setDays(days);
        this.setExcursionNum(excursionNum);
        this.setTourPrice(tourPrice);
        this.setTourCompany(tourCompany);
    }

    public int getDays() {
        return days;
    }

    public int getExcursionNum() {
        return excursionNum;
    }

    public int getHotelStar() {
        return hotelStar;
    }

    public int getTourPrice() {
        return tourPrice;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public String getHotelName() {
        return hotelName;
    }

    public String getTourCompany() {
        return tourCompany;
    }

    public String getTourName() {
        return tourName;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public void setExcursionNum(int excursionNum) {
        this.excursionNum = excursionNum;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public void setHotelStar(int hotelStar) {
        this.hotelStar = hotelStar;
    }

    public void setTourCompany(String tourCompany) {
        this.tourCompany = tourCompany;
    }

    public void setTourName(String tourName) {
        this.tourName = tourName;
    }

    public void setTourPrice(int tourPrice) {
        this.tourPrice = tourPrice;
    }
}
