package com.company;

import java.util.Scanner;

public class Lab_6_2
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size of array :");
        int n = sc.nextInt();
        int sum = 0;
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i=0;i<n;i++)
        {
            if(a[i] % 3 == 0 ||  a[i] % 5 == 0)
            {
                sum = sum + a[i];
            }
        }
        System.out.println("the total sum of numbers (divisible by 3 or 5) : " + sum);
    }
}
