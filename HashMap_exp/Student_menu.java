package HashMap_exp;
import java.util.HashMap;
import java.util.Scanner;

public class Student_menu {
	public static void main(String[] args) {
		int choice;
		Scanner sc=new Scanner(System.in);
		Student_det op=new Student_det();
		HashMap<Integer,Student> obj=new HashMap<>();
		do {
			System.out.println("1. Add Details");
			System.out.println("2. Update details");
			System.out.println("3. Search Details");
			System.out.println("4. Delete Details");
			System.out.println("5. Display Details");
			System.out.println("6.Exit");
			System.out.print("Enter choice: ");
			choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				obj=op.add_details();
				break;
				
			case 2:
				op.update_det(obj);
				break;
				
			case 3:
				op.search_det(obj);
				break;
				
			case 4: 
				op.del_det(obj);
				break;
				
			case 5:
				op.disp_det(obj);
				break;
			case 6:
				System.out.println("Exit");
				break;
				
			default:
				System.out.println("Wrong option");
				break;
			}
		}while(choice!=6);
	}

}
