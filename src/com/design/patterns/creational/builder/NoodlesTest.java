package com.design.patterns.creational.builder;

import com.design.patterns.creational.builder.Noodles.NoodleBuilder;

public class NoodlesTest {
	
	public static void main(String[] args) {
		NoodleBuilder builder = new NoodleBuilder("plain", "all");
		Noodles noodles = builder.egg(true).chicken(true).prawn(true).build();
		System.out.println(noodles);
	}

}
