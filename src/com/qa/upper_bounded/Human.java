package com.qa.upper_bounded;

public class Human extends Animal implements Mammal {

	public Human(String name) {
		super(name);
	}

	@Override
	public String getMammalType() {
		return "Human";
	}

}
