package Session_6_Questions;

import java.util.Scanner;

public class QuesD14 {

	public static void main(String[] args) {
		
		int primearr[] = new int[10];
		Scanner SC = new Scanner(System.in);
		QuesD14_1 obj = new QuesD14_1();
		
		System.out.println("Enter the values:");
		for(int i=0;i<primearr.length;i++) 
		{
			primearr[i] = SC.nextInt();
		}
		System.out.println("Values of array are:");
		for(int j=0;j<primearr.length;j++)
		{
			System.out.println(primearr[j]);	
		}
		System.out.println("Prime numbers are:");
		obj.primenum(primearr);
		

	}

}
