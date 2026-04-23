package com.shamal.dsa.Stack.array;

public class StackArrayTest {
    public static void main(String[] args) {

        StackArray s = new StackArray(5);

        System.out.println("STACK FULL ? "+ s.isFull());
        System.out.println("STACK EMPTY ? " +s.isEmpty());
        System.out.println("ITEMS COUNT : " +s.getItemsCount());
        System.out.println("TOP POSITION VALUE : " + s.peek());
        System.out.println("POP DATA VALUE : " + s.pop());
        System.out.println();

        s.push(10);

        System.out.println("STACK FULL ? "+ s.isFull());
        System.out.println("STACK EMPTY ? " +s.isEmpty());
        System.out.println("ITEMS COUNT : " +s.getItemsCount());
        System.out.println("TOP POSITION VALUE : " + s.peek());
        System.out.println("POPPED DATA VALUE : " + s.pop());
        System.out.println();

        System.out.println("STACK FULL ? "+ s.isFull());
        System.out.println("STACK EMPTY ? " +s.isEmpty());
        System.out.println("ITEMS COUNT : " +s.getItemsCount());
        System.out.println("TOP POSITION VALUE : " + s.peek());
        System.out.println("POPPED DATA VALUE : " + s.pop());
        System.out.println();

        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        s.push(60);
        s.push(70);

        System.out.println("STACK FULL ? "+ s.isFull());
        System.out.println("STACK EMPTY ? " +s.isEmpty());
        System.out.println("ITEMS COUNT : " +s.getItemsCount());
        System.out.println("TOP POSITION VALUE : " + s.peek());
        System.out.println("POPPED DATA VALUE : " + s.pop());
        System.out.println();

    }
}
