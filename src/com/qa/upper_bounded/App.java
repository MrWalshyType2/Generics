package com.qa.upper_bounded;

import java.util.ArrayList;

public class App {
	public static void main(String[] args) {
		Animal tiger = new Tiger("Bob");
		Ostrich ostrich = new Ostrich("Ogbar");

		ArrayList<Animal> animals = new ArrayList<Animal>();
		animals.add(tiger);
		animals.add(ostrich);

		BoundedGeneric<Animal> bg = new BoundedGeneric<Animal>();
		bg.add(animals);
		bg.get().forEach(item -> System.out.println(item));
		System.out.println(bg.get());
		bg.readAll();
	}
}
