package com.jokerinya;

import java.util.HashMap;
import java.util.Map;

public class MapProgram {
    public static void main(String[] args) {
        Map<String, String> languages = new HashMap<>();
        languages.put("Python", "an interpreted, object oriented, high-level programming language with dynamic" +
                "semantics");

        if (languages.containsKey("Java")){
            System.out.println("Java is already on the map");
        } else {
            languages.put("Java", "a compiled high level, object oriented,platform independent language");
        }
        languages.put("Algol", "an algorithmic language");
        languages.put("BASIC", "Beginners All purposes Symbolic Instructions Guide");
        System.out.println(languages.put("Lisp", "Therein lies madness"));
        System.out.println("============================================");
        System.out.println(languages.get("Java"));
        System.out.println(languages.put("Java", "I like Java")); // returns the last value
        System.out.println(languages.get("Java"));

        System.out.println("============================================");
        for(String key : languages.keySet()){
            System.out.println(key + " : " + languages.get(key));
        }

        System.out.println("============================================");
        languages.putIfAbsent("Javac", "Try");
        System.out.println(languages.get("Javac"));
        languages.replace("Javac", "Try", "New Value");
        System.out.println(languages.get("Javac"));

        System.out.println("============================================");

    }
}
