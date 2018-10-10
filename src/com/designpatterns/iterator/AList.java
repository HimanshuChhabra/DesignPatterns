package com.designpatterns.iterator;

public class AList<E> implements Collection<E>{

	// Stores the Data for the AList , Should not be serialized
	private transient Object[] elementData;

	private static final int DEFAULT_SIZE = 10;

	private int size;

	AList() {
		this.elementData = new Object[DEFAULT_SIZE];
	}

	AList(int size) {
		this.elementData = new Object[size];
	}

	public void add(E data) {
		this.elementData[this.size] = data;
		this.size++;
	}

	public int size() {
		return this.size;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	@SuppressWarnings("unchecked")
	public E get(int index) {
		if (index >= 0 && index < this.size) {

			return (E) this.elementData[index];
		}
		throw new ArrayIndexOutOfBoundsException();
	}

	@Override
	public Iterator<E> createIterator() {
		return new AListIterator<E>(this);
	}
}
