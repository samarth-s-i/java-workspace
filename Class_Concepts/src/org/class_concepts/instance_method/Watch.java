package org.class_concepts.instance_method;

public class Watch {
	String name;
	int price;

	public Watch(String name, int price) {
		this.name = name;
		this.price = price;
	}

	void hearRate() {
		System.out.println("Heart rate is 74 BPM....");
	}

	void alarm() {
		System.out.println("Alarm ringing");
	}

	public static void main(String[] args) {
		Watch w = new Watch("FireBoltt", 2000);
		System.out.println("Watch Info-");
		System.out.println("----------------------");
		System.out.println("Name: " + w.name);
		System.out.println("Price: " + w.price);
		System.out.println("----------------------");
		w.hearRate();
		w.alarm();
	}
}
