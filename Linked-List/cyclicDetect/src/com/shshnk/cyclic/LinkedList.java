package com.shshnk.cyclic;

import java.util.HashSet;

public class LinkedList {
    Node head,temp;
    /*
    * head one use to point the first node
    * and
    * head two use to point the second node
    * */
    void insert(int data)
    {
        temp=new Node(data);
        temp.next=head;
        this.head=temp;
    }
    void MakeCyclic() {
        Node p = head;
        try {
            while (p.next != null) {
                p = p.next;
            }

            p.next = head;
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
    boolean cyclic(Node head)
    {

        boolean t=false;
        HashSet<Node> list=new HashSet<>();
        while(true)
        {
            list.add(head);
            if(head==null)
            {
                break;
            }
            if(list.contains(head.next))
            {
                t=true;
                break;
            }
            head=head.next;
        }
        return t;
    }
}
