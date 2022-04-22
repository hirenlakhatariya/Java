import java.util.*;

class Student_Details
{
	long Enrollment_No;
	String Name;
	int Semester;
	double CPI;

	public void GetStudentDetails()
	{
		System.out.println("~~~~~Get Student Details~~~~~");
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the Enrollment_No  :");
		Enrollment_No =sc.nextLong();
		System.out.println("Please enter the Name : ");
		sc.nextLine();
		Name = sc.nextLine();
		System.out.println("Please enter the Semester : ");
		Semester = sc.nextInt();
		System.out.println("Please enter the CPI : ");
		CPI = sc.nextDouble();


	}
	public void DisplayStudentDetails()
	{
		System.out.println("Enrollment_No : " + Enrollment_No +"\nStudent_Name : " + Name + "\nSemester : " + Semester);
		System.out.println("CPI : " + CPI);
	}
}

class Lab92
{
	static int i=0;
	public static void main(String[] args)
	{
		Student_Details[] stu = new Student_Details[5];
		
		
		for(i=1;i<=5;i++)
		{
			stu[i]=new Student_Details();
			System.out.println("Student ~ "+i);
			stu[i].GetStudentDetails();
			stu[i].DisplayStudentDetails();
		}


	}
}