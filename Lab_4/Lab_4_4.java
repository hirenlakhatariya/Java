package com.company;

import java.util.Scanner;

public class Lab_4_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number :");
        int n = sc.nextInt();
        int reverse=0;
        while (n!=0)
        {
            int rem = n%10;
            reverse = reverse*10 + rem;
            n = n/10;
        }
        System.out.println(reverse);
    }
}
