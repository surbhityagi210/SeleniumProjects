package Session_4_Questions;

import java.util.Scanner;

public class QuesD10 {

	public static void main(String[] args) 
	{
		int arr[]=new int[20];
		int ncount=0;
		int pcount=0;
		int ecount=0;
		int ocount=0;
		@SuppressWarnings("resource")
		Scanner SC = new Scanner(System.in);
		System.out.println("Enter values:");
		for(int i=0;i<20;i++)
		{
			arr[i] = SC.nextInt();
		}
		System.out.println("Array is:");
		for(int j =0;j<20;j++)
		{
			System.out.print(arr[j]+" ");
			if(arr[j]<0)
			{
				ncount++;
			}
			if(arr[j]>0)
			{
				pcount++;
			}
			if (arr[j]%2==0)
			{
				ecount++;
			}
			if(arr[j]%2!=0)
			{
				ocount++;
			}
		}
		System.out.println();
		System.out.println("Count for negative values are:"+ncount);
		System.out.println("Count for positive values are:"+pcount);
		System.out.println("Count for even number is:"+ecount);
		System.out.println("Count for odd number is:"+ocount);

	}

}
