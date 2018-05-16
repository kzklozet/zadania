package com.globallogic.zadanie5;

public class Test {

	public static void main(String[] args) {
		Person p1 = new Person("Jack");
		foo(p1);
		System.out.println(p1.getName());
		bar(p1);
		System.out.println(p1.getName());

		/////////////
		System.out.println();

		Person p2 = new Person("Jack");
		p2 = new Person("Max");
		p2.setName("John");
		System.out.println(p2.getName());
		p2.setName("Anna");
		System.out.println(p2.getName());

	}
	public static void foo(Person p) {
		p = new Person("Max");
		p.setName("John");
	}
	public static void bar(Person p) {
		p.setName("Anna");
	}

}
