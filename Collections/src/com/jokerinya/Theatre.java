package com.jokerinya;

import java.util.*;

public class Theatre {
    private final String theatreName;
    private List<Seat> seats = new ArrayList<>();

    static final Comparator<Seat> PRICE_ORDER;
    static {  // will implement before the constructor
        PRICE_ORDER = new Comparator<Seat>() {
            @Override
            public int compare(Seat seat1, Seat seat2) {
                if (seat1.getPrice() < seat2.getPrice()){
                    return -1;
                } else if (seat1.getPrice() > seat2.getPrice()){
                    return 1;
                } else {
                    return 0;
                }
                // return Double.compare(seat1.getPrice(), seat2.getPrice()); // same
            }
        };
    }


    public Theatre(String theatreName, int numRows, int seatsPerRow) {
        this.theatreName = theatreName;

        int lastRow = 'A' + (numRows-1); // gives a char actually
        for (char row = 'A';  row<=lastRow ; row++) {
            for (int seatNum = 1; seatNum <= seatsPerRow; seatNum++) {
                double price = 12.00;
                if (row< 'D' && (seatNum>=4 && seatNum<=9)){
                    price = 14.00;
                } else if (row>'F' || (seatNum<4 || seatNum > 9)) {
                    price = 7.00;
                }
                Seat seat = new Seat(row + String.format("%02d", seatNum), price);  // 2 -> 02 , 7 -> 07 , 23 -> 23
                seats.add(seat);
            }
        }
    }

    public String getTheatreName() {
        return theatreName;
    }

    public boolean reserveSeat(String seatNumber){
        /*
        checking efficiency
         */
//        int low = 0;
//        int high = seats.size()-1;
//        while (low <= high) {
//            System.out.print(".");
//            int mid = (low + high) / 2;
//            Seat midVal = seats.get(mid);
//            int cmp = midVal.getSeatNumber().compareTo(seatNumber);
//            if (cmp < 0) {
//                low = mid + 1;
//            } else if (cmp > 0) {
//                high = mid - 1;
//            } else {
//                return seats.get(mid).reserve();
//            }
//        }
//        System.out.println("There is no seat " + seatNumber);
//        return false;

        /*
        JAVA UTILS BINARY SEARCH
         */

//        Seat requestedSeat = new Seat(seatNumber);
//        int foundSeat = Collections.binarySearch(seats, requestedSeat, null);  //will use our custom compareTo method
//        if (foundSeat>=0){
//            return seats.get(foundSeat).reserve();
//        } else {
//            System.out.println("There is no seat " + seatNumber);
//            return false;
//        }



        /*
        BRUTE FORCE METHOD
         */
//        Seat requestedSeat = new Seat(seatNumber);
        Seat requestedSeat = null;
        for (Seat seat : seats){
            System.out.print(".");
            if (seat.getSeatNumber().equals(seatNumber)){
                requestedSeat = seat;
                break;
            }
        }
        if (requestedSeat==null){
            System.out.println("There is no seat " + seatNumber);
            return false;
        }

        return requestedSeat.reserve();
    }

//    for testing

    public Collection<Seat> getSeats() {
        return this.seats;
    }

    public class Seat implements Comparable<Seat> {
        private final String seatNumber;
        private double price;
        private boolean reserved;

        public Seat(String seatNumber, double price) {
            this.seatNumber = seatNumber;
            this.price = price;
            this.reserved = false;
        }

        public String getSeatNumber() {
            return this.seatNumber;
        }

        public double getPrice() {
            return this.price;
        }

        @Override
        public int compareTo(Seat seat) {
            return this.seatNumber.compareTo(seat.getSeatNumber());  // not case sensitive
        }

        public boolean reserve(){
            if (!this.reserved){
                this.reserved = true;
                System.out.println("Seat " + this.seatNumber + " reserved.");
                return true;
            } else {
                return false;
            }
        }

        public boolean cancel(){
            if (this.reserved){
                this.reserved = false;
                System.out.println("Reservation of seat " + this.seatNumber + " cancelled.");
                return true;
            } else {
                return false;
            }
        }
    }
}
