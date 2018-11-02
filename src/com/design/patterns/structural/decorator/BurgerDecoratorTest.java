package com.design.patterns.structural.decorator;

public class BurgerDecoratorTest {
	
	public static void main(String[] args) {
		Burger burger = new LargeBurgerDecorator(new CheeseBurgerDecorator(new BasicBurger()));
		System.out.println(burger.price());
		
		Burger burger1 = new MeatBurgerDecorator(new BasicBurger());
		System.out.println(burger1.price());
	}

}
