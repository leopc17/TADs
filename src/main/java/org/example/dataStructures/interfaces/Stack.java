package org.example.dataStructures.interfaces;

import org.example.dataStructures.exceptions.stack.EmptyStackException;
import org.example.dataStructures.exceptions.stack.FullStackException;

public interface Stack<T> extends Iterable<T> {

    void push(T element) throws FullStackException;
    T pop() throws EmptyStackException;
    T top() throws EmptyStackException;
    Integer size();
    boolean isEmpty();
}
