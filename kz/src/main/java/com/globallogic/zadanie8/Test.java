package com.globallogic.zadanie8;

class A {
	public static int x;
	public void setNumber(int x) {
		this.x = x;

	}
}
public class Test {

	public static void main(String[] args) {

		A a = new A();
		a.setNumber(5);
		A b = new A();
		b.setNumber(10);
		System.out.println(a.x + " " + b.x);
	}

}
