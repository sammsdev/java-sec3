package com.sam_sec12;

import java.util.ArrayList;
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

    public void reserveSeat(String seatNumber) {
        for(Seat s : seats)
            if(s.getSeat().equals(seatNumber)) {
               if(!s.isReserverd()){
                   s.isReserverd = true;
               }
            }

    }

    private class Seat {
        private final String seat;
        private boolean isReserverd;

        public Seat(String seat) {
            this.seat = seat;
            this.isReserverd = false;
        }

        public String getSeat() {
            return this.seat;
        }

        public boolean isReserverd() {
            return this.isReserverd;
        }

        @Override
        public String toString() {
            return "Seat='" + seat + '\'' +
                    "Reserved=" + isReserverd;

        }
    }


}
