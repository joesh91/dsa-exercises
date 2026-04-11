package com.shamal.dsa.linkedlist.doubly;

public class Node {
    Node next;
    Node prev;
    Object data;

    Node(Object data){
        this.data=data;
        this.next=null;
        this.prev=null;
    }
}
