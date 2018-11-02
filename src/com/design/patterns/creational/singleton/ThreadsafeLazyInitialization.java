package com.design.patterns.creational.singleton;

public class ThreadsafeLazyInitialization {
	
	private static ThreadsafeLazyInitialization instance = null;
	
	private ThreadsafeLazyInitialization(){
		
	}
	
	public static ThreadsafeLazyInitialization getInstance(){
		if(null==instance){
			synchronized (ThreadsafeLazyInitialization.class) {
				if(null==instance){
					instance = new ThreadsafeLazyInitialization();
				}
			}
		}
		return instance;
	}

}
