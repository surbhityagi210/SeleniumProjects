package Session_4_Questions;

import java.util.Scanner;

public class QuesD5 {
	public static void main(String args[])
	{
	
		int n;
		int total=0;
		int avg;
		@SuppressWarnings("resource")
		Scanner SC = new Scanner(System.in);
		System.out.println("Enter length of array:");
		n=SC.nextInt();
		
		int val[]=new int[n];
		System.out.println("Enter values:");
		for(int i=0;i<n;i++)
		{
			val[i] = SC.nextInt();
			total = total+val[i];
		}
		avg = total/n;
		System.out.println("Average of entered values are:" +avg);
		for(int j=0;j<n;j++)
		{
			if(val[j]>=avg)
			{
				System.out.println("Values more than average are:" + val[j]);
			}
		}
	}

}
