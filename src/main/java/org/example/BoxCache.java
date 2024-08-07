package org.example;

public class BoxCache <K, V extends BoxOperations> {
//public class BoxCache<K, V extends BoxOperations<V>> {
    K key;
    V value;

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public void put(K key, V value) {
        this.key = key;
        this.value = value;
    }
}
