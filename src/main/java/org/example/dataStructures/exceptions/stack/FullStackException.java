package org.example.dataStructures.exceptions.stack;

public class FullStackException extends RuntimeException {
    public FullStackException(String message) {
        super(message);
    }

    public FullStackException() {
        super("Stack is full.");
    }
}
