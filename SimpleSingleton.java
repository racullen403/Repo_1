package com.singletonPatternExample; 

public class SimpleSingleton { 
	
	private static SimpleSingleton instance; 
	private String someData; 
	
	private SimpleSingleton(String someData) { 
		this.someData = someData; 
	} 
	
	public static SimpleSingleton getInstance(String someData) { 
		if(instance == null) { 
		instance = new SimpleSingleton(someData); 
		} 
		instance.printSomeData(); 
		return instance; 
	} 

	public void printSomeData() { 
		System.out.println("Non Thread safe maessage from SimpleSingleton" + someData); 
		} 
}