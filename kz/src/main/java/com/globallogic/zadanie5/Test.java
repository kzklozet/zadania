package com.globallogic.zadanie5;

public class Test {

	public static void main(String[] args) {
		Person p1 = new Person("Jack");
		foo(p1);
		System.out.println(p1.getName());
		bar(p1);
		System.out.println(p1.getName());
	}
	public static void foo(Person p) {
		p = new Person("Max");
		p.setName("John");
	}
	public static void bar(Person p) {
		p.setName("Anna");
	}

}
