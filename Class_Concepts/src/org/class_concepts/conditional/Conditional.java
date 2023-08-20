package org.class_concepts.conditional;

public class Conditional {

	public static void main(String[] args) {

//		if condition
		int a = 10;
		if (a % 2 == 0)
			System.out.println("True");

//		if-else condition
		a = 11;
		if (a % 2 != 0)
			System.out.println("Even");
		else
			System.out.println("Odd");

//		if-else if-else condition
		a = 0;
		if (a > 0)
			System.out.println("Positive number");
		else if (a < 0)
			System.out.println("Negative number");
		else
			System.out.println("Zero");

//		Switch condition
		a = 7;
		switch (a) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		default:
			System.out.println("Invalid");
		}
	}

}
