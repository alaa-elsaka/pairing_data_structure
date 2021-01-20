package com.galvanize;

public class Node<T> {

    T value;
    Node next;

    Node(T val){
        this.value = val;
    }

    public T getValue() {
        return  value;
    }
}
