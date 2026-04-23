package com.shamal.dsa.Stack.array;

public class StackArray {

    private int [] stack;
    private int top;


    public StackArray(int size){
            stack = new int[size];
            top=-1;
           // count =0;
        }

    public void push(int data){
            if(isFull()){
                throw new IllegalStateException("STACK OVERFLOW");
            }
                top++;
                stack[top]=data;
            }

    public int peek(){
            if(isEmpty()){
                throw new IllegalStateException("STACK IS EMPTY");
                }
            return stack[top];
    }

    public int pop(){

        if(isEmpty()){
            throw new IllegalStateException("STACK IS EMPTY");
          }
                int value = stack[top];
                top--;

            return value;
    }

    public boolean isEmpty(){

            return top==-1;
    }

    public boolean isFull(){

            return top== stack.length-1;

    }

    public int getItemsCount(){

            return top+1;
    }

}
