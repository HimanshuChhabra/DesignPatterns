package com.designpatterns.iterator;

public class AListIterator<E> implements Iterator<E> {

	private AList<E> list;
	
	private int pos;
	
	public AListIterator(AList<E> list) {
		this.list = list;
	}

	@Override
	public boolean hasNext() {
		return pos < list.size();
	}

	@Override
	public E next() {
		return list.get(pos++);
	}

}
