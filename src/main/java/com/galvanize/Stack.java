package com.galvanize;

public class Stack {

    private Node top;
    private int size = 0;

    public boolean isEmpty() {
        return top==null;
    }

    public void push(Node node){
        if(isEmpty()){
            top = node;
            size++;
        }else{
            Node temp = top;
            top = node;
            top.next = temp;
            size++;
        }
    }

    public int count() {
        return size;
    }
}
