package com.qa.upper_bounded;

import java.util.List;

public class BoundedGeneric<T extends Animal> {
	// Any Animal class instance, or subclass instance of Animal can be passed into
	// this generic.

	private List<T> list;

	public void add(List<T> list) {
		this.list = list;
	}

	public List<T> get() {
		return list;
	}

	public void readAll() {
		for (Animal item : list) {
			System.out.println(item.getName());
		}
	}
}
