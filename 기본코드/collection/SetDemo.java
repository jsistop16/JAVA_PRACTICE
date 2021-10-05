package org.javatutorials.collection;
import java.util.HashSet;
import java.util.Iterator;
public class SetDemo {
	//set은 실제로 수학에서의 집합과 같은 개념 
	//set은 list와 달리 중복되면 안되고 순서도 없음
	//list는 중복 가능하고 순서도 정해져있음
	public static void main(String[] args) {
		HashSet<Integer> A = new HashSet<Integer>();
		A.add(1);
		A.add(2);
		A.add(3);
		
		HashSet<Integer> B = new HashSet<Integer>();
		B.add(3);
		B.add(4);
		B.add(5);
		
		HashSet<Integer> C = new HashSet<Integer>();
		C.add(1);
		C.add(2);
		
		System.out.println(A.containsAll(B));//false
		System.out.println(A.containsAll(C));//true
		//A안에 B가 전부 들어가있느냐
		//A안에 C가 전부 들어가있느냐
		//반환형 타입=boolean
		
		//A.addAll(B);//B의 모든원소를 A에 추가하겠다.(합집합)
		
		//A.retainAll(B);//A와B의 교집합을 A로 하겠다.(교집합)
		
		A.removeAll(B);//A에서 A,B의 교집합을 뺴겠다.(차집합)
		
		Iterator hi = (Iterator) A.iterator();
		while(hi.hasNext()) {
			System.out.println(hi.next());
		}
		
	}

}
