package com.globallogic.zadanie7;

public class JavaTest {

	public static void main(String[] args) {
		A a = new A();
		a.foo();

		B b = new B();
		b.foo();
		b.bar();

		A ab = new B();
		ab.foo();
	}

}

class A {
	public void foo() {
		System.out.println("Foo");
	}
}
class B extends A {

	public void foo() {
		System.out.println("Bar");

	}
	public void bar() {
		System.out.println("Suprise");

	}
}