package com.qa.basic_generic;

public class Generic<T> {
	private T object;

	public Generic(T object) {
		this.object = object;
	}

	public T get() {
		return this.object;
	}

//	public T add(T x, T y) {
//		if (x instanceof y) {
//			return x + y;
//		}
//		return null;
//	}
}
