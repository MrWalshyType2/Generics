package com.qa.basic_generic;

import java.util.ArrayList;

public class App {
	public static void main(String[] args) {
		Integer i = 32;
		Double d = 3.14;

		// Example of generics in action
		ArrayList<String> list = new ArrayList<String>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();

		Generic g1 = new Generic<Integer>(i);
		Generic g2 = new Generic<Double>(d);

		System.out.println();

//		System.out.println(g2.get().getClass()); // returns type of passed in item
//
//		System.out.println(g1.getClass().getTypeName());
//		System.out.println(g1.get());
//		System.out.println(g1.getClass().getName() + ": " + g1.get());
//		System.out.println(g2.getClass().getName() + ": " + g2.get());
	}
}
