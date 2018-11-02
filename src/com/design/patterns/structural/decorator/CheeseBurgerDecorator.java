package com.design.patterns.structural.decorator;

public class CheeseBurgerDecorator extends BurgerDecorator{

	public CheeseBurgerDecorator(Burger burger) {
		super(burger);
	}
	
	@Override
	public Integer price() {
		return customBurger.price() + 2;
	}

}
