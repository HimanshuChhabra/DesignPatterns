package com.designpatterns.builder;

public class PizzaStore {
	PizzaBuilder pizzaBuilder;

	public PizzaStore(PizzaBuilder pizzaBuilder) {
		this.pizzaBuilder = pizzaBuilder;
	}
	
	public void bakePizza() {
		pizzaBuilder.buildPizzaBase();
		pizzaBuilder.buildPizzaSauce();
		pizzaBuilder.buildPizzaCheese();
		pizzaBuilder.buildPizzaTopings();
	}
	
	public Pizza getPizza() {
		return pizzaBuilder.getPizza();
	}

}
