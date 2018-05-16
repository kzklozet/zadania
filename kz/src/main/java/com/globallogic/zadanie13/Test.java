package com.globallogic.zadanie13;

abstract class A {
	String name;
	public void setUpDevice() {
		System.out.print(TurnOn() + " " + setVoltage() + " " + setCurrent()
				+ " " + TurnOff());

	}
	public String TurnOff() {
		// TODO Auto-generated method stub
		return "Turned off";
	}
	public String setCurrent() {
		// TODO Auto-generated method stub
		return "5 Volt";
	}
	public String setVoltage() {
		// TODO Auto-generated method stub
		return "6 Amp";
	}
	public String TurnOn() {
		// TODO Auto-generated method stub
		return "Turned on";
	}
}

class B extends A {

	public String setCurrent() {
		// TODO Auto-generated method stub
		return "12 Amp";
	}
}
public class Test {

	public static void main(String[] args) {
		A a = new B();
		a.setUpDevice();
	}

}
