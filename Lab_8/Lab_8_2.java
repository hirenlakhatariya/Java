package com.company;

import java.util.Scanner;

public class Lab_8_2 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter hour and minute for Time1 :");
        int h1 = sc.nextInt();
        int m1 = sc.nextInt();
        System.out.println("enter hour and minute for Time2 :");
        int h2 = sc.nextInt();
        int m2 = sc.nextInt();
        Time t =new Time();
       t.add(h1,m1,h2,m2);
    }
}
class Time
{
    int hour;
    int minute;
    void add(int h1, int m1, int h2, int m2)
    {
        hour = h1+h2;
        minute = m1+m2;
        if(minute>=60)
        {
            minute=minute%60;
            hour++;
        }
        System.out.println(hour+":"+minute +" hours");
    }

}
