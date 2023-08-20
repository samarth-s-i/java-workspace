package org.collection_framework;

import java.util.ArrayList;
import java.util.Collection;

public class ColMethodDemo {

	public static void main(String[] args) {
		Collection<String> cscol = new ArrayList<String>();
		cscol.add("Sam");
		cscol.add("Sona");
		cscol.add("Dash");
		cscol.add("Peter");
		cscol.add("Racquel");
		Collection<String> engcol = new ArrayList<String>();
		engcol.addAll(cscol);
		cscol.remove("Peter");
		System.out.println(cscol);
		cscol.removeAll(cscol);
		System.out.println(cscol.size());
		System.out.println(engcol);
		System.out.println(engcol.contains("peter"));
		Object[] arr=engcol.toArray();
		try {
		System.out.println(arr[4]);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
