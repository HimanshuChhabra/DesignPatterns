package com.designpatterns.builder;

import java.util.ArrayList;
import java.util.List;

public class VeggiePizza extends PizzaBuilder {
	Pizza pizza;

	public VeggiePizza() {
		pizza = new Pizza();
	}

	@Override
	public void buildPizzaBase() {
		pizza.setPizzaBase("Thin Crust");
	}

	@Override
	public void buildPizzaSauce() {
		pizza.setPizzaSauce("Tomato Sauce");
	}

	@Override
	public void buildPizzaCheese() {
		pizza.setCheeseType("American Cheese");
	}

	@Override
	public void buildPizzaTopings() {
		List<String> topings = new  ArrayList<String>();
		topings.add("Onions");
		topings.add("Green Peppers");
		pizza.setTopings(topings);
	}

	public Pizza getPizza() {
		return this.pizza;
	}

}
