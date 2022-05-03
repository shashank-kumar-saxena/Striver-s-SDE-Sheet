package com.shsnk.remove;
//remove nth node from last
import java.util.List;
import java.util.Scanner;
//O(N) complexity
//two pointer approach
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        LinkedList list=new LinkedList();
        while (true)
        {
            System.out.println("Enter your choice");
            System.out.println("1 for insert");
            System.out.println("2 for remove nth node from last");
            int n=sc.nextInt();
            switch (n)
            {
                case 1:
                    System.out.println("Enter the element you want to insert");
                    n=sc.nextInt();
                    list.insert(n);
                    break;
                case 2:
                    if(list.head==null)
                    {
                        System.out.println("Enter the element first");
                        continue;
                    }
                    System.out.println("Enter the node number you want to delete from last");
                    n=sc.nextInt();
                    System.out.printf("After deleting %d node from list\n",n);
                    list.traverse(list.head);
                    System.out.print("is ");
                    list.remove(list.head,2);
                    list.traverse(list.head);
                    System.exit(1);
                    break;
                default:
                    System.out.println("Enter the valid choice");
            }
        }
    }
}
