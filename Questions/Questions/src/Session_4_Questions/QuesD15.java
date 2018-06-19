package Session_4_Questions;

import java.util.Scanner;

public class QuesD15 {

	public static void main(String[] args) {
		float arr[] = new float[10];
		@SuppressWarnings("resource")
		Scanner SC = new Scanner(System.in);
		System.out.println("Enter values of array:");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=SC.nextFloat();
		}
		System.out.println("Values more than 75 in array are:");
		for(int j=0;j<arr.length;j++)
		{
			if(arr[j]>75)
			{
				System.out.println(arr[j]);
			}
		}
		

	}

}
