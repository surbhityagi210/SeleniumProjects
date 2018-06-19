package Constructors;

public class taxpayer {

	private int pan;
	private char name[];
	private float income;
	private float tax;
	final int taxslab1 = 100000;
	final int taxslab2 = 200000;
	final int taxslab3 = 500000;

	taxpayer(int p1, char na[], float i1) {
		pan = p1;
		name = na;
		income = i1;
	}

	void input(int p, char n[], float i) {

		pan = p;
		name = n;
		income = i;

	}

	void calctax() {
		if (income <= taxslab1) {
			tax = income;
		} else if (income > taxslab1 && income <= taxslab2) {
			tax = (float) (0.1 * (income));
		} else if (income > taxslab2 && income <= taxslab3) {
			tax = (float) (0.15 * income);
		} else if (income >= taxslab3) {
			tax = (float) (0.20 * income);
		}
	}

	void display() {
		System.out.println("Name of Employee:" + String.valueOf(name));
		System.out.println("PAN of Employee:" + pan);
		System.out.println("Income of Employee:" + income);
		System.out.println("Tax of Employee:" + tax);
	}

}
