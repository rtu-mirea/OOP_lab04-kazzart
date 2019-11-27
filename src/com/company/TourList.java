package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class TourList {
    private ArrayList<Tour> tours;

    TourList() {
        tours = new ArrayList<Tour>();
    }

    public void addTour() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter tour name: ");
        String tourName = sc.nextLine();
        System.out.print("Enter country: ");
        String country = sc.nextLine();
        System.out.print("Enter city: ");
        String city = sc.nextLine();
        System.out.print("Enter hotel name: ");
        String hotelName = sc.nextLine();
        System.out.print("Enter number of hotel stars: ");
        int hotelStar = sc.nextInt();
        System.out.print("Enter length of the tour: ");
        int days = sc.nextInt();
        System.out.print("Enter number of excursions: ");
        int excursionNum = sc.nextInt();
        System.out.print("Enter price of the tour: ");
        int tourPrice = sc.nextInt();
        System.out.print("Enter tour company name: ");
        String tourCompany = sc.nextLine();
        tours.add(new Tour(tourName, country, city, hotelName, hotelStar, days, excursionNum, tourPrice, tourCompany));
    }

    public void showTour() {
        for (int i = 0; i < tours.size(); i++) {
            System.out.println((i + 1) + ". " + tours.get(i).getTourName());
        }
    }

    public void deleteTour() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter index of tour to remove");
        int n = sc.nextInt();
        if (tours.size() >= n) {
            tours.remove(n + 1);
        } else {
            System.out.println("Index out of range");
        }
    }
}
