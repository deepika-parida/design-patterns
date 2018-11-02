package com.design.patterns.structural.decorator;

public class LargeBurgerDecorator extends BurgerDecorator{

	public LargeBurgerDecorator(Burger burger) {
		super(burger);
	}
	
	@Override
	public Integer price() {
		return customBurger.price() + 4;
	}

}
