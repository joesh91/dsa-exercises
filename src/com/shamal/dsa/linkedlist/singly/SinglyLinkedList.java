package com.shamal.dsa.linkedlist.singly;

public class SinglyLinkedList {
    private Node head;

    void addToHead(String data){
        Node n = new Node(data);
        if(head!=null){
            n.next=head;
            head=n;
        }else{
            head=n;
        }
    }

    void addToTail(String data){
        Node n = new Node(data);
        if(head!=null){
            Node current=head;
            while(current.next!=null){
                current=current.next;
            }current.next=n;
        }else{
            head=n;
        }
    }

    void addAfter(String data, String after){
              if(head==null) return;

        Node current = head;
            while(current!=null){
                if(current.data.equals(after)){

                    Node n = new Node(data);
                    n.next=current.next;
                    current.next=n;
                        break;
                }else{
                    current=current.next;
                }
            }
    }

    void traversalNodes(){

        if(head!=null){
            Node current=head;
            System.out.print("START : ");
            while(current!=null){
                System.out.print(current.data+ " -> ");
                current=current.next;
            }
            System.out.print(" : END ");
            System.out.println();
        }else{
            System.out.println("LINKED LIST IS EMPTY");
        }

    }

    boolean isFound(String data){
        boolean found =false;
        System.out.print("SEARCH RESULT : ");
        if(head!=null){
            Node current=head;
            while(current!=null){
                if(current.data.equals(data)){
                    found=true;
                    break;
                }else{
                    current=current.next;
                }
            }
        }
        return found;
    }

    boolean isDeleted(String data){
        boolean deleted=false;
        if(head==null) return deleted;
        System.out.print("NODE DELETED ? : ");
        if(head.data.equals(data)){
            head=head.next;
            deleted=true;
        }else{
            Node current=head;
            while(current.next!=null){
                if(current.next.data.equals(data)){
                    current.next=current.next.next;
                    deleted=true;
                    break;
                }else{
                    current=current.next;
                }
            }
        }
        return deleted;
    }

    int countNodes(){
        int count=0;
        System.out.print("NODES COUNTS : ");
        if(head!=null){
            Node current=head;
            while(current!=null){
                count++;
                current=current.next;
            }
        }
        return  count;
    }
}
