package com.design.patterns.creational.singleton;

public class SingletonDesignPattern {
	
	public static void main(String[] args) {
		/*EagerInitialization i = EagerInitialization.getInstance();
		System.out.println(i);
		
		EagerInitialization j = EagerInitialization.getInstance();
		System.out.println(j);
		
		EagerInitialization instance = EagerInitialization.getInstance();
		instance = null;
		System.out.println(instance);
		
		EagerInitialization k = EagerInitialization.getInstance();
		System.out.println(k);*/
		
		/*StaticBlockInitialization a = StaticBlockInitialization.getInstance();
		System.out.println(a);
		
		StaticBlockInitialization b = StaticBlockInitialization.getInstance();
		System.out.println(b);*/
		
		/*LazyInitialization c = LazyInitialization.getInstance();
		System.out.println(c);
		
		LazyInitialization d = LazyInitialization.getInstance();
		System.out.println(d);*/
		
		/*ThreadsafeLazyInitialization e = ThreadsafeLazyInitialization.getInstance();
		System.out.println(e);
		
		ThreadsafeLazyInitialization f = ThreadsafeLazyInitialization.getInstance();
		System.out.println(f);*/
		/*
		BillPughSingleton g = BillPughSingleton.getInstance();
		System.out.println(g);
		
		BillPughSingleton h = BillPughSingleton.getInstance();
		System.out.println(h);*/
		
		EnumSingleton k = EnumSingleton.INSTANCE;
		System.out.println(k);
		EnumSingleton l = EnumSingleton.INSTANCE;
		System.out.println(l);
		
	}

}
