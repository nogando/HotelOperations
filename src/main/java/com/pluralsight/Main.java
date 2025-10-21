package com.pluralsight;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Room> rooms = new ArrayList<>();

        Room r101 = new Room(1);
        Room r102 = new Room(2);
        Room r103 = new Room(2);
        Room r104 = new Room(2);

        rooms.add(r101);
        rooms.add(r102);
        rooms.add(r103);
        rooms.add(r104);

        for(Room r : rooms){
            System.out.println(r);
        }
        r101.checkIn();
        r102.checkIn();


        System.out.println();

        for(Room r : rooms){
            System.out.println(r);
        }

        r102.checkOut();

        System.out.println();

        for(Room r : rooms){
            System.out.println(r);
        }

    }
}