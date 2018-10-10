package com.himanshu.patterns.factory;

public class PizzaStore {
	
	/*
	 * We will move the object creation strategy to the factory class so that we avoid writing the same if else block again
	 * Thus wherever in the application if we need the object of the pizza we will use the factory class
	 * original
	 * 
	 *  Pizza pizza = null;
		if (type.equals("cheese")) {
			pizza = new CheesePizza();
		} else if (type.equals("chicken")) {
			pizza = new ChickenPizza();
		} else if (type.equals("veggie")) {
			pizza = new VeggiePizza();
		}

		pizza.prepare();
		pizza.bake();
		pizza.cut();

		return pizza;
	 */

	public Pizza orderPizza(String type) {
		Pizza pizza = PizzaFactory.createPizza(type);
		if(pizza != null) {
			pizza.prepare();
			pizza.bake();
			pizza.cut();
		}
		return pizza;
	}
}

