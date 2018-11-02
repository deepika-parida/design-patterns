package com.design.patterns.creational.prototype;

public class PrototypeTest {
	
	public static void main(String[] args) {
		Registry r = new Registry();
		Book book = (Book) r.createItem("BOOK");
		System.out.println(book);
		System.out.println(book.getName());
		System.out.println(book.getPrice());
		
		Book book1 = (Book)r.createItem("BOOK");
		System.out.println(book1);
		System.out.println(book1.getName());
		System.out.println(book1.getPrice());
		
	}

}
