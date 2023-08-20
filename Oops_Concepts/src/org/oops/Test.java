package org.oops;

public class Test extends OverridingDemo {
	public void pavanActions(String act) {
		System.out.println("Pavan Bro " + act);
	}

	public static void main(String[] args) {
		Test t = new Test();
		t.pavanActions("Sings");
		System.out.println(t.hashCode());
		
	}

}
