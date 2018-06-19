package CURD;

import java.util.Scanner;

public class CURD {

	int arr[] = new int[5];
	int arr1[] = new int[arr.length + 1];
	int index, element;
	Scanner SC = new Scanner(System.in);

	void create() {
		System.out.println("Enter array elements:");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = SC.nextInt();
		}
	}

	void insert() {
		if(arr[0]==0 && arr[1]==0)
		{
			create();
		}
		System.out.println("Enter the index at which you want to insert:");
		index = SC.nextInt();
		System.out.println("Enter the element to insert:");
		element = SC.nextInt();
		for (int k = 0; k < arr1.length; k++) {
			if (k < index) {
				arr1[k] = arr[k];
			} else if (k == index) {
				arr1[k] = element;
			} else {
				arr1[k] = arr[k - 1];
			}
		}

		System.out.println("New array after insert:");
		for (int i : arr1) {
			System.out.print(i + " ");
		}
	}

	void update() {
		if(arr1[0]==0 && arr1[1]==0)
		{
			insert();
		}
		System.out.println("Enter the index at which you want to insert:");
		index = SC.nextInt();
		System.out.println("Enter the element to insert:");
		element = SC.nextInt();
		for (int j = 0; j > index; j++) {
			arr1[j] = arr1[j - 1];
		}
		arr1[index] = element;
		System.out.println("New array after update:");
		for (int i : arr1) {
			System.out.print(i + " ");
		}
	}

	void delete() {
		if(arr1[0]==0 && arr1[1]==0)
		{
			update();
		}
		System.out.println("Enter the index from which you want to delete:");
		index = SC.nextInt();
		System.out.println("Array after deletion:");
		for (int k = 0; k < arr1.length; k++) {
			if (k < index) {
				System.out.print(arr1[k] + " ");
			} else if (k >= index) {
				System.out.print(arr1[k + 1] + " ");
			}
		}
		/*
		 * for(int k=0;k<arr1.length;k++) { if(k<index) { arr[k]=arr1[k]; } else
		 * if(k>index) { arr[k-1]=arr1[k]; } }
		 * System.out.println("Array after deletion:"); for(int i:arr) {
		 * System.out.println(i); }
		 */

	}
	void display()
	{
		if(arr[0]==0 && arr[1]==0)
		{
			create();
		}
		System.out.println("Array elements are:");
		for(int i =0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}
