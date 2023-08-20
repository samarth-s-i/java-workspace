package org.class_concepts.conditional;

public class VariableShadowing {
	int age = 50;

	int ageDisplay() {
		age = 25;
		return age;
	}

	public static void main(String[] args) {
		int age = 20;
		System.out.println("Inside main method\t: " + age);
		VariableShadowing vs = new VariableShadowing();
		System.out.println("Instance variable\t: " + vs.age);
		System.out.println("Method variable\t\t: " + vs.ageDisplay());
	}

}
