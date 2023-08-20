package org.collection_framework;

import java.util.ArrayList;
import java.util.Collection;

public class ArrayListEx {

	public static void main(String[] args) {
		ArrayList<String> animals = new ArrayList<>();
		Collection<String> col = new ArrayList<>();
		// Add elements
		col.add("HEY");
		animals.add("Dog");
		animals.add("Cat");
		animals.add("Horse");
		System.out.println(col.toString());
		System.out.println("ArrayList: " + animals.get(0));
	}

}
