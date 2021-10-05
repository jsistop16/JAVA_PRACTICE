package org.javatutorials.collection;

import java.util.HashSet;
import java.util.Iterator;

public class SetDemoPractice {

	public static void main(String[] args) {
		HashSet<Integer> A = new HashSet<Integer>();
		A.add(1);
		A.add(2);
		A.add(2);
		A.add(2);
		A.add(2);
		A.add(3);
		//HashSet은 2가 여러번 중복되어서 추가되면
		//하나만 인식(중복불가)
		//HashSet이 아니라 ArrayList로 선언해주면 1,2,2,2,2,3 모두 출력됨
		
		Iterator hi = (Iterator) A.iterator();
		while(hi.hasNext()) {
			System.out.println(hi.next());
		}
		
	}

}
