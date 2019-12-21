package com.sam_sec12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Theater {
    private final String name;
    private List<Seat> seats = new ArrayList<>();

    public Theater(String name, int numberRows, int seatsRow) {
        this.name = name;
        int lastRow = 'A' + (numberRows);
        for (char row = 'A'; row <= lastRow; row++) {
            for (int i = 1; i <= seatsRow; i++) {
                Seat seat = new Seat(row + String.format("%02d", i));
                seats.add(seat);
            }
        }
    }

    public void getSeats() {
        for(Seat s : seats)
            System.out.println(s.toString());
    }

    /**
     * @param seatNumber
     * @return boolean
     * reserve a seat - uses BinarySearch ( list of seats, requested seat )
     */
    public boolean reserveSeat(String seatNumber){
        Seat requestedSeat = new Seat(seatNumber);
        int foundSeat = Collections.binarySearch(seats, requestedSeat);
        if(foundSeat >= 0) {
            if(seats.get(foundSeat).isReserved()) {
                System.out.println("Sorry, seat is already taken");
                return false;
            }
            else{
                System.out.println("Seat " + requestedSeat.getNumber() + " reserved");
                seats.get(foundSeat).setReserved(true);
                return true;
            }
        }
        System.out.println("Seat not found");
        return false;
    }

    /**
     * this is an inner class that implements the Comparable interface type Seat
     */
    private class Seat implements Comparable <Seat> {
        private final String seat;
        private boolean isReserved;

        public Seat(String seat) {
            this.seat = seat;
            this.isReserved = false;
        }

        public String getNumber() {
            return seat;
        }

        public void setReserved(boolean reserved) {
            this.isReserved = reserved;
        }

        public boolean isReserved() {
            return isReserved;
        }

        /**
         * This method compares a given seat to the current object seat
         */
        @Override
        public int compareTo(Seat seat) {
            return this.seat.compareToIgnoreCase(seat.getNumber()); //compareToIgnoreCase ignores uppercase and lowercase
        }

        @Override
        public String toString() {
            return "Seat='" + seat + '\'' +
                    "Reserved=" + isReserved;
        }
    }
}
