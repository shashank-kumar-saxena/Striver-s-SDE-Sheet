package com.shsnk.merge;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        LinkedList list1=new LinkedList();
        LinkedList list2=new LinkedList();
        while (true)
        {
            System.out.println("Enter you choice");
            System.out.println("1 for insert an element in first list");
            System.out.println("2 for insert an element in second list");
            System.out.println("3 for merge the list");
            int n=sc.nextInt();
            switch (n)
            {
                case 1:
                    System.out.println("Enter the element you want to insert");
                    n=sc.nextInt();
                    list1.insert(n);
                    break;
                case 2:
                    System.out.println("Enter the element you want to insert");
                    n=sc.nextInt();
                    list2.insert(n);
                    break;
                case 3:
                    System.out.println("after merging the lists ");
                    list1.traverse(list1.head);
                    list2.traverse(list2.head);
                   Node result= list1.merge(list1.head,list2.head);//we can use either of the objects (list1 & list2)
                    list1.traverse(result);
                    System.exit(1);
                    break;
                default:
                    System.out.println("Please enter a valid choice");
            }
        }
    }
}
