package org.example;

import java.util.Collections;
import java.util.List;

public class Box<T, V extends Number & Comparable<V>> implements BoxOperations<V> {
    private T value;
    private String name;
    private V largestValue;

    public Box(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLargestValue(V largestValue) {
        this.largestValue = largestValue;
    }

    public Box() {
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public V getLargestValue(){
        return largestValue;
    }

    public void setLargestValue(V value1, V value2) {
        if (value1.compareTo(value2) > 0) { //returns positive int if true
           largestValue = value1;
        } else {
            largestValue = value2;
        }
    }


    public T castValue(T value) {
        try {
            this.value = value;
        } catch (ClassCastException e) {
            System.out.println("Cast exception: " + e);
        }
        return this.value;
    }


    public boolean hasSameName(Box<? extends T, V> box) {
        return box.name.equalsIgnoreCase(this.name);
    }

    public void setLargestValueFromList(List<V> numbers) {
        largestValue = Collections.max(numbers);
        System.out.println("**Largest value is: " + largestValue);
    }
}
