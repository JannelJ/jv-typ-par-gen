package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Box<String, Integer> box1 = new Box<>(); // T stores a string, V stores integer
        Box<Integer, Integer> box2 = new Box<>(); // T stores integer, V stores integer as largest value

        System.out.println(box1.castValue("Hello"));
        System.out.println(box2.castValue(45));

        box1.setLargestValue(16, 5);

        System.out.println(box1.getLargestValue());

        List<Integer> numbersList = new ArrayList<>();
        numbersList.add(3);
        numbersList.add(14);
        numbersList.add(6);
        numbersList.add(8);

        box2.setLargestValueFromList(numbersList);
        System.out.println(box2.getLargestValue());

        BoxCache<Integer, Box<String, Float>> boxCache = new BoxCache<>();
        Box<String, Float> box = new Box<>("FloatBox");
        boxCache.put(1, box);
        System.out.println("**BoxCache: " + boxCache.getKey());
        System.out.println("**BoxCache: " + boxCache.getValue().getName());
/*
        BoxCache<String, String> dodgyCache = new BoxCache<>();
        dodgyCache.put("Test", "Fail");
        System.out.println("**BoxCache 2nd bit: " + dodgyCache.getKey());
        System.out.println("**BoxCache 2nd bit: " + dodgyCache.getValue());

 */
    }

}
