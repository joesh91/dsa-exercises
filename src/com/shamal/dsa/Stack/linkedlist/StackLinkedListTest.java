package com.shamal.dsa.Stack.linkedlist;

public class StackLinkedListTest {
    public static void main(String[] args) {

        StackLinkedList ls = new StackLinkedList();

        System.out.println("STACK EMPTY ? " + ls.isEmpty());
        System.out.println("STACK TOP DATA : " + ls.peek());
        System.out.println("STACK POPPED DATA : " + ls.pop());

        ls.push('A');

        System.out.println("STACK EMPTY ? " + ls.isEmpty());
        System.out.println("STACK TOP DATA : " + ls.peek());
        System.out.println("STACK POPPED DATA : " + ls.pop());

        System.out.println("STACK EMPTY ? " + ls.isEmpty());
        System.out.println("STACK TOP DATA : " + ls.peek());
        System.out.println("STACK POPPED DATA : " + ls.pop());
    }
}
