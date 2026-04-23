package com.shamal.dsa.queue.circularqueue;

public class CircularArrayQueueTest {
    public static void main(String[] args) {

        CircularArrayQueue c = new CircularArrayQueue(2);

        System.out.println("IS EMPTY : " + c.isEmpty());
        System.out.println("IS FULL : " + c.isFull());
        System.out.println("PEEK VALUE : " + c.peek());
        System.out.println("COUNT : " + c.getCount());
        System.out.println("DEQUEUE VALUE : " + c.dequeue());
        System.out.println();

        c.enqueue(10);
        c.enqueue(20);
        c.enqueue(30);

        System.out.println("IS EMPTY : " + c.isEmpty());
        System.out.println("IS FULL : " + c.isFull());
        System.out.println("PEEK VALUE : " + c.peek());
        System.out.println("COUNT : " + c.getCount());
        System.out.println("DEQUEUE VALUE : " + c.dequeue());
        System.out.println();
        System.out.println("PEEK VALUE : " + c.peek());
        System.out.println("COUNT : " + c.getCount());


    }
}
