package com.design.patterns.creational.singleton;

public class LazyInitialization {
	
	private static LazyInitialization instance = null;
	
	private LazyInitialization(){
		
	}
	
	public static LazyInitialization getInstance(){
		if(null==instance){
			instance = new LazyInitialization();
		}
		return instance;
	}

}
