package Session_4_Questions;

import java.util.Scanner;

public class QuesD2 {

	public static void main(String[] args)
	{
		int num[]=new int [10];
		int x;
		int count=0;
		
		@SuppressWarnings("resource")
		Scanner SC = new Scanner(System.in);
		
		System.out.println("Enter numbers:");
		for(int i=0;i<10;i++)
		{
			num[i]=SC.nextInt();
		}
		
		System.out.println("Enter the element of which you want to count number of occurrences:");
		x = SC.nextInt();
		
		for(int j = 0; j<10; j++)
		{
			if(num[j]==x)
			{
				count++;
			}
		}
		System.out.println("Number is appearing:" + " "+count + " "+"times.");
		

	}

}
