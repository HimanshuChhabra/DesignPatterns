package com.designpatterns.builder;

abstract public class PizzaBuilder {

	abstract public void buildPizzaBase();

	abstract public void buildPizzaSauce();

	abstract public void buildPizzaCheese();

	abstract public void buildPizzaTopings();

	abstract public Pizza getPizza();
}
