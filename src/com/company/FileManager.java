package com.company;
import java.util.Scanner;

public class FileManager {
    private int testNumber;
    private int maximumPoints;
    private int level;
    private String theme;
    private Scanner in = new Scanner(System.in);
    FileManager () {}

    FileManager(int testNumber, int numberOfQuestions, int maximumPoints, int level, String theme) {
        this.testNumber = testNumber;
        this.maximumPoints = maximumPoints;
        this.level = level;
        this.theme = theme;
    }

    void setTestNumber() {
        System.out.println("Enter test's number:");
        this.testNumber = in.nextInt();
    }

    void setLevel() {
        System.out.println("Enter test's level:");
        this.level = in.nextInt();
    }

    void setMaximumPoints() {
        System.out.println("Enter test's maximum points:");
        this.maximumPoints = in.nextInt();
    }

    void setTheme() {
        System.out.println("Enter test's theme:");
        this.theme = in.next();
    }

    String getTheme() {
        return theme;
    }

    int getLevel() {
        return level;
    }

    int getTestNumber() {
        return testNumber;
    }

    int getMaximumPoints() {
        return maximumPoints;
    }

    public FileManager getObject() {
        return this;
    }
}