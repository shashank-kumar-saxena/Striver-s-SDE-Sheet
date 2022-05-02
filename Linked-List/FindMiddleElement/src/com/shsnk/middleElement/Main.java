package com.shsnk.middleElement;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        LinkedList list=new LinkedList();
        while (true)
        {
            System.out.println("Enter your choice");
            System.out.println("1 for insert");
            System.out.println("2 for find middle element");
            int n=sc.nextInt();
            switch (n)
            {
                case 1:
                    System.out.println("Enter the element you want to insert");
                    n=sc.nextInt();
                    list.insert(n);
                    break;
                case 2:
                    System.out.print("The Middle Term of list ");
                    list.traverse();
                    System.out.println("is");
                    list.middle();
                    System.exit(1);
                    break;
                default:
                    System.out.println("Enter the valid choice");
            }
        }
    }
}
