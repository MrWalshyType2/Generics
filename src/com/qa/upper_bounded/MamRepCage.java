package com.qa.upper_bounded;

import java.util.List;

public class MamRepCage<T extends Mammal & Reptile> {
	// Multiple upper bounds, only Mammal & Reptile instances

	private List<T> list;

	public void add(List<T> list) {
		this.list = list;
	}

	public List<T> get() {
		return list;
	}

}
