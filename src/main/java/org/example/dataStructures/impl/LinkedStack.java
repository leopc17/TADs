package org.example.dataStructures.impl;

import org.example.dataStructures.exceptions.stack.EmptyStackException;
import org.example.dataStructures.interfaces.Stack;

import java.util.Iterator;

public class LinkedStack<T> implements Stack<T> {

    private Node top;
    private int size;

    public LinkedStack() { // Inicia com nó sentinela
        top = new Node(null);
        size = 0;
    }

    @Override
    public void push(T element) {
        top = new Node(element, top); // Cria um novo nó com o elemento e aponta para o antigo topo
        size++;
    }

    @Override
    public T pop() {
        if (top.isNIL()) {
            throw new EmptyStackException("Erro: a pilha está vazia.");
        }
        T data = top.getData();
        top = top.getNext();
        size--;
        return data;
    }

    @Override
    public T top() {
        if (top.isNIL()) {
            throw new EmptyStackException("Erro: a pilha está vazia.");
        }
        return top.getData();
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public Iterator<T> iterator() {
        throw new UnsupportedOperationException("Iterator não implementado");
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