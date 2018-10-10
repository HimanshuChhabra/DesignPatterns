package com.designpatterns.builder;

public class Client {

	public static void main(String[] args) {
		PizzaBuilder pizzaBuilder = new VeggiePizza();
		
		PizzaStore store = new PizzaStore(pizzaBuilder);
		
		store.bakePizza();
		
		Pizza pizza = store.getPizza();
		
		System.out.println(pizza);
	}

}
