package com.shamal.dsa.tree.binarysearchtree;

public class BinarySearchTreeTest {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();

        bst.insert(1000);
        bst.insert(1500);
        bst.insert(500);
        bst.insert(250);
        bst.insert(750);
        bst.insert(1250);
        bst.insert(1750);

        System.out.println("MAX DATA : " +bst.findMax());
        System.out.println("MIN DATA : " +bst.findMin());

        bst.preOrder();
        bst.inOrder();
        bst.postOrder();

        bst.breadthFirstTraversal();

        System.out.println("SEARCH DATA : "+bst.search(250));
        System.out.println("SEARCH DATA : "+bst.search(1750));
        System.out.println("SEARCH DATA : "+bst.search(100));
        System.out.println("SEARCH DATA : "+bst.search(25000));


    }
}
