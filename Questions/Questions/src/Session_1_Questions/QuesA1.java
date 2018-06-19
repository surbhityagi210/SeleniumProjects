package Session_1_Questions;

import java.util.Scanner;

public class QuesA1 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int roll_number, marks;
		String name, phone;
		
		@SuppressWarnings("resource")
		Scanner SC=new Scanner(System.in);
		
		System.out.print("Enter student Name:");
		name = SC.nextLine();
		System.out.print("Enter student phone number:");
		phone = SC.nextLine();
		System.out.print("Enter student Roll Number:");
		roll_number =SC.nextInt();
		System.out.print("Enter student marks:");
		marks = SC.nextInt();
		
		
		System.out.println("Student Roll Number is:"+roll_number);
		System.out.println("Student Name is:"+name);
		System.out.println("Student marks are:"+marks);
		System.out.println("Student phone number is:"+phone);
		
	}

}
