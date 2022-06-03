package com.reverse;

public class LinkedList {
    Node head;
    Node temp;
    void insert(int data)
    {
        temp=new Node(data);
        temp.next=head;
        head=temp;
        System.out.println("Node Insert Successfully");
    }
    void reverse(int n)
    {
        while(n)
    }
}
