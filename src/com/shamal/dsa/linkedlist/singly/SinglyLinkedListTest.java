package com.shamal.dsa.linkedlist.singly;

public class SinglyLinkedListTest {

    public static void main(String[] args) {
        System.out.println("SINGLY LINKED LIST DEMONSTRATION ");
        System.out.println();

        SinglyLinkedList s = new SinglyLinkedList();

        s.addToHead("A");
        s.addToHead("B");
        s.traversalNodes();

        s.addToTail("X");
        s.addToTail("Y");
        s.traversalNodes();

        s.addAfter("T","B");
        s.traversalNodes();
        s.addAfter("U","Y");
        s.traversalNodes();
        s.addAfter("V","X");
        s.traversalNodes();

        System.out.println(s.isFound("B"));         // TRUE
        System.out.println(s.isFound("U"));         // TRUE
        System.out.println(s.isFound("Z"));         // FALSE

        System.out.println(s.isDeleted("B"));       // TRUE
        System.out.println(s.isDeleted("U"));       // TRUE
        System.out.println(s.isDeleted("X"));       // TRUE
        System.out.println(s.isDeleted("H"));       // FALSE

        System.out.println(s.countNodes());












    }

}
