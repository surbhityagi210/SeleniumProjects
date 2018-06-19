package Session_4_Questions;

import java.util.Arrays;
import java.util.Scanner;

public class QuesD_17 {
	public static int[] uniquearray(int[] arr) {
		System.out.println("Elements of array are:");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");
		}
		int uniquearrlength = arr.length;
		for (int i = 0; i < uniquearrlength; i++) {
			for (int j = i + 1; j < uniquearrlength; j++) {
				if (arr[i] == arr[j]) {
					arr[j]=arr[uniquearrlength-1];
					uniquearrlength--;
					j--;
				}

			}
		}

		int[] newarr = Arrays.copyOf(arr, uniquearrlength);
		System.out.println("Array with unique elements:");
		for (int i = 0; i < newarr.length; i++) {
			System.out.print(newarr[i] + " ");
		}
		return newarr;
	}

	public static void main(String[] args) {
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
		uniquearray(arr1);
	}

	
}
