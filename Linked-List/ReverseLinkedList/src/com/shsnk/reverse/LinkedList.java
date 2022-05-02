package com.shsnk.reverse;


public class LinkedList {
    Node head;
    Node temp;

    Node prev=null,next;
    void insert(int data)
    {
        temp=new Node();
        temp.data=data;
        temp.next=head;
        head=temp;
        System.out.println("Node insert successfully");
    }
    void traverse(Node head)
    {
        if(head==null)
        {
            System.out.println("No Data Found");
            System.exit(1);
        }
        temp=head;
        while (temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    void reverse()
    {
        Node current=head;
        prev=null;
        while (current!=null)
        {
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
    }
}
