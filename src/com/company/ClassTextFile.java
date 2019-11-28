package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ClassTextFile {
    private String file1 = "Input.txt";
    ClassTextFile (String filePath) {
        try {
            if (!new File(file1).createNewFile())
                System.out.println("File already exists!");
            else
                this.file1 = file1;
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    Tour setTestInfo() throws FileNotFoundException {
        Scanner inT = new Scanner(new FileReader(file1));
        int pts = inT.nextInt();
        return new Tour(inT.nextLine(), inT.nextLine(), inT.nextLine(), inT.nextLine(), inT.nextInt(), inT.nextInt(), inT.nextInt(), inT.nextInt(), inT.nextLine());
    }

}
