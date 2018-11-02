package com.design.patterns.creational.factory;

public class MothersDayCard extends Card {

	@Override
	public String message(String to, String from) {
		StringBuilder s = new StringBuilder("To ").append(to);
		s.append("Wish you a very Happy Mother's Day. You are my hero");
		s.append("From ").append(from);
		return s.toString();
	}
	
	public MothersDayCard(String to, String from) {
		setMessage(message(to,from));
	}

}
