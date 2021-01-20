package com.galvanize;

import java.net.HttpCookie;

public class Queue {

    private Node front, rear;
    private  int size = 0;

    Queue(){
        front = null;
        rear = null;
    }
    public boolean isEmpty() {

        return size == 0 ? true: false;
    }

    public void enqueue(Node node) {
        if(isEmpty()){
            front = node;
            rear = node;
            size++;
        }
        else{
            rear.next = node;
            rear = rear.next;
            size++;
        }

    }

    public int length() {
        return this.size;
    }

    public Node getFront() {
        return this.front;
    }


    public Node getRear() {
        return  this.rear;
    }

    public Node dequeue() {
        if(isEmpty()){
            return null;
        }
        else{
            Node temp = front;
            front = front.next;
            size--;
            return temp;
        }
    }
}
