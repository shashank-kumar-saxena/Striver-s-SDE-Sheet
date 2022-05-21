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
        int t=n;
        temp=head;
        Node start=head;
        while (t>0&&temp.next!=null)
        {
            t--;
            if(t==0)
            {
                while (start!=temp)
                {

                }
                System.out.println();
            }
            temp=temp.next;
        }
    }
}
