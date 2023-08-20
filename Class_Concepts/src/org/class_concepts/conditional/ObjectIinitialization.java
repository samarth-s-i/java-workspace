package org.class_concepts.conditional;

public class ObjectIinitialization {
	String name = "acer";
	int age = 5;

	void display() {
		System.out.println(this.name);
	}

	public static void main(String[] args) {
		ObjectIinitialization o = new ObjectIinitialization();
		o.display();
		System.out.println(o.age);
	}

	@Override
	public String toString() {
		return "ObjectIinitialization [name=" + name + ", age=" + age + "]";
	}
}
