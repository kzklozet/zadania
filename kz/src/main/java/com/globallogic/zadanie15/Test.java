package com.globallogic.zadanie15;
class A {
	public A() {
		System.out.print("A_");
	}
	public void showValue() {
		System.out.print("A_");

	}
}

class B extends A {
	String val = "B_";
	public B() {
		System.out.print("B_");
	}
}

class C extends B {
	public C() {
		System.out.print("C_");
	}
	public void showValue() {
		System.out.print(val);
	}
}
public class Test {

	public static void main(String[] args) {
		C c = new C();
		c.showValue();

		A a = new A();
		a.showValue();
	}

}
