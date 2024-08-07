package org.example;

import java.util.List;

public interface BoxOperations<V> {

    V getLargestValue();

    void setLargestValue(V arg1, V arg2);

    void setLargestValueFromList(List<V> numbers);

}
