package org.class_concepts.class_loading;

public class Load {
	public Load() {
		System.out.println("Class has been loaded into the JVM");
		System.out.println(this);
	}

	public static void main(String[] args) {
		Load l = new Load();
	}
}
