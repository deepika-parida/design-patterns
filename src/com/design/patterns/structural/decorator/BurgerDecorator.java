package com.design.patterns.structural.decorator;

public abstract class BurgerDecorator implements Burger{
	
	protected Burger customBurger;
	
	public BurgerDecorator(Burger burger){
		this.customBurger = burger;
	}

	@Override
	public Integer price() {
		return this.customBurger.price();
	}

}
