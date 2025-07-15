package org.example.dataStructures.interfaces;

public interface Stack<T> extends Iterable<T> {

    void push(T element);
    T pop();
    T top();
    Integer size();
    boolean isEmpty();
}
