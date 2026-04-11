package com.shamal.dsa.linkedlist.doubly;

public class DoublyLinkedList {
    private Node head;
    private Node tail;

    public void addToHead(Object data){
        Node n = new Node(data);
        if(head==null){
            head=n;
            tail=n;
        }else{
            head.prev=n;
            n.next=head;
            head=n;
        }
    }

    public void addToTail(Object data){
            Node n = new Node(data);
                if(tail==null){
                    tail=n;
                    head=n;
                }else{
                   tail.next=n;
                   n.prev=tail;
                   tail=n;
                }

    }

    public void addAfter(Object data , Object after){
        boolean found =false;
            if(head==null){
                System.out.println("LIST IS EMPTY");
                return;
            }
                Node current=head;

                    while(current!=null){
                        if(current.data.equals(after)){
                            Node n = new Node(data);

                                n.next=current.next;
                                n.prev=current;
                                    if(current.next!=null){
                                        current.next.prev=n;
                                    }else{
                                        tail=n;
                                    }
                                    current.next=n;
                                    found=true;
                                    break;
                        }else{
                            current=current.next;
                        }
                    }
                    if(!found){
                        System.out.println("DATA NOT FOUND");
                    }
    }

    public void traversalHeadToTail(){
        if(head == null){
            System.out.print("LIST IS EMPTY");
        }else{
            Node current=head;
                while(current!=null){
                    System.out.print(current.data + " <-> ");
                    current=current.next;
                }
            System.out.println();
        }
    }

    public void traversalTailToHead(){
        if(tail==null){
            System.out.println("LIST IS EMPTY");
        }else{
            Node current=tail;
                while(current!=null){
                    System.out.print(current.data + " <-> ");
                    current=current.prev;
                }
            System.out.println();
        }
    }

    public boolean isFound(Object data){
        boolean found=false;
            if(head==null) return found;
            Node current=head;
                while(current!=null){
                    if(current.data.equals(data)){
                        found=true;
                        break;
                    }else{
                        current=current.next;
                    }
                }
        return found;
    }

    public boolean delete(Object data){
        boolean delete = false;
            if(head==null) return delete;

            if(head.data.equals(data)){
                head=head.next;
                    if(head!=null) {
                        head.prev = null;
                    }else{
                        tail=null;
                    }
                delete=true;
                return delete;
            }

        Node current=head;
            while(current.next!=null){
                if(current.next.data.equals(data)){
                        current.next=current.next.next;
                            if(current.next!=null) {
                                current.next.prev = current;
                            }else{
                                tail=current;
                            }
                        delete=true;
                        break;
                }else{
                    current=current.next;
                }
            }
        return delete;
    }

    public int getNodesCount(){
      int count=0;
        if(head !=null){
            Node current=head;
                while(current!=null){
                        count++;
                        current=current.next;
                }
        }
      return count;
    }

    public Object getHeadData(){
        Object headData=null;
        if(head !=null){
            headData=head.data;
        }
        return headData;
    }

    public Object getTailData(){
        Object tailData=null;
        if(tail !=null){
            tailData=tail.data;
        }
        return tailData;

    }
}
