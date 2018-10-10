package com.himanshu.patterns.factory;

public class PizzaFactory {

	public static Pizza createPizza(String type) {
		Pizza pizza = null;

		if (type == "cheese") {
			pizza = new CheesePizza();
		} else if (type == "chicken") {
			pizza = new ChickenPizza();
		} else if (type == "veggie") {
			pizza = new VeggiePizza();
		}

		return pizza;
	}
}
