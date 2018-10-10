package com.designpatterns.iterator;

public class Client {

	public static void main(String[] args) throws Exception {
		System.out.println("------AList Contents------");
		AList<String> subjects = new AList<String>(5);
		
		subjects.add("SMA");
		subjects.add("OOD");
		subjects.add("DP");
		subjects.add("DO");

		Iterator<String> iter = subjects.createIterator();

		while (iter.hasNext()) {
			System.out.println(iter.next());
		}

		System.out.println("------LinkedList Contents------");

		LinkedList<Integer> list = new LinkedList<Integer>();
		
		list.insert(1).insert(2).insert(3).remove().insert(4);

		Iterator<Integer> myIter = list.createIterator();

		while (myIter.hasNext()) {
			System.out.println(myIter.next());
		}

	}

}
