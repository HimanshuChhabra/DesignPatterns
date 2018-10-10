package com.designpatterns.decorator;

public class AbstractDecorator implements IComp {

	IComp component = null;

	public  AbstractDecorator(IComp component) {
		this.component = component;
	}

	@Override
	public void printClassName() {
		component.printClassName();
	}

}
