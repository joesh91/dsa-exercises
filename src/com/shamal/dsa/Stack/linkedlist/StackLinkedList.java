package com.shamal.dsa.Stack.linkedlist;

public class StackLinkedList {
    private Node top;

    public void push(Object data){
        Node n = new Node(data);
        if(isEmpty()){
            top=n;
        }else{
            n.next=top;
            top=n;
        }
    }

    public Object pop(){

        if(isEmpty()){
            return null;
        }
        Object show=top.data;
        top=top.next;

    return show;
    }

    public Object peek(){

        if(isEmpty()){
            return null;
        }
        return top.data;
    }

    public boolean isEmpty(){

        return top==null;
    }

}
