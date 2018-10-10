package com.designpatterns.builder;

import java.util.ArrayList;
import java.util.List;

public class ChickenPizza extends PizzaBuilder {
	Pizza pizza;

	public ChickenPizza() {
		pizza = new Pizza();
	}

	@Override
	public void buildPizzaBase() {
		pizza.setPizzaBase("HandToasted");
	}

	@Override
	public void buildPizzaSauce() {
		pizza.setPizzaSauce("Garlic Sauce");
	}

	@Override
	public void buildPizzaCheese() {
		pizza.setCheeseType("Cheddar Cheese");
	}

	@Override
	public void buildPizzaTopings() {
		List<String> topings = new  ArrayList<String>();
		topings.add("Chicken");
		topings.add("Mushrooms");
		topings.add("Jalapeno");
		pizza.setTopings(topings);
	}

	public Pizza getPizza() {
		return this.pizza;
	}

}
