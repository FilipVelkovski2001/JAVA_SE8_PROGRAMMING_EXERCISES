package com.example;

public class Fish extends Animal implements Pet {

	private String name;
	
	public Fish() {
		super(0);
	}
	
	@Override
	 public void walk() {
	        super.walk();
	        System.out.println("Fish ofcourse can't walk they swim!");
	    }

	@Override
	public void eat() {
		System.out.println("Fish eat pond scum");
		
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}

	@Override
	public void setName(String name) {
		this.name = name;
		
	}

	@Override
	public void play() {
		System.out.println( this.name + " just keep swimming!");
		
	}
}
