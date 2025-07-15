package org.example.dataStructures.impl;

import org.example.dataStructures.interfaces.Stack;

import java.util.Iterator;

public class LinkedStack<T> implements Stack<T> {

    private Node top;
    private int size;

    @Override
    public void push(T element) {
    }

    @Override
    public T pop() {
        return null;
    }

    @Override
    public T top() {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }

    private class Node {

        private T data;
        private Node next;

        public Node(T data) {
            this.data = data;
            this.next = null;
        }

        public Node(T data, Node next) {
            this.data = data;
            this.next = next;
        }

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public boolean isNIL() {
            return data == null;
        }
    }
}
