package com.design.patterns.creational.factory;

public class FathersDayCard extends Card {

	@Override
	public String message(String to, String from) {
		StringBuilder s = new StringBuilder("To ").append(to);
		s.append("Wish you a very Happy Father's Day. You are my hero");
		s.append("From ").append(from);
		return s.toString();
	}
	
	public FathersDayCard(String to, String from) {
		setMessage(message(to,from));
	}

}
