package org.class_concepts.conditional;

public class Looping {

	public static void main(String[] args) {

//		while loop
		int i = 1;
		while (i <= 5) {
			System.out.println(i);
			i++;
		}
		System.out.println();

//		do while loop
		i=5;
		do {
			System.out.println(i);
			i--;
		} while (i > 0);
		System.out.println();

//		for loop
		for (i = 1; i <= 10; i++)
			if (i % 2 == 0)
				System.out.println(i);
	}

}
