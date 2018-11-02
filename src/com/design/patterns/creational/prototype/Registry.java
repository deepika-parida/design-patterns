package com.design.patterns.creational.prototype;

import java.util.HashMap;

public class Registry {
	
	HashMap<String, Item> items = new HashMap<String,Item>();

	public HashMap<String, Item> getItems() {
		return items;
	}

	public void setItems(HashMap<String, Item> items) {
		this.items = items;
	}
	
	
	public Item createItem(String type){
		Item item = null;
		try {
			item = (Item)items.get(type).clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return item;
	}
	
	public Registry(){
		loadItems();
	}

	private void loadItems() {
		Book book = new Book();
		book.setName("GOF");
		book.setPrice(9.99);
		book.setUrl("http://abc.com/gof");
		book.setNoOfPages(123);
		items.put("BOOK", book);
		
		Movie movie = new Movie();
		movie.setName("Pirates of Carribean:Curse of Black Pearl");
		movie.setPrice(10);
		movie.setUrl("http://abc.com/pof1");
		movie.setRuntime("2:30");
		items.put("Movie", movie);
	}
}
