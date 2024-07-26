package org.example;

public class Main {

    public static void main(String[] args) {

        Box<String> box1 = new Box<>();
        Box<Integer> box2 = new Box<>();

        System.out.println(box1.castValue("testString"));
        System.out.println(box2.castValue(45));


    }

}
