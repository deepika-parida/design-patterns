package com.design.patterns.creational.factory;

public class ValentineCard extends Card{

	@Override
	public String message(String to, String from) {
		StringBuilder s = new StringBuilder("To ").append(to);
		s.append("Happy Valentine Day");
		s.append("From ").append(from);
		return s.toString();
	}
	
	public ValentineCard(String to, String from) {
		setMessage(message(to,from));
	}
}
