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
		//HashSet�� 2�� ������ �ߺ��Ǿ �߰��Ǹ�
		//�ϳ��� �ν�(�ߺ��Ұ�)
		//HashSet�� �ƴ϶� ArrayList�� �������ָ� 1,2,2,2,2,3 ��� ��µ�
		
		Iterator hi = (Iterator) A.iterator();
		while(hi.hasNext()) {
			System.out.println(hi.next());
		}
		
	}

}
