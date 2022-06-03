package SetMatrixZero;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the dimensions of matrix");
        int r=sc.nextInt(),c=sc.nextInt(),i=0,j=0,count=0;
        int a[][]=new int[r][c];
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        for(i=0;i<r;i++)
        {
            for( j=0;j<c;j++)
            {
                if(a[i][j]==0) {
                    count++;
                    break;
                }
            }
            if(count>0)
            {
                break;
            }
        }
        if(count>0)
        {
            for(int k=0;k<r;k++)
            {
                a[k][j]=0;
            }
            for(int l=0;l<r;l++)
            {
                a[i][l]=0;
            }
        }
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
