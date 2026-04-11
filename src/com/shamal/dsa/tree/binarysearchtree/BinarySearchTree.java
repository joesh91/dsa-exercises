package com.shamal.dsa.tree.binarysearchtree;

import java.util.LinkedList;

public class BinarySearchTree {
    private Node root;

    public void insert(int data){
        Node n = new Node(data);
        if(root==null){
            root=n;
        }else{
            Node current=root;
            while(current!=null){
                if(data < current.data){
                    if(current.left==null){
                        current.left=n;
                        break;
                    }else{
                        current=current.left;
                    }
                }else if(data > current.data){
                    if(current.right==null){
                        current.right=n;
                        break;
                    }else{
                        current=current.right;
                    }
                }else{
                    System.out.println("DUPLICATE DATA INSERT ATTEMPT");
                    break;
                }
            }
        }
    }

    public boolean search(int data){
        boolean found=false;
        if(root==null) return found;
        Node current=root;
        while(current!=null){
            if(current.data == data){
                found=true;
                break;
            }
            else if(data < current.data){
                current=current.left;
            }else{
                current=current.right;
            }
        }
        return found;
    }

    // FIND THE MAXIMUM NODE VALUE
    public int findMin(){

        if(root==null){
            throw new IllegalStateException("TREE IS EMPTY");
        }
        Node current=root;
        while(current.left!=null){
            current=current.left;
        }
        return current.data;
    }

    // FIND THE MAXIMUM NODE VALUE
    public int findMax(){
        if(root==null){
            throw new IllegalStateException("TREE IS EMPTY");
        }
        Node current =root;
        while(current.right!=null){
            current=current.right;
        }
        return current.data;
    }

    // PRE ORDER TRAVERSAL
    public void preOrder(){
        System.out.println("PRE ORDER TRAVERSAL ");
        System.out.print("START ");
        preOrderTraversal(root);
        System.out.print(" END ");
        System.out.println();
        System.out.println();
    }

    private void preOrderTraversal(Node n){
        if(n!=null){
            System.out.print(n.data + " -> ");
            preOrderTraversal(n.left);
            preOrderTraversal(n.right);
        }
    }

    // POST ORDER TRAVERSAL
    public  void postOrder(){
        System.out.println("POST ORDER TRAVERSAL ");
        System.out.print("START ");
        postOrderTraversal(root);
        System.out.print(" END ");
        System.out.println();
        System.out.println();
    }

    private void postOrderTraversal(Node n){
        if(n!=null){
            postOrderTraversal(n.left);
            postOrderTraversal(n.right);
            System.out.print(n.data + " -> ");
        }
    }

    // IN ORDER TRAVERSAL
    public void inOrder(){
        System.out.println("IN ORDER TRAVERSAL ");
        System.out.print("START ");
        inOrderTraversal(root);
        System.out.print(" END ");
        System.out.println();
        System.out.println();
    }

    private void inOrderTraversal(Node n){
        if(n!=null){
            inOrderTraversal(n.left);
            System.out.print(n.data + " -> ");
            inOrderTraversal(n.right);
        }
    }

    // BREADTH FIRST TRAVERSAL
    public  void breadthFirstTraversal(){
        if(root!=null){
            LinkedList<Node> q = new LinkedList<>();
            q.add(root);
            System.out.println("BREADTH FIRST TRAVERSAL : ");
            System.out.print("START ");
            while(!q.isEmpty()){
                Node current = q.poll();
                System.out.print(current.data + " -> ");
                if(current.left!=null){
                    q.add(current.left);
                }
                if(current.right!=null){
                    q.add(current.right);
                }
            }
            System.out.println(" END");
            System.out.println();
            System.out.println();
        }else{
            System.out.println("EMPTY TREE");
        }
    }
}