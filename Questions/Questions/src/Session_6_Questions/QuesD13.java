package Session_6_Questions;

import java.util.Scanner;

public class QuesD13 {

	public static void main(String[] args) 
	{
		QuesD13_1 palindromearr[] = new QuesD13_1[5];
		int arr1[]=new int[5];
		QuesD13_1 p = new QuesD13_1();
		@SuppressWarnings("resource")
		Scanner SC = new Scanner(System.in);
		
		System.out.println("Enter the values:");
		for(int i=0;i<palindromearr.length;i++)
		{
			p.n = SC.nextInt();
			palindromearr[i] = new QuesD13_1();
			palindromearr[i].getarr(p.n);
			arr1[i]=p.n;
		}
		System.out.println("Values of array are:");
		for(int j = 0;j<palindromearr.length; j++)
		{
			palindromearr[j].display();
		}
		System.out.println("Palindrome numbers are:");
		p.getpalindromes(arr1);
		
		
	}
	
}
