package org.example;

public class Box<T>  {
    private T box;

    public T getBox() {
        return box;
    }

    public void setBox(T box) {
        this.box = box;
    }

    public Box(T box) {
        this.box = box;
    }
}

