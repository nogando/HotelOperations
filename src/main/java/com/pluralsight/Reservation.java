package com.pluralsight;

public class Reservation {

    private String roomType;
    private int numOfNights;
    private boolean isWeekend;





    public boolean isWeekend() {
        return isWeekend;
    }

    public void setIsWeekend(boolean weekend) {
        isWeekend = weekend;
    }

    public int getNumOfNights() {
        return numOfNights;
    }

    public void setNumOfNights(int numOfNights) {
        this.numOfNights = numOfNights;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public double getPrice(){
//        The room type can be either "king" or "double". If the room type is "king" the
//        price per night is $139.00 if the room type is "double" the price per night is
//        $124.00
        double basePrice;
        if (roomType.equalsIgnoreCase("king")){
            basePrice = 139;

        } else if (roomType.equalsIgnoreCase("double")) {
            basePrice = 124;

        }
        else {
            return 0;
            //todo: this should never really happen maybe throw an exception instead?
        }
        if(isWeekend){
            return basePrice * 1.10;

        }
        else{
            return basePrice;
        }

    }

    public double getReservationTotal(){
        return  getPrice() * numOfNights;
    }
}
