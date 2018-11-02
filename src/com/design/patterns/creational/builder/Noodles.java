package com.design.patterns.creational.builder;

public class Noodles {
	
	private String noodle;
	private String vegetbles;
	
	private boolean paneer;
	private boolean corn;
	private boolean mushroom;
	private boolean egg;
	private boolean chicken;
	private boolean prawn;
	
	public Noodles(NoodleBuilder noodleBuilder) {
		this.noodle = noodleBuilder.noodle;
		this.vegetbles = noodleBuilder.vegetbles;
		this.paneer = noodleBuilder.paneer;
		this.corn = noodleBuilder.corn;
		this.mushroom = noodleBuilder.mushroom;
		this.egg = noodleBuilder.egg;
		this.chicken = noodleBuilder.chicken;
		this.prawn = noodleBuilder.prawn;
	}
	public String getNoodle() {
		return noodle;
	}
	public String getVegetbles() {
		return vegetbles;
	}
	public boolean isPaneer() {
		return paneer;
	}
	public boolean isCorn() {
		return corn;
	}
	public boolean isMushroom() {
		return mushroom;
	}
	public boolean isEgg() {
		return egg;
	}
	public boolean isChicken() {
		return chicken;
	}
	public boolean isPrawn() {
		return prawn;
	}
	
	public static class NoodleBuilder{
		private String noodle;
		private String vegetbles;
		
		private boolean paneer;
		private boolean corn;
		private boolean mushroom;
		private boolean egg;
		private boolean chicken;
		private boolean prawn;
		
		public NoodleBuilder(String noodle, String vegetables){
			this.noodle = noodle;
			this.vegetbles = vegetables;
		}

		public NoodleBuilder paneer(boolean paneer) {
			this.paneer = paneer;
			return this;
		}

		public NoodleBuilder corn(boolean corn) {
			this.corn = corn;
			return this;
		}

		public NoodleBuilder mushroom(boolean mushroom) {
			this.mushroom = mushroom;
			return this;
		}

		public NoodleBuilder egg(boolean egg) {
			this.egg = egg;
			return this;
		}

		public NoodleBuilder chicken(boolean chicken) {
			this.chicken = chicken;
			return this;
		}

		public NoodleBuilder prawn(boolean prawn) {
			this.prawn = prawn;
			return this;
		}
		
		public Noodles build(){
			return new Noodles(this);
		}
	}

	@Override
	public String toString() {
		return "Noodles [noodle=" + noodle + ", vegetbles=" + vegetbles + ", paneer=" + paneer + ", corn=" + corn
				+ ", mushroom=" + mushroom + ", egg=" + egg + ", chicken=" + chicken + ", prawn=" + prawn + "]";
	}
}
