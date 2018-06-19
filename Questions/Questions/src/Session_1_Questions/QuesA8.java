package Session_1_Questions;

import java.util.Scanner;

public class QuesA8 {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		int sides;
		int area;
		
		@SuppressWarnings("resource")
		Scanner SC = new Scanner(System.in);
		System.out.print("Enter sides of Square:");
		sides = SC.nextInt();
		
		area = (int) Math.pow(sides, 2);
		System.out.println("Area of square is:" +area);
		
	}

}
