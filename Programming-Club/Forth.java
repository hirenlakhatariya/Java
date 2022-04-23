package com.company;

import java.util.Scanner;

public class Fifth {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st number");
        int a = sc.nextInt();
        System.out.println("Enter the 2nd number");
        int b = sc.nextInt();
        int c = ~b;
        a+=c+1;
        System.out.println(a);
    }
}
