package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ClassTextFile {
    private String file1 = "Input.txt";
    ClassTextFile (String file1) {
        try {
            if (!new File(file1).createNewFile())
                System.out.println("File already exists!");
            else
                this.file1 = file1;
        } catch (IOException e) {
        }
    }

    Object setTourInfo() throws FileNotFoundException {
        Scanner inT = new Scanner(new FileReader(file1));
        String tourName = inT.nextLine();
        String country = inT.nextLine();
        String city = inT.nextLine();
        String hotelName = inT.nextLine();
        int hotelStar = inT.nextInt();
        int days = inT.nextInt();
        int excursionNum = inT.nextInt();
        int tourPrice = inT.nextInt();
        inT.nextLine();
        String tourCompany = inT.nextLine();
        return new Object(tourName, country, city, hotelName, hotelStar, days, excursionNum, tourPrice, tourCompany);
    }

}
