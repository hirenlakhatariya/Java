package com.company;

import java.util.Scanner;

public class Lab_9_1 {
    public static void main(String[] args) {
        Student sc = new Student();
        sc.GetStudentDetails();
        Result re = new Result();
        re.GetResultDetails();
        Student s = new Student();
        re.DisplayResult(sc);
    }
}
class Student
{
    long Enrollment_No;
    String Student_Name;
    int Semester;
    public void GetStudentDetails()
    {
        System.out.println("~~~~~~~~~~~~ Get Student Details ~~~~~~~~~~~~~");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enrollment_No : ");
        Enrollment_No = sc.nextLong();
        System.out.print("Student_Name : ");
        sc.nextLine();
        Student_Name = sc.nextLine();
        System.out.print("Semester :");
        Semester = sc.nextInt();
    }
}

class Result
{
    long Enrollment_No;
    double CPI;
    double SPI;

    public void GetResultDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.println("~~~~~~~~~~~~ Get Result Details ~~~~~~~~~~~~~");
        System.out.print("Enrollment_No : ");
        Enrollment_No = sc.nextLong();
        System.out.print("CPI:");
        CPI = sc.nextDouble();

        System.out.print("Spi :");
        SPI = sc.nextDouble();
    }
    public void DisplayResult(Student s)

    {
        System.out.println("~~~~~~~~~~~~ Display Student Result Details ~~~~~~~~~~~~~");
        System.out.println("Enrollment no : " +s.Enrollment_No +"\nStudent Name : "+s.Student_Name+"\nSemester : "+ s.Semester);
        System.out.println("CPI : " + CPI);
        System.out.println("SPI  : " + SPI);
    }
}
