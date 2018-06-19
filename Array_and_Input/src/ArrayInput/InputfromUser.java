package ArrayInput;

import java.util.Scanner;

public class InputfromUser {
	public static void main(String[] args)
	{
		@SuppressWarnings("resource")
		Scanner a = new Scanner(System.in);
		int n;
		
		System.out.println("enter data : ");
		n = a.nextInt();
		
		String s;
		System.out.println("enter fname : ");
		s= a.next(); //this
		
		
		System.out.println("u have entered : "+n);
		System.out.println("u have entered : "+s);
		
		
		int aa[] = new int[4];
		for(int i=0; i<4;i++)
		{
			System.out.println("enter data : ");
			aa[i] = a.nextInt();
				
		}
		
	}

}
