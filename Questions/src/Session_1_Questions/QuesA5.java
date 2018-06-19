package Session_1_Questions;

import java.util.Scanner;

public class QuesA5 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		int radius;
		double area;
		double circumference;
		@SuppressWarnings("resource")
		Scanner SC = new Scanner(System.in);
		
		System.out.print("Enter radius of circle:");
		radius = SC.nextInt();
		
		area = (3.14*(Math.pow(radius, 2)));
		circumference = (2*3.14*radius);
		
		System.out.println("Area of circle is:" +area);
		System.out.println("Circumference of circle is:" +circumference);
		
	}

}
