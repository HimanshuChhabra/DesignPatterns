package com.designpatterns.builder;

import java.util.List;

public class Pizza {

	private String pizzaBase;
	private String pizzaSauce;
	private String cheeseType;
	private List<String> topings;

	public String getPizzaBase() {
		return pizzaBase;
	}

	public void setPizzaBase(String pizzaBase) {
		this.pizzaBase = pizzaBase;
	}

	public String getPizzaSauce() {
		return pizzaSauce;
	}

	public void setPizzaSauce(String pizzaSauce) {
		this.pizzaSauce = pizzaSauce;
	}

	public String getCheeseType() {
		return cheeseType;
	}

	public void setCheeseType(String cheeseType) {
		this.cheeseType = cheeseType;
	}

	public List<String> getTopings() {
		return topings;
	}

	public void setTopings(List<String> topings) {
		this.topings = topings;
	}

	@Override
	public String toString() {
		return "Pizza [ pizzaBase = " + pizzaBase + ", pizzaSauce = " + pizzaSauce + ", cheeseType = " + cheeseType
				+ ", topings= " + topings + "]";
	}

}
