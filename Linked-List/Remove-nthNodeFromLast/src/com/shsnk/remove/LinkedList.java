package com.shsnk.remove;

public class LinkedList {
    Node head;
    Node temp;
    void insert(int data)
    {
        temp=new Node();
        temp.data=data;
        temp.next=head;
        head=temp;
        System.out.println("Node Insert Successfully");
    }
    void traverse(Node temp)
    {
        if(head==null)
        {
            System.out.println("No element found");
        }
        while (temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    void remove(Node temp,int n)
    {
      Node fast=temp,slow=temp;
        for(int i=0;i<=n;i++)
        {
            if(fast==null){
                System.out.println("Not enough element found");
                System.exit(2);
                return;
            }
            fast=fast.next;
        }
        while (fast!=null)
        {
            slow=slow.next;
            fast=fast.next;
        }
        if(slow.next==null) {
            slow.next = null;
        }
        System.out.println(slow.next.data);
        slow.next=(slow.next).next;
    }
}
