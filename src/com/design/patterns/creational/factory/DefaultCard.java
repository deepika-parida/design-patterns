package com.design.patterns.creational.factory;

public class DefaultCard extends Card {

	@Override
	public String message(String to, String from) {
		StringBuilder s = new StringBuilder("To ").append(to);
		s.append("Best Wishes");
		s.append("From ").append(from);
		return s.toString();
	}
	
	public DefaultCard(String to, String from) {
		setMessage(message(to,from));
	}

}
