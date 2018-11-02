package com.design.patterns.creational.factory;

public class MarriageAnniversaryCard extends Card {

	@Override
	public String message(String to, String from) {
		StringBuilder s = new StringBuilder("To ").append(to);
		s.append("Wish you a very Happy Marriage Anniversary");
		s.append("From ").append(from);
		return s.toString();
	}
	
	public MarriageAnniversaryCard(String to, String from) {
		setMessage(message(to,from));
	}
}
