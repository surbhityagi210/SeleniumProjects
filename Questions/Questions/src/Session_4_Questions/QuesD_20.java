package Session_4_Questions;

import java.util.Arrays;
import java.util.Scanner;

public class QuesD_20 {

	public static void main(String[] args) {
		int n=0;
		int index;
		int element;
		@SuppressWarnings("resource")
		Scanner SC = new Scanner(System.in);
		System.out.println("Enter length of array:");
		n=SC.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter elements of array:");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=SC.nextInt();
		}
		System.out.println("Enter the index:");
		index = SC.nextInt();
		System.out.println("Enter the element to insert at given index:");
		element = SC.nextInt();
		/*for(int j=arr.length-1;j>index;j--)
		{
			arr[j]=arr[j-1];
			
		}*/
		arr[index]=element;
		int newarr[]=new int[arr.length+1];
		for(int k=0;k<arr.length+1;k++)
		{
			if(index>k)
			newarr[k]=arr[k-1];
			else
			newarr[k]=arr[k];
		}
		newarr[index]=element;
		System.out.println("New array is:");
		for(int i:newarr)
		{
			Arrays.sort(newarr);
			System.out.println(i);
		}
	}

}
