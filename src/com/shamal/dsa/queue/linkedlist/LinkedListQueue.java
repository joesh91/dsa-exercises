package com.shamal.dsa.queue.linkedlist;

public class LinkedListQueue {

    private Node rear;
    private Node front;

        public void enqueue(Object data) {
        Node n = new Node(data);
            if(front==null){
                front=n;
            }else{
                rear.next=n;
                rear=n;
            }
        }

        public Object dequeue(){
            Object show=null;
            if(front==null){
                throw new IllegalStateException("EMPTY LIST");
            }
                show = front.data;
                if(front.next==null){
                    rear=null;
                }
                front =front.next;

           return show;
        }

        public Object peek(){
        if(front==null){
                throw new IllegalArgumentException("EMPTY LIST");
            }
            return front.data;
        }

        public Object getRearData(){
            if(rear==null){
                throw new IllegalStateException("EMPTY LIST");
            }
            return rear.data;
        }

    }