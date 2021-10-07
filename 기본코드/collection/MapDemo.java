package org.javatutorials.collection;

import java.util.Collection;
import java.util.HashMap;


public class MapDemo {

	public static void main(String[] args) {
		HashMap<String, Integer> a = new HashMap<String, Integer>();
		/*
		 * HashMap은 key와 value가 있으므로 제네릭으로
		 * 두가지 데이터타입을 선언해줘야함(<String, Integer>)
		 */
		a.put("one", 1);
		a.put("two", 2);
		a.put("three", 3);
		a.put("four", 4);
		System.out.println(a.get("one"));
		System.out.println(a.get("two"));
		System.out.println(a.get("three"));
		
		iteratorUsingForEach(a);
		iteratorUsingIterator(a);
	}

}
