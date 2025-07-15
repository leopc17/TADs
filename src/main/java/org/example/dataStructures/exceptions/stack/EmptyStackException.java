package org.example.dataStructures.exceptions.stack;

public class EmptyStackException extends RuntimeException {

    public EmptyStackException(String message) {
        super(message);
    }

    public EmptyStackException() {
        super("Stack is empty.");
    }
}
