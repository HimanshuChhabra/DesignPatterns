package com.designpatterns.iterator;

public interface Iterator<E> {
	public boolean hasNext();

	public E next();
}
