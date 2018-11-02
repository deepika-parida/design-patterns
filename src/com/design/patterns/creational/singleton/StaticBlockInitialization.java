package com.design.patterns.creational.singleton;

public class StaticBlockInitialization {
	
	private static StaticBlockInitialization instance = null;
	
	private StaticBlockInitialization(){
		
	}
	
	static{
		try{
			instance = new StaticBlockInitialization();
		}catch(Exception exc){
			System.out.println("Unable to create an instance of the class");
		}
	}
	
	public static StaticBlockInitialization getInstance(){
		return instance;
	}

}
