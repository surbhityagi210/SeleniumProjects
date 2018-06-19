package Session_4_Questions;

import java.util.Scanner;

public class QuesD13 {

	public static void main(String[] args) {
		int n;

		@SuppressWarnings("resource")
		Scanner SC = new Scanner(System.in);
		System.out.println("Enter length of array:");
		n = SC.nextInt();

		int arr[] = new int[n];
		int r=0;
		int q=0;
		int num=0;
		int total=0;
		
		System.out.println("Enter elements of array:");
		for (int i = 0; i < n; i++)
		{
			arr[i] = SC.nextInt();
		}
		System.out.print("Palindrome numbers are:");
		for(int i=0;i<n;i++)
		{
			 num = arr[i];
			
			while(num>0)
			{
			r = num % 10;
			q = (q * 10) + r;
			num = num / 10;
			}
		
			if (arr[i] == q) {
				System.out.println(q);
				total=total+q;
			}
			q=0;
		}
		System.out.println("Sum of palindrome numbers are:"+total);

	}

}
