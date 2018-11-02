package com.design.patterns.structural.decorator;

public class MeatBurgerDecorator extends BurgerDecorator{

	public MeatBurgerDecorator(Burger burger) {
		super(burger);
	}
	@Override
	public Integer price() {
		return customBurger.price() + 3;
	}

}
