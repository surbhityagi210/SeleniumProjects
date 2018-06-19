package Session_4_Questions;

import java.util.Scanner;

public class QuesD4 {

	public static void main(String[] args) 
	{
		int sales[]=new int[12];
		@SuppressWarnings("resource")
		Scanner SC = new Scanner(System.in);
		int month = 0;
		int total=0;
		int l = sales.length;
		int avg;
		
		for(int i=0;i<12;i++)
		{
			month++;
			System.out.println("Enter sales of"+" "+ month+" "+"month :");
			sales[i]=SC.nextInt();
			total = total+sales[i];
		}
		int min = sales[0];
		int max = sales[0];
		
		avg = total/l;
		for(int j=0;j<l;j++)
		{
			if(sales[j]<min)
			{
				min = sales[j];
			}
			if(sales[j]>max)
			{
				max = sales[j];
			}
		}
		System.out.println("Total sales of all months is:" + total);
		System.out.println("Average of sales is:" + avg);
		System.out.println("Minimum sales of month is:" + min);
		System.out.println("Maximum sales of month is:" + max);
		

	}

}
