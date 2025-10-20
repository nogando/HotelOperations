package com.pluralsight;

public class Room {

    private int numOfBeds;
    private double price;
    private boolean isOccupied;
    private boolean isDirty;

    public Room (int numOfBeds){
        this.numOfBeds = numOfBeds;
        this.price = 120.00;
        this.isOccupied = false;
        this.isDirty = false;
    }

    public boolean isDirty() {
        return isDirty;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public int getNumOfBeds() {
        return numOfBeds;
    }

    public double getPrice() {
        return price;
    }
    public  boolean isAvailable() {
//        if (isOccupied || isDirty) {
//            return false;
//        }

        return !(isOccupied && isDirty);

    }

    @Override
    public String toString() {
        return "Room{" +
                "numOfBeds=" + numOfBeds +
                ", price=" + price +
                ", isDirty=" + isDirty +
                ", isOccupied=" + isOccupied +
                ", isAvailable=" + isAvailable();
    }
}
