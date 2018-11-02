package com.design.patterns.creational.factory;

public class CardFactoryTest {
	
	public static void main(String[] args) {
		
		Card bCard = CardFactory.createCard(Occasion.BIRTHDAY, "Alex", "Kate");
		System.out.println(bCard.getMessage());
		Card mCard = CardFactory.createCard(Occasion.MOTHERS_DAY, "Mom", "Darling Daughter");
		System.out.println(mCard.getMessage());
		Card fCard = CardFactory.createCard(Occasion.FATHERS_DAY, "Papa", "Darling Daughter");
		System.out.println(fCard.getMessage());
		Card vCard = CardFactory.createCard(Occasion.VALENTINES_DAY, "My love", "Guess who??");
		System.out.println(vCard.getMessage());
		Card dCard = CardFactory.createCard(Occasion.BABY_SHOWER, "Ha ha", "bye");
		System.out.println(dCard.getMessage());
	}

}
