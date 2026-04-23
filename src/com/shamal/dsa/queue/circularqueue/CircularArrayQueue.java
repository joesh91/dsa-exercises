package com.shamal.dsa.queue.circularqueue;

public class CircularArrayQueue {
    private int [] data;
    private int front;
    private int rear;
    private int size;
    private int count;

    public CircularArrayQueue(int size){
        data=new int[size];
        front=0;
        rear=-1;
        this.size=size;
        count=0;
    }

    public void enqueue(int value){
        if(!isFull()){
            if(rear==size-1){
                rear=-1;
            }
            rear=rear+1;
            data[rear]=value;
            count++;
        }else{
            System.out.println("QUEUE OVER FLOW");
        }
    }

    public int peek(){

        if(isEmpty()){
            throw new IllegalStateException("QUEUE IS EMPTY");
        }
        return data[front];
    }

    public int dequeue(){
        int show=-1;
        if(!isEmpty()){
            show=data[front];
            front++;
                if(front==size){
                    front=0;
                }
                count--;
            }
        return show;
    }

    public boolean isEmpty(){

        return count==0;
    }

    public boolean isFull(){

        return count==size;
    }

    public int getCount(){

        return count;
    }


}