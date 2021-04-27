package com.jokerinya;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	    Theatre theatre = new Theatre("Olympian", 8,12);


	    if (theatre.reserveSeat("D12")){
            System.out.println("Please pay");
        } else {
            System.out.println("Seat already reserved.");
        }
        if (theatre.reserveSeat("B13")){
            System.out.println("Please pay");
        } else {
            System.out.println("Seat already reserved.");
        }

        List<Theatre.Seat> copySeats = new ArrayList<>(theatre.getSeats());
        Collections.reverse(copySeats);
        printList(copySeats);

        List<Theatre.Seat> priceSeats = new ArrayList<>(theatre.getSeats());
        priceSeats.add(theatre.new Seat("B00", 13.00));
        priceSeats.add(theatre.new Seat("A00", 13.00));
        Collections.sort(priceSeats, Theatre.PRICE_ORDER);
        printList(priceSeats);


	    /*
	    SHADOW COPY
	     */
//        List<Theatre.Seat> seatCopy = new ArrayList<>(theatre.seats);  // Shadow copy
//        printList(seatCopy);
//	      seatCopy.get(1).reserve();  // A02 from theatre.seats
//        Collections.shuffle(seatCopy);
//        System.out.println("Printing seatCopy");
//	      printList(seatCopy);
//        System.out.println("Printing theatre.seats");
//        printList(theatre.seats);
//
//        Theatre.Seat min = Collections.min(seatCopy);
//        Theatre.Seat max = Collections.max(seatCopy);
//        System.out.println("Min seat " + min.getSeatNumber());
//        System.out.println("Max seat " + max.getSeatNumber());
//
//        sortList(seatCopy);
//        System.out.println("Printing sorted seatCopy");
//        printList(seatCopy);



    }

    public static void printList(List<Theatre.Seat> list){
        for (Theatre.Seat seat : list){
            System.out.print(" " + seat.getSeatNumber() + " $" + seat.getPrice());
        }
        System.out.println("\n====================================================");
    }

//    public static void sortList(List<? extends Theatre.Seat> seats){
//        for (int i = 0; i < seats.size() - 1; i++) {
//            for (int j = i+1; j < seats.size(); j++) {
//                if (seats.get(i).compareTo(seats.get(j)) > 0){  // smaller to bigger
//                    Collections.swap(seats, i, j);
//                }
//            }
//        }
//    }
}
