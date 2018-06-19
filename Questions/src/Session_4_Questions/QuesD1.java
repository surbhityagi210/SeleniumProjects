package Session_4_Questions;

import java.util.Scanner;

public class QuesD1 {

	public static void main(String[] args) 
	{
		int marks[]=new int[10];
		int c=0;
		@SuppressWarnings("resource")
		Scanner SC = new Scanner(System.in);
		System.out.println("Enter marks of 10 students:");
		//to take input in array//
		for(int i=0;i<10;i++)
		{
			marks[i]= SC.nextInt();
		}
		//to print values//
		for(int j=0;j<10;j++)
		{
			c++;
		System.out.println("Marks of student"+" "+ c+" "+ "is:"+ " "+marks[j]);
		}
	}

}
