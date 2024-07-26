package org.example;

public class Box<T>  {
    private T value;
    private String name;

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

    public T castValue(T value) {
        try {
            this.value = value;
        } catch (ClassCastException e) {
            System.out.println("Cast exception: " + e);
        }
        return this.value;
    }

    public boolean hasSameName(Box<?> box) {
        return box.name.equalsIgnoreCase(this.name);
    }
}

