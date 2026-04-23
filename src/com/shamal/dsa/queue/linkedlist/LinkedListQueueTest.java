    package com.shamal.dsa.queue.linkedlist;

    public class LinkedListQueueTest {
        public static void main(String[] args) {
            LinkedListQueue l = new LinkedListQueue();

            try {
                l.enqueue('A');
                l.enqueue('B');
                l.enqueue('C');
                l.enqueue('D');

                System.out.println("FRONT DATA : " + l.peek());
                System.out.println("REAR DATA : " + l.getRearData());

                System.out.println("DEQUEUED VALUE : " + l.dequeue());
                System.out.println("FRONT DATA : " + l.peek());
                System.out.println("REAR DATA : " + l.getRearData());

                System.out.println("DEQUEUED VALUE : " + l.dequeue());
                System.out.println("DEQUEUED VALUE : " + l.dequeue());
                System.out.println("DEQUEUED VALUE : " + l.dequeue());
                System.out.println("DEQUEUED VALUE : " + l.dequeue());
                System.out.println("FRONT DATA : " + l.peek());
                System.out.println("REAR DATA : " + l.getRearData());
            }catch(IllegalStateException e ){
                System.out.println("EMPTY LIST");
            }
        }
    }