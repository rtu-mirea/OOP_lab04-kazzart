package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class ObjectSerialization {
    String file1 = "C:\\Education\\University\\OOP\\Labs\\Lab4\\Serialization.bin";
    String file2 = "C:\\Education\\University\\OOP\\Labs\\Lab4\\SerializationCol.bin";
    private ArrayList<Object> tours = new ArrayList<Object>();

    ObjectSerialization(String file1) throws IOException {
        try {
            if (!new File(file1).createNewFile()) {
                System.out.println("File already exists!");
            } else {
                this.file1 = file1;
            }
        } catch(IOException e) {}
    }

    public void outputTour() throws IOException {
        Object output = new Object();
        output.setTourName();
        output.setCity();
        output.setCountry();
        output.setDays();
        output.setExcursionNum();
        output.setHotelName();
        output.setHotelStar();
        output.setTourPrice();
        output.setTourCompany();

        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file1));
        out.writeUTF(output.getTourName());
        out.writeUTF(output.getCountry());
        out.writeUTF(output.getCity());
        out.writeUTF(output.getHotelName());
        out.writeInt(output.getHotelStar());
        out.writeInt(output.getDays());
        out.writeInt(output.getExcursionNum());
        out.writeInt(output.getTourPrice());
        out.writeUTF(output.getTourCompany());

        out.close();
    }

    void inputTour () throws IOException {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream(file1));

        int pts = in.readInt();
        Tour input = new Tour(in.readUTF(), in.readUTF(), in.readUTF(), in.readUTF(), in.readInt(), in.readInt(), in.readInt(), in.readInt(), in.readUTF());

        System.out.println("Info about a test: "+input.getTourName()+" "+input.getCountry()+" "+input.getCity()
                +" "+input.getHotelName()+" "+input.getHotelStar()+" "+input.getDays()+" "+input.getExcursionNum()
                +" "+input.getTourPrice()+" "+input.getTourCompany());
        in.close();
    }

    public void addToCollection() {
        Scanner in = new Scanner(System.in);
        System.out.println("How many tests you want to add?");
        int num = in.nextInt();
        for (int i = 0; i < num; i++) {
            Object t = new Object();
            t.setTourName();
            t.setCountry();
            t.setCity();
            t.setHotelName();
            t.setHotelStar();
            t.setDays();
            t.setExcursionNum();
            t.setTourPrice();
            t.setTourCompany();
            tours.add(t);
        }
    }

    public void outputCollection() throws IOException {
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file2));
        for (Object t: tours) {
            out.writeUTF(t.getTourName());
            out.writeUTF(t.getCountry());
            out.writeUTF(t.getCity());
            out.writeUTF(t.getHotelName());
            out.writeInt(t.getHotelStar());
            out.writeInt(t.getDays());
            out.writeInt(t.getExcursionNum());
            out.writeInt(t.getTourPrice());
            out.writeUTF(t.getTourCompany());
        }

        out.close();
    }

    void inputCollection() throws IOException {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream(file2));
        int pts;

        tours.clear();
        while(true) {
            try {
                pts = in.readInt();
                tours.add(new Object(in.readUTF(), in.readUTF(), in.readUTF(), in.readUTF(), in.readInt(), in.readInt(), in.readInt(), in.readInt(), in.readUTF()));
            } catch (EOFException e) {
                in.close();
                break;
            }
        }
    }

    void printCollection() {
        for (Object t : tours) {
            System.out.println(t.getTourName()+" "+t.getCountry()+" "+t.getCity()
                    +" "+t.getHotelName()+" "+t.getHotelStar()+" "+t.getDays()+" "+t.getExcursionNum()
                    +" "+t.getTourPrice()+" "+t.getTourCompany());
        }
    }

    ObjectSerialization getObject() {
        return this;
    }

    ArrayList<Object> getCollection() {
        return tours;
    }
}
