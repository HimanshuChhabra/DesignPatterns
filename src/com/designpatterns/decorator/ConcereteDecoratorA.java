package com.designpatterns.decorator;

public class ConcereteDecoratorA extends AbstractDecorator {

	public ConcereteDecoratorA(IComp component) {
		super(component);
	}

	@Override
	public void printClassName() {
		System.out.println("Concerete Decorator A");
		super.printClassName();
	}
}
