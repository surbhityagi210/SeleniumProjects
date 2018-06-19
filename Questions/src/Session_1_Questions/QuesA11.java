package Session_1_Questions;

import java.util.Scanner;

public class QuesA11 {

	public static void main(String[] args) {

		char character;
		@SuppressWarnings("resource")
		Scanner SC = new Scanner(System.in);

		System.out.println("Enter the character:");
		character = SC.next().charAt(0);
		int c = character;
		System.out.println(c);

	}

}
