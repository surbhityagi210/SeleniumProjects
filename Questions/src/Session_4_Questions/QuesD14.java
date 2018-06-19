package Session_4_Questions;

import java.util.Scanner;

public class QuesD14 {

	public static void main(String[] args) {
		int n;
		@SuppressWarnings("unused")
		int num = 0;
		boolean Prime = true;
		int sum = 0;

		@SuppressWarnings("resource")
		Scanner SC = new Scanner(System.in);
		System.out.println("Enter the length of array:");
		n = SC.nextInt();

		int arr[] = new int[n];
		System.out.println("Enter values of array:");
		for (int i = 0; i < n; i++) {
			arr[i] = SC.nextInt();
		}
		for (int j = 0; j < n; j++) {
			Prime = true;
			if(arr[j]==1)
			{
				Prime = false;
			}
			for (int k = 2; k < arr[j]&& Prime ==true; k++) {
				if (arr[j] % k == 0) {
					Prime = false;
				}
			}
			if (Prime) {
				System.out.println(arr[j]);
				sum = sum + arr[j];
			}
		}
		System.out.println("Sum of prime numbers are:" + sum);
		System.gc();
	}
}
