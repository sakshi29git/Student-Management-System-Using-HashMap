package HashMap_exp;

import java.util.Scanner;

public class Student {
	int roll,marks,std;
	int per=0;
	char grade;
	String fname,mname,sname,subject,div;
	Scanner sc=new Scanner(System.in);
	Student()
	{
		System.out.println("Enter student details: ");
		System.out.println("Enter First name: ");
		fname=sc.next();
		
		System.out.println("Enter Middle name: ");
		mname=sc.next();
		
		System.out.println("Enter Last name: ");
		sname=sc.next();
		System.out.println("Enter your roll number: ");
		roll=sc.nextInt();
		System.out.println("In which class do you study: ");
		std=sc.nextInt();
		System.out.println("Enter your Division: ");
		div=sc.next();
		System.out.println("Enter your Major subject: ");
		subject=sc.next();
		System.out.println("Enter your Marks(out of 500): ");
		marks=sc.nextInt();
		
	}
	
	void disp()
	{
		System.out.println("Name: " + fname+ " " + mname + " " + sname);
		System.out.println("Roll Number: " + roll);
		System.out.println("Stdandard: " + std);
		System.out.println("Division: " + div.toUpperCase());
		System.out.println("Major Subject: " + subject );
		System.out.println("Marks: " + marks);
		if(marks>=100 && marks<=200)
		{
			grade='D';
		}
		else if(marks>=201 && marks<=300)
		{
			grade='C';
		}
		
		else if(marks>=301 && marks<=400) {
			grade='B';
			
		}
		else if(marks>=401 && marks<=500)
		{
			grade='A';
		}
		else {
			grade='F';
		}
		
		if(grade=='F')
		{
			System.out.println("Fail in examination");
		}
		else {
			System.out.println("Grade: " + grade);
		}
		
//		per=(int)(marks/500*100);
//		System.out.println("Percentage: " + per);
		
	}

}
