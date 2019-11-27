package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileControl {
    public static void addTour() throws IOException {
        File file1 = new File("TourList.txt");
        DataOutputStream outT = new DataOutputStream(new FileOutputStream(file1.getAbsolutePath(), true));
        Scanner sc = new Scanner(System.in, "cp1251");
        try {
            System.out.print("Enter tour name: ");
            outT.writeUTF(sc.nextLine());
            System.out.print("Enter country: ");
            outT.writeUTF(sc.nextLine());
            System.out.print("Enter city: ");
            outT.writeUTF(sc.nextLine());
            System.out.print("Enter hotel name: ");
            outT.writeUTF(sc.nextLine());
            System.out.print("Enter number of hotel stars: ");
            outT.writeInt(sc.nextInt());
            System.out.print("Enter length of the tour in days: ");
            outT.writeInt(sc.nextInt());
            System.out.print("Enter number of excursions: ");
            outT.writeInt(sc.nextInt());
            System.out.print("Enter price of the tour: ");
            outT.writeInt(sc.nextInt());
            System.out.print("Enter tour company name: ");
            outT.writeUTF(sc.next());

            outT.flush();
            outT.close();
//            DataInputStream inT = new DataInputStream(new FileInputStream(file1.getAbsolutePath()));
//            System.out.println(inT.readUTF() + inT.readUTF() + inT.readUTF() + inT.readUTF() + inT.readInt() + inT.readInt() + inT.readInt() + inT.readInt() + inT.readUTF());

        }
        catch (IOException e) {
            System.out.println(e);
        }
    }

    public static void outputTourList() throws IOException {
        File file1 = new File("TourList.txt");
        List<Tour> tours = new ArrayList<Tour>();
        DataInputStream inT = new DataInputStream(new FileInputStream(file1.getAbsolutePath()));
        try{
            Tour current;
            while(true){
                current = new Tour(inT.readUTF(), inT.readUTF(), inT.readUTF(), inT.readUTF(), inT.readInt(), inT.readInt(), inT.readInt(), inT.readInt(), inT.readUTF());
                tours.add(current);
            }
        }catch(IOException e){
        }
        finally {
            if (tours.size() > 0) {
                for (int i = 0; i < tours.size(); i++) {
                    System.out.println((i + 1) + ". " + tours.get(i).getTourName());
                }
            }
            inT.close();
        }
    }

    public static void deleteTour() throws IOException, IndexOutOfBoundsException {
        File file1 = new File("TourList.txt");
        List<Tour> tours = new ArrayList<Tour>();
        Scanner sc = new Scanner(System.in, "cp1251");
        DataInputStream inT = new DataInputStream(new FileInputStream(file1.getAbsolutePath()));
        System.out.print("Enter the number of tour you want to delete: ");
        int n = sc.nextInt();
        try{
            Tour current;
            while(true){
                current = new Tour(inT.readUTF(), inT.readUTF(), inT.readUTF(), inT.readUTF(), inT.readInt(), inT.readInt(), inT.readInt(), inT.readInt(), inT.readUTF());
                tours.add(current);
            }
        }catch(IOException e){
        }
        finally {
            DataOutputStream outT = new DataOutputStream(new FileOutputStream(file1.getAbsolutePath()));
            tours.remove(n - 1);
            for (int i = 0; i < tours.size(); i++) {
                outT.writeUTF(tours.get(i).getTourName());
                outT.writeUTF(tours.get(i).getCountry());
                outT.writeUTF(tours.get(i).getCity());
                outT.writeUTF(tours.get(i).getHotelName());
                outT.writeInt(tours.get(i).getHotelStar());
                outT.writeInt(tours.get(i).getDays());
                outT.writeInt(tours.get(i).getExcursionNum());
                outT.writeInt(tours.get(i).getTourPrice());
                outT.writeUTF(tours.get(i).getTourCompany());
            }
            System.out.println("Tour was successfully deleted");
            outT.flush();
            outT.close();
            inT.close();
        }
    }

    public static void tourLocation() throws IOException {
        File file1 = new File("TourList.txt");
        List<Tour> tours = new ArrayList<Tour>();
        DataInputStream inT = new DataInputStream(new FileInputStream(file1.getAbsolutePath()));
        Scanner sc = new Scanner(System.in, "cp1251");
        System.out.println("Enter the name of the tour to know the city and the country: ");
        String target = sc.nextLine();
        try{
            Tour current;
            while(true){
                current = new Tour(inT.readUTF(), inT.readUTF(), inT.readUTF(), inT.readUTF(), inT.readInt(), inT.readInt(), inT.readInt(), inT.readInt(), inT.readUTF());
                tours.add(current);
            }
        }catch(IOException e){
        }
        finally {
            if (tours.size() > 0) {
                for (int i = 0; i < tours.size(); i++) {
                    if (tours.get(i).getTourName().equals(target)) {
                        System.out.println("City: " + tours.get(i).getCity());
                        System.out.println("Country: " + tours.get(i).getCountry());
                    }
                }
            }
            inT.close();
        }
    }

    public static void priceEq() throws IOException {
        File file1 = new File("TourList.txt");
        List<Tour> tours = new ArrayList<Tour>();
        DataInputStream inT = new DataInputStream(new FileInputStream(file1.getAbsolutePath()));
        Scanner sc = new Scanner(System.in, "cp1251");
        System.out.print("Enter the number of the first tour which price you want to compare: ");
        int target1 = sc.nextInt();
        System.out.print("Enter the number of the second tour which price you want to compare: ");
        int target2 = sc.nextInt();
        try{
            Tour current;
            while(true){
                current = new Tour(inT.readUTF(), inT.readUTF(), inT.readUTF(), inT.readUTF(), inT.readInt(), inT.readInt(), inT.readInt(), inT.readInt(), inT.readUTF());
                tours.add(current);
            }
        }catch(IOException e){
        }
        finally {
            if (target1 > 0 && target2 > 0 && target1 <= tours.size() && target2 <= tours.size()) {
                if (tours.get(target1 - 1).getTourPrice() == tours.get(target2 - 1).getTourPrice()) {
                    System.out.println("The prices are equal");
                } else {
                    System.out.println("Prices are not equal");
                }
            } else {
                System.out.println("Invalid number");
            }
        }
    }

    public static void tourCompanyList() throws IOException {
        File file1 = new File("TourList.txt");
        List<Tour> tours = new ArrayList<Tour>();
        DataInputStream inT = new DataInputStream(new FileInputStream(file1.getAbsolutePath()));
        Scanner sc = new Scanner(System.in, "cp1251");
        System.out.print("Enter tour company name: ");
        String target = sc.nextLine();
        try{
            Tour current;
            while(true){
                current = new Tour(inT.readUTF(), inT.readUTF(), inT.readUTF(), inT.readUTF(), inT.readInt(), inT.readInt(), inT.readInt(), inT.readInt(), inT.readUTF());
                tours.add(current);
            }
        }catch(IOException e){
        }
        finally {
            List<Tour> company = new ArrayList<Tour>();
            for (int i = 0; i < tours.size(); i++) {
                if (tours.get(i).getTourCompany().equals(target)) {
                    company.add(tours.get(i));
                }
            }
            for (int i = 0; i < company.size(); i++) {
                System.out.println((i + 1) + ". " + company.get(i).getTourName());
            }
            inT.close();
        }
    }

    public static void priceIncrease() throws IOException, IndexOutOfBoundsException {
        File file1 = new File("TourList.txt");
        List<Tour> tours = new ArrayList<Tour>();
        Scanner sc = new Scanner(System.in, "cp1251");
        DataInputStream inT = new DataInputStream(new FileInputStream(file1.getAbsolutePath()));
        System.out.print("Enter the number of tour which price you want to increase by 10%: ");
        int n = sc.nextInt();
        try{
            Tour current;
            while(true){
                current = new Tour(inT.readUTF(), inT.readUTF(), inT.readUTF(), inT.readUTF(), inT.readInt(), inT.readInt(), inT.readInt(), inT.readInt(), inT.readUTF());
                tours.add(current);
            }
        }catch(IOException e){
        }
        finally {
            DataOutputStream outT = new DataOutputStream(new FileOutputStream(file1.getAbsolutePath()));
            for (int i = 0; i < tours.size(); i++) {
                outT.writeUTF(tours.get(i).getTourName());
                outT.writeUTF(tours.get(i).getCountry());
                outT.writeUTF(tours.get(i).getCity());
                outT.writeUTF(tours.get(i).getHotelName());
                outT.writeInt(tours.get(i).getHotelStar());
                outT.writeInt(tours.get(i).getDays());
                outT.writeInt(tours.get(i).getExcursionNum());
                if (i == n - 1) {
                    outT.writeInt((int)(tours.get(i).getTourPrice() * 1.1));
                }
                else{
                    outT.writeInt(tours.get(i).getTourPrice());
                }
                outT.writeUTF(tours.get(i).getTourCompany());
            }
            outT.flush();
            outT.close();
            System.out.println("Tour was successfully deleted");
            inT.close();
        }
    }


}
