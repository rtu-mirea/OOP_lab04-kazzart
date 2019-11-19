package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException, Exception, FileNotFoundException {
        try {
//          Упражнение 1 Исследовать возможности класса File по созданию файлов
//          (пустых) и папок программой. Применение конструктора и метода.
            File file1 = new File("MyFile1.txt");
            file1.createNewFile();
            File file2 = new File("MyFile2.txt");
            file2.createNewFile();
            File file3 = new File("C:\\Education\\University\\OOP\\Labs\\Lab4\\MyFile3.txt");
            file3.createNewFile();
            File file4 = new File("C:\\Education\\University\\OOP\\Labs\\Lab4\\MyDir1");
            file4.mkdirs();

//          Упражнение 2 Получить параметры файлов методами класса File.
            if (file1.isFile()) {
                System.out.println("File1 is a file");
            } else {
                System.out.println("File1 is not a file");
            }
            if (file2.isFile()) {
                System.out.println("File2 is a file");
            } else {
                System.out.println("File2 is not a file");
            }
            if (file3.isFile()) {
                System.out.println("File3 is a file");
            } else {
                System.out.println("File3 is not a file");
            }

            if (file4.isDirectory()) {
                System.out.println("File4 is a directory");
            } else {
                System.out.println("File4 is not a directory");
            }
            System.out.println();

            if (file1.getPath() == "MyFile1.txt"){
                System.out.println("MyFile1.txt is in the root folder");
            } else {
                System.out.println("MyFile1.txt is not in the root folder");
            }
            System.out.println();

            System.out.println(file1.getAbsolutePath());
            System.out.println(file2.getAbsolutePath());
            System.out.println(file3.getAbsolutePath());
            System.out.println(file4.getAbsolutePath());
            System.out.println();

            System.out.println("Size of the first file is " + file1.length() + " byte");
            System.out.println("Size of the second file is " + file2.length() + " byte");
            System.out.println("Size of the third file is " + file3.length() + " byte");
            System.out.println("Size of the folder is " + file4.length() + " byte");
            System.out.println();

//          Упражнение 3 Модификация файловой структуры приложения средствами
//          класса File.
            File file5 = new File("C:\\Education\\University\\OOP\\Labs\\Lab4\\MyDir2");
            file5.mkdirs();
            File root = new File("C:\\Education\\University\\OOP\\Labs\\Lab4");


            String[] array1 = root.list();
            System.out.println("Root folder consists of:");
            for (String f:array1) {
                System.out.println(f);
            }
            System.out.println();

            File[] array2 = root.listFiles();
            System.out.println("Root folder consists of:");
            int dirCount = 0;
            for (File f:array2) {
                System.out.println(f.getName());
                if (f.isDirectory()) {
                    dirCount++;
                }
            }            System.out.println();

            System.out.println("There is " + dirCount + " folders in the root folder");

            file1.delete();
            file2.delete();
            file3.delete();
            file4.delete();
            file5.delete();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}