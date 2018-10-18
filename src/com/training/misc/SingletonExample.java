package com.training.misc;

public class SingletonExample {
	private static SingletonExample singletonExample;
	
	public static SingletonExample getInstance(){
		
		if(singletonExample == null){
			singletonExample = new SingletonExample();
		}
		
		return singletonExample;
	}
}
