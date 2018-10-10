package com.designpatterns.iterator;

public interface Collection<E> {
	public Iterator<E> createIterator();
}
