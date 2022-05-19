package com.shshnk.cyclic;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        LinkedList list=new LinkedList();
        int n=0;
        while (true)
        {
            System.out.println("Enter your choice");
            System.out.println("1 for insert");
            System.out.println("2 for check cyclic");
            System.out.println("3 for exit");
            n=sc.nextInt();
            switch (n)
            {
                case 1:
                    System.out.println("Enter the value you want to insert");
                    n=sc.nextInt();
                    list.insert(n);
                    break;
                case 2:
                    //this function use to make a linked list cyclic
                    list.MakeCyclic();
                    boolean b= list.cyclic(list.head);
                        if(b)
                            System.out.println("Cyclic linked list");
                        else
                            System.out.println("Non-cyclic linked list");
                        System.exit(1);
                    break;
                case 3:
                        System.exit(1);
                    break;

                default:
                    System.out.println("Enter the valid choice");
            }
        }
    }
}
