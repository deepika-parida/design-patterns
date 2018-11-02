package com.design.patterns.creational.factory;

public abstract class Card {
	
	private String message;
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	public abstract String message(String to, String from);

}
