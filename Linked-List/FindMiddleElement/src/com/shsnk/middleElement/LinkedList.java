package com.shsnk.middleElement;

public class LinkedList {
    Node head;
    void insert(int data)
    {
        Node temp=new Node();
        temp.data=data;
        temp.next=head;
        head=temp;
        System.out.println("Node Insert Successfully");
    }
    void traverse()
    {
        if(head==null)
        {
            System.out.println("No data found");
            return;
        }
        Node temp=head;
        while (temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    void middle()
    {
        Node fast=head,slow=head;
        while (fast.next!=null)
        {
            slow=slow.next;
            if(fast.next.next!=null)
            {
                fast=fast.next.next;
            }
            else
                break;
        }
        System.out.println(slow.data);
    }
}
