package com.designpatterns.iterator;

public class LinkedListIterator<E> implements Iterator<E> {

	LinkedList<E> list;

	Node<E> head;

	public LinkedListIterator(LinkedList<E> list) {
		this.list = list;
		head = list.first;
	}

	@Override
	public boolean hasNext() {
		return head != null;
	}

	@Override
	public E next() {

		E data = head.data;
		head = head.next;

		return data;
	}

}
