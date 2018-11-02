package com.design.patterns.creational.factory;

public class CardFactory {
	
	public static Card createCard(Occasion occasion, String to, String from){
		Card card;
		switch (occasion) {
		case BIRTHDAY:
			card = new BirthdayCard(to, from);
			break;
		case MARRIAGE_ANNIVERSARY:
			card = new MarriageAnniversaryCard(to, from);
			break;
		case VALENTINES_DAY:
			card = new ValentineCard(to, from);
			break;
		case FATHERS_DAY:
			card = new FathersDayCard(to, from);
			break;
		case MOTHERS_DAY:
			card = new MothersDayCard(to, from);
			break;
		default: card = new DefaultCard(to, from);
		}
		return card;
	}

}
