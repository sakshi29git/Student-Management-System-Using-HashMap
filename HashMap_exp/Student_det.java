package HashMap_exp;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Student_det {
	HashMap<Integer,Student> obj=new HashMap<>();
	Scanner sc=new Scanner(System.in);
	
	HashMap<Integer,Student> add_details()
	{
		Student s=new Student();
		obj.put(s.roll, s);
		return obj;
	}
	
	
	void search_det(HashMap<Integer,Student> obj)
	{
		int num;
		System.out.println("Enter roll number: ");
		num=sc.nextInt();
		for(Map.Entry<Integer, Student>m : obj.entrySet())
		{
			if(m.getValue().roll==num)
			{
				m.getValue().disp();
			}
		}
	}
	
	
	void update_det(HashMap<Integer,Student> obj)
	{
		int num,std,marks,choice;
		String fname,mname,sname,div,sub;
		System.out.println("Enter roll number:");
		num=sc.nextInt();
		System.out.println("Which details do you want to enter: ");
		System.out.println("1. Update Name");
		System.out.println("2. Update standard");
		System.out.println("3. Update Division");
		System.out.println("4. Update marks");
		System.out.println("5. Update subject");
		System.out.print("Your choice");
		choice=sc.nextInt();
		if(choice==1)
		{
			System.out.println("Enter new name: ");
			System.out.println("Enter first name: ");
			fname=sc.next();
			System.out.println("Enter middle name: ");
			mname=sc.next();
			System.out.println("Enter last name : ");
			sname=sc.next();
			
			for(Map.Entry<Integer, Student> m : obj.entrySet())
			{
				if(m.getValue().roll==num)
				{
					m.getValue().fname=fname;
					m.getValue().mname=mname;
					m.getValue().sname=sname;
				}
			}
		}
		
		else if(choice==2)
		{
			System.out.println("Enter new standard: ");
			std=sc.nextInt();
			
			for(Map.Entry<Integer, Student> m : obj.entrySet())
			{
				if(m.getValue().roll==num)
				{
					m.getValue().std=std;
				}
			}
		}
		
		else if(choice==3)
		{
			System.out.println("Enter new Division: ");
			div=sc.next();
			
			for(Map.Entry<Integer, Student> m : obj.entrySet())
			{
				if(m.getValue().roll==num)
				{
					m.getValue().div=div;
				}
			}
		}
		
		else if(choice==4)
		{
			System.out.println("Enter new marks: ");
			marks=sc.nextInt();
			
			for(Map.Entry<Integer, Student> m : obj.entrySet())
			{
				if(m.getValue().roll==num)
				{
					m.getValue().marks=marks;
				}
			}
		}
		
		
		else if(choice==5)
		{
			System.out.println("Enter new subject: ");
			std=sc.nextInt();
			
			for(Map.Entry<Integer, Student> m : obj.entrySet())
			{
				if(m.getValue().roll==num)
				{
					m.getValue().std=std;
				}
			}
		}
		
		else {
			System.out.println("Wrong roll number");
			return;
			
		}
		
	}
	
	void del_det(HashMap<Integer,Student> obj)
	{
		int num;
		boolean found=false;
		System.out.println("Enter roll number: ");
		num=sc.nextInt();
		int n;
		for(Map.Entry<Integer, Student> m : obj.entrySet())
		{
			if(m.getValue().roll==num)
			{
				obj.remove(m.getKey(),m.getValue());
				found=true;
			}
		}
		if(found)
		{
			System.out.println("Information deleted sucessfully");
		}
		else {
			System.out.println("Can't find information");
		}
		
	}
	
	
	void disp_det(HashMap<Integer,Student> obj)
	{
		boolean found=false;
		double per;
			for(Map.Entry<Integer, Student> m : obj.entrySet())
			{
					System.out.println(m.getKey());
					m.getValue().disp();
					found=true;
				per=(m.getValue().marks*100)/500;
				System.out.println("Percentage: " + per);
				}
			
	if(!found)
	{
		System.out.println("List is empty");
	}	
		
	}
	}
	
		

	


