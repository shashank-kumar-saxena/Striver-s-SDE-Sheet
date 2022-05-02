package com.shsnk.merge;

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
        System.out.println("Node Insert Successfully");
    }
    void traverse(Node head)
    {
        if(head==null)
        {
            System.out.println("No Element Found");
            System.exit(1);
        }
        while (head!=null)
        {
            System.out.print(head.data+" ");
            head=head.next;
        }
        System.out.println();
    }
    Node merge(Node head1,Node head2)
    {
        Node result=null;//point to new obtained list
        while (head1!=null||head2!=null)
        {
            temp=new Node();
            if(head1==null) {
                temp.data = head2.data;
            }
            else if (head2==null) {
                temp.data = head1.data;
            }
           else if(head1.data>head2.data)
                temp.data= head2.data;
            else
               temp.data=head1.data;
            temp.next=result;
            result=temp;
            if(head1!=null&&result.data==head1.data)
            {
                head1=head1.next;
            }
            else if(head2!=null)
            {
                head2=head2.next;
            }
        }
        Node current=result;
        prev=null;
        while (current!=null)
        {
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        return prev;
    }
}
