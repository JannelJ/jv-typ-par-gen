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
//        box2.getLargestValue();
        System.out.println(box1.getLargestValue());

        List<Integer> numbersList = new ArrayList<>();
        numbersList.add(3);
        numbersList.add(14);
        numbersList.add(6);
        numbersList.add(8);

        box2.setLargestValueFromList(numbersList);
        System.out.println(box2.getLargestValue());

    }

}
