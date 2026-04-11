package com.shamal.dsa.linkedlist.doubly;

public class DoublyLinkedListTest {
    public static void main(String[] args) {
        DoublyLinkedList d = new DoublyLinkedList();
        d.addToHead('A');
        d.addToHead('B');
        d.addToHead('C');

        d.addToTail('Z');
        d.addToTail('Y');

        d.addAfter('H','C');

        d.traversalHeadToTail();
        d.traversalTailToHead();

        System.out.println("DELETED ? "+d.delete('Y'));

        d.traversalHeadToTail();
        d.traversalTailToHead();

        System.out.println("FOUND ? " +d.isFound('C'));
        System.out.println("FOUND ? " +d.isFound('Y'));

        System.out.println("HEAD NODE DATA : "+ d.getHeadData());
        System.out.println("TAIL NODE DATA : "+ d.getTailData());
        System.out.println("NODES COUNT : " + d.getNodesCount());

    }
}
