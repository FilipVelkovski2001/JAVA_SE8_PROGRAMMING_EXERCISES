package com.example;

public class Cat extends Animal implements Pet {

	private String name;
	
	
	public Cat(String name) {
		super(4);
		this.name = name;
	}
	

	public Cat() {
		this("Fluffy");
	
	}
	@Override
	public String getName() {
		
		return this.name;
	}

	@Override
	public void setName(String name) {
		
		this.name = name;
	}

	@Override
	public void play() {
	 
		System.out.println(this.name + " likes to play with a string");
	}

	@Override
	public void eat() {
		System.out.println("Cats like to eat spiders and fish");
		
	}

	
	
	
	
	
}
