package com.designpatterns.iterator;

public class LinkedList<E> implements Collection<E> {

	protected Node<E> first;

	protected Node<E> last;

	int size;

	LinkedList() {
	}

	public LinkedList<E> insert(E data) {
		Node<E> newNode = new Node<E>(data);
		if (first == null) {
			first = newNode;
			last = newNode;
		} else {
			last.next = newNode;
			newNode.prev = last;
			last = newNode;
		}
		size++;
		return this;
	}

	public E getHead() throws Exception {
		if (first != null)
			return first.data;
		else
			throw new Exception("Empty List");
	}

	public E getLast() throws Exception {
		if (last != null)
			return last.data;
		else
			throw new Exception("Empty List");
	}

	public LinkedList<E> remove() {
		if (last != null) {
			Node<E> previousNode = last.prev;
			if(previousNode != null) {
				previousNode.next = null;
				last = previousNode;
			}else {
				first = last = null;
			}

		}
		return this;
	}

	@Override
	public Iterator<E> createIterator() {
		return new LinkedListIterator<E>(this);
	}

}

class Node<E> {
	E data;
	Node<E> next;
	Node<E> prev;

	Node(E data) {
		this.data = data;
	}
}