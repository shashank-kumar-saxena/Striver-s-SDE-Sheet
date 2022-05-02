package com.shsnk.reverse;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        LinkedList list=new LinkedList();
        while (true){
            System.out.println("Enter your choice");
            System.out.println("1 for insert a node");
            System.out.println("2 for reverse the list");
            int n=sc.nextInt();
            switch (n)
            {
                case 1:
                    System.out.println("Enter the element you want to insert");
                    n=sc.nextInt();
                    list.insert(n);
                    break;
                case 2:
                    System.out.println("Enter list is");
                    list.traverse(list.head);
                    System.out.println("\nlist in reverse order is");
                    list.reverse();
                    list.traverse(list.prev);
                    System.exit(2);
                    break;
                default:
                    System.out.println("Enter the valid choice");
            }
        }
    }
}
