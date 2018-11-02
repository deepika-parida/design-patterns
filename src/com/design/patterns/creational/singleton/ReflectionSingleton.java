package com.design.patterns.creational.singleton;

import java.lang.reflect.Constructor;

public class ReflectionSingleton {
	
	public static void main(String[] args) {
		EagerInitialization a = EagerInitialization.getInstance();
		System.out.println(a);
		EagerInitialization b = null;
		try{
		Constructor[] constructors = EagerInitialization.class.getDeclaredConstructors();
		for (Constructor constructor : constructors) {
			constructor.setAccessible(true);
			b = (EagerInitialization) constructor.newInstance();
			break;
		}
		}catch(Exception exc){
			System.out.println("Exception while cretaing new instance using reflection");
		}
		System.out.println(b);
	}

}
