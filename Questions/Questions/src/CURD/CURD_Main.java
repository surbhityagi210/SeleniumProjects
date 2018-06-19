package CURD;

import java.util.Scanner;

public class CURD_Main {
	public static void fnswitch(int choice, CURD c) {
		switch (choice) {
		case 1:
			c.create();
			break;
		case 2:
			c.insert();
			break;
		case 3:
			c.update();
			break;
		case 4:
			c.delete();
			break;
		case 5:
			c.display();
			break;
		default:
			System.out.println("Choice doesn't exists");
		}
		System.out.println("Enter another choice:");
		Scanner sc = new Scanner(System.in);
		choice = sc.nextInt();
		fnswitch(choice, c);
	}

	public static void main(String[] args) {
		CURD c = new CURD();
		Scanner sc = new Scanner(System.in);
		int choice;
		System.out.println("Enter your choice: \n1.Create\n2.Insert\n3.Update\n4.Delete\n5.Display");
		choice = sc.nextInt();
		fnswitch(choice, c);

	}

}
