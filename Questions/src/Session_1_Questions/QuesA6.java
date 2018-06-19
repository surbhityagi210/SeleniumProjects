package Session_1_Questions;

import java.util.Scanner;

public class QuesA6 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		int length;
		int breadth;
		int area;
		int perimeter;
		
		@SuppressWarnings("resource")
		Scanner SC = new Scanner(System.in);
		System.out.print("Enter length of rectangle:");
		length = SC.nextInt();
		System.out.print("Enter breadth of rectangle: ");
		breadth = SC.nextInt();
		
		area = length*breadth;
		perimeter = 2*(length+breadth);
		
		System.out.println("Area of rectangle is:" +area);
		System.out.println("Perimeter of rectangle is:" +perimeter);
		
	}

}
