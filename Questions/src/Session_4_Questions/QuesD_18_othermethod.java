package Session_4_Questions;

import java.util.Scanner;

public class QuesD_18_othermethod {
	
	public static int[] findduplicatearray(int[] arr)
	{
		int i=1;
		int j=0;
		if(arr.length<2)
		{
			return arr;
		}
		while(i<arr.length)
		{
			if(arr[i]==arr[j])
			{
				i++;
			}
			else
			{
				arr[++j]=arr[i++];
			}
		}
		int[] arrnew = new int[j+1];
		for(int k=0;k<arrnew.length;k++)
		{
			arrnew[k]=arr[k];
		}
		return arrnew;
		
	}

	public static void main(String[] args)
	{
		int n = 0;

		@SuppressWarnings("resource")
		Scanner SC = new Scanner(System.in);
		System.out.println("Enter length of array:");
		n = SC.nextInt();

		int arr1[] = new int[n];
		System.out.println("Enter elements of array:");
		for (int i = 0; i < n; i++) {
			arr1[i] = SC.nextInt();
		}
		int[] arrnew = findduplicatearray(arr1);
		for(int k:arrnew)
		{
			System.out.print(k+" ");
		}
		
	}

}
