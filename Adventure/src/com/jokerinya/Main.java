package com.jokerinya;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static Map<Integer, Location> locations = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> tempExit = new HashMap<>();
        locations.put(0, new Location(0, "You are sitting in front of a computer learning Java",
                tempExit));

        // Room 1
        tempExit = new HashMap<>();
        tempExit.put("W", 2);
        tempExit.put("E", 3);
        tempExit.put("S", 4);
        tempExit.put("N", 5);
        locations.put(1, new Location(1, "You are standing at the end of a road " +
                "before a small brick building", tempExit));
        // Room 2
        tempExit = new HashMap<>();
        tempExit.put("N", 5);
        locations.put(2, new Location(2, "You are at the top of a hill", tempExit));
        // Room 3
        tempExit = new HashMap<>();
        tempExit.put("W", 1);
        locations.put(3, new Location(3, "You are inside a building, " +
                "a well house for a small spring", tempExit));
        // Room 4
        tempExit = new HashMap<>();
        tempExit.put("N", 1);
        tempExit.put("W", 2);
        locations.put(4, new Location(4, "You are in a valley beside a stream", tempExit));
        // Room 5
        tempExit = new HashMap<>();
        tempExit.put("S", 1);
        tempExit.put("W", 2);
        locations.put(5, new Location(5, "You are in the forest", tempExit));

        Map<String, String> vocabulary = new HashMap<>();
        vocabulary.put("QUIT", "Q");
        vocabulary.put("EAST", "E");
        vocabulary.put("WEST", "W");
        vocabulary.put("SOUTH", "S");
        vocabulary.put("NORTH", "N");


        int loc = 1;
        while (true){
            System.out.println(locations.get(loc).getDescription());
            // tempExit.remove("S");
            if (loc==0){
                break;
            }

            Map<String, Integer> exits = locations.get(loc).getExits();
            System.out.print("Available exits are ");
            for (String exit : exits.keySet()){
                System.out.print(exit + ", ");
            }
            System.out.println();
            String direction = scanner.nextLine().toUpperCase();
            if (direction.length()>1){
                for (String word : direction.split(" ")){
                    if (vocabulary.containsKey(word)){
                        direction = vocabulary.get(word);
                        break;
                    }
                }
            }
            if (exits.containsKey(direction)){
                loc = exits.get(direction);
            } else {
                System.out.println("You can't go in that direction.");
            }
        }
    }

}
