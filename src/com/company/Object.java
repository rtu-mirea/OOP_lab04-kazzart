package com.company;

import java.util.Scanner;

public class Object {
    private String tourName;
    private String country;
    private String city;
    private String hotelName;
    private int hotelStar;
    private int days;
    private int excursionNum;
    private int tourPrice;
    private String tourCompany;
    private Scanner sc = new Scanner(System.in);

    Object() {
    }

    Object(String tourName, String country, String city, String hotelName, int hotelStar, int days, int excursionNum, int tourPrice, String tourCompany) {
        this.tourName = tourName;
        this.country = country;
        this.city = city;
        this.hotelName = hotelName;
        this.hotelStar = hotelStar;
        this.days = days;
        this.excursionNum = excursionNum;
        this.tourPrice = tourPrice;
        this.tourCompany = tourCompany;
    }

    public void setTourPrice() {
        System.out.print("Enter tour price: ");
        this.tourPrice = sc.nextInt();
        sc.nextLine();
    }

    public void setTourName() {
        System.out.print("Enter tour name: ");
        this.tourName = sc.nextLine();
    }

    public void setTourCompany() {
        System.out.print("Enter tour company name: ");
        this.tourCompany = sc.nextLine();
    }

    public void setHotelStar() {
        System.out.print("Enter number of hotel stars: ");
        this.hotelStar = sc.nextInt();
    }

    public void setHotelName() {
        System.out.print("Enter hotel name: ");
        this.hotelName = sc.nextLine();
    }

    public void setExcursionNum() {
        System.out.print("Enter excursions number: ");
        this.excursionNum = sc.nextInt();
        sc.nextLine();
    }

    public void setDays() {
        System.out.print("Enter the length of the tour: ");
        this.days = sc.nextInt();
    }

    public void setCountry() {
        System.out.print("Enter country of the tour: ");
        this.country = sc.nextLine();
    }

    public void setCity() {
        System.out.print("Enter tour city: ");
        this.city = sc.nextLine();
    }

    public String getTourName() {
        return tourName;
    }

    public String getTourCompany() {
        return tourCompany;
    }

    public String getHotelName() {
        return hotelName;
    }

    public String getCountry() {
        return country;
    }

    public String getCity() {
        return city;
    }

    public int getTourPrice() {
        return tourPrice;
    }

    public int getHotelStar() {
        return hotelStar;
    }

    public int getExcursionNum() {
        return excursionNum;
    }

    public int getDays() {
        return days;
    }

}
