package org.example;

public class Main {

    public static void main(String[] args) {

      Box<String, Integer> box1 = new Box<>(); // T stores a string, V stores integer
      Box<Integer, Integer> box2 = new Box<>(); // T stores integer, V stores integer as largest value

        System.out.println(box1.castValue("Hello"));
        System.out.println(box2.castValue(45));

       Integer largest = box1.setLargestValue(16, 5);

        System.out.println(largest);




    }

}
