package Session_1_Questions;

import java.util.Scanner;

public class QuesA2 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int roll_number, Hindi, Eng, Maths, Science, Art;
		String name;

		@SuppressWarnings("resource")
		Scanner SC = new Scanner(System.in);
		
		System.out.print("Enter Name:");
		name = SC.nextLine();
		System.out.print("Enter Roll Number:");
		roll_number = SC.nextInt();
		System.out.print("Enter Hindi, English, Maths, Science and Arts marks:");
		Hindi = SC.nextInt();
		Eng = SC.nextInt();
		Maths = SC.nextInt();
		Science = SC.nextInt();
		Art = SC.nextInt();
		
		int total = Hindi+Eng+Maths+Science+Art;
		int avg = total/5;
		System.out.println("Student Roll Number is:"+roll_number);
		System.out.println("Student Name is:"+name);
		System.out.println("Student Totla Marks are:"+total);
		System.out.println("Average marks are:"+avg);

	}

}
