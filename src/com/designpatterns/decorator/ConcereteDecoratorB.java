package com.designpatterns.decorator;

public class ConcereteDecoratorB extends AbstractDecorator {

	public ConcereteDecoratorB(IComp component) {
		super(component);
	}
	
	@Override
	public void printClassName() {
		System.out.println("Concerete Decorator B");
		super.printClassName();
	}

}
