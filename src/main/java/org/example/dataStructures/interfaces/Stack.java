package org.example.dataStructures.interfaces;

import org.example.dataStructures.exceptions.stack.EmptyStackException;
import org.example.dataStructures.exceptions.stack.FullStackException;

public interface Stack<T> extends Iterable<T> {

    /**
     * Pushes an item onto the top of this stack.
     *
     * @param element the item to be pushed onto this stack.
     * @throws FullStackException if the stack is full.
     */
    void push(T element) throws FullStackException;

    /**
     * Removes the object at the top of this stack and returns that
     * object as the value of this function.
     *
     * @return The object at the top of this stack.
     * @throws EmptyStackException if this stack is empty.
     */
    T pop() throws EmptyStackException;

    /**
     * Looks at the object at the top of this stack without removing it
     * from the stack.
     *
     * @return the object at the top of this stack.
     * @throws EmptyStackException if this stack is empty.
     */
    T top() throws EmptyStackException;

    /**
     * Returns the number of elements in this stack.
     *
     * @return the number of elements in this stack.
     */
    Integer size();

    /**
     * Tests if this stack is empty.
     *
     * @return  {@code true} if and only if this stack contains
     *          no items; {@code false} otherwise.
     */
    boolean isEmpty();
}
