package org.example;

public class Box<T, V extends Number>{
    private T value;
    private String name;
    private V largestValue;

    public Box(String name) {
        this.name = name;
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
    public V setLargestValue(V arg1, V arg2) {
        double value1 = arg1.doubleValue();
        double value2 = arg2.doubleValue();

        if (value1 > value2) {
            this.largestValue = arg1;
        } else {
            this.largestValue = arg2;
        }
        return this.largestValue;
    }


    public T castValue(T value) {
        try {
            this.value = value;
        } catch (ClassCastException e) {
            System.out.println("Cast exception: " + e);
        }
        return this.value;
    }


    public boolean hasSameName(Box<?, V> box) {
        return box.name.equalsIgnoreCase(this.name);
    }
}


