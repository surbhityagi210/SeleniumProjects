package Session_4_Questions;

import java.util.Scanner;

public class QuesD12 {

	public static void main(String[] args) 
	{
		int n1, n2;
		int temp=5;
		


		@SuppressWarnings("resource")
		Scanner SC = new Scanner(System.in);
		System.out.println("Enter the size of array A:");
		n1 = SC.nextInt();
		int A[] = new int[n1];
		System.out.println("Enter values of array A:");
		
		for(int i = 0; i<n1;i++)
		{
			A[i] = SC.nextInt();
		}
		
		System.out.println("Enter the size of array B:");
		n2 = SC.nextInt();
		int B[] = new int[n2];
		System.out.println("Enter values of array B:");
		
		for(int i = 0; i<n2;i++)
		{
			B[i] = SC.nextInt();
		}
		
		for (int j=3;j<n2;j++)
		{
			A[temp]=B[j];
			temp++;
		}
		for(int k=0;k<A.length;k++)
		{
			System.out.println(A[k]);
		}
		
	}

}
