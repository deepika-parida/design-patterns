package com.design.patterns.creational.factory;

public class BirthdayCard extends Card {

	@Override
	public String message(String to, String from) {
		StringBuilder s = new StringBuilder("To ").append(to);
		s.append("Wish you a very Happy Birthday");
		s.append("From ").append(from);
		return s.toString();
	}
	
	public BirthdayCard(String to, String from) {
		setMessage(message(to,from));
	}

}
