package com.shsnk.intersection;

import java.util.Scanner;

/*
*   Example 1:
    Input:
    List 1 = [1,3,1,2,4], List 2 = [3,2,4]
    Output:
    2
    Explanation: Here, both lists intersecting nodes start from node 2.

*
* Example 2:
  Input:
  List1 = [1,2,7], List 2 = [2,8,1]
  Output:
  Null
  Explanation: Here, both lists do not intersect and thus no intersection node is present.
* */
//solve using utility function hashset
//o(n+m) can achieve only using collection library
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //here we're using O(n+m) linked List
        orderOfnADDmComplexity.LinkedList list1=new orderOfnADDmComplexity.LinkedList();
        orderOfnADDmComplexity.LinkedList list2=new orderOfnADDmComplexity.LinkedList();
        // here we're using O(n*m) linked list
        //orderOfnMULmComplexity..LinkedList list1=new orderOfnMULmComplexity..LinkedList();
        //orderOfnMULmComplexity.LinkedList list2=new orderOfnMULmComplexity.LinkedList();
        while (true)
        {
            System.out.println("1 for insert an element in 1st linked list");
            System.out.println("2 for insert an element in 2nd linked list");
            System.out.println("3 for find common node");
            int n= sc.nextInt();
            switch (n)
            {
                case 1:
                    list1.insert(1);
                    list1.insert(3);
                    list1.insert(1);
                    list1.insert(2);
                    list1.insert(4);

                    break;
                case 2:
                    list2.insert(1);
                    list2.insert(4);

                    break;
                case 3:
                    System.out.println("first list is");
                    list1.traverse(list1.getHead());
                    System.out.println("Second list is");
                    list2.traverse(list2.getHead());
                    System.out.println("Common node is");
                    Node temp=list1.comp(list1.getHead(),list2.getHead());
                    if(temp==null)
                        System.out.println("null");
                    else
                        System.out.println(temp.data);
                    System.exit(1);
                default:
                    System.out.println("Enter the valid choice");
            }
        }
    }
}
