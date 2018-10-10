package com.designpatterns.decorator;

public class Client {

	public static void main(String[] args) {
		IComp compo = new ConcereteDecoratorB(new ConcereteDecoratorA(new ConcereteComp()));
		compo.printClassName();
	}
}
