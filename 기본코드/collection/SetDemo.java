package org.javatutorials.collection;
import java.util.HashSet;
import java.util.Iterator;
public class SetDemo {
	//set은 실제로 수학에서의 집합과 같은 개념 
	//set은 list와 달리 중복되면 안되고 순서도 없음
	//list는 중복 가능하고 순서도 정해져있음
	public static void main(String[] args) {
		HashSet<Integer> A = new HashSet<Integer>();
		//HashSet은 collection interface를 구현하고있는 클래스이기 때문에
		//iterator라는 메소드를 사용할수있음
		//Collection<Integer> A = new HashSet<Integer>();
		//Collection<Integer> A = new ArrayList<Integer>();
		//위의 두줄 처럼 좌변에는 상위 클래스인 Collection으로 선언해주는게
		//편함
		//왜냐 어차피 HashSet과 ArrayList는 둘다 Collection의 하위
		//클래스이기때문
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
		
		//A.removeAll(B);//A에서 A,B의 교집합을 뺴겠다.(차집합)
		
		Iterator hi = (Iterator) A.iterator();
		/*HashSet이라는 클래스의 객체인 A에서
		 * iterator라는 메소드(사실은 인터페이스) 사용 
		 * iterator라는 메소드는 Iterator라는 데이터타입을 반환함
		 */
		while(hi.hasNext()) {
			/*현재 hi에는 A의 원소인 1,2,3이 있음
			 * hasNext메소드는 hi라는 iterator에서 가져올 값이 있는지 확인
			 * 있으면 true 없으면 false 
			 */
			System.out.println(hi.next());
			/*next라는 메소드는 hi라는 HashSet에서 값을 가져옴
			 * 가져와진 값은 hi라는 집합에서 사라지게됨
			 * 이때 주의할것은
			 * 원래의 집합이었던 A에서 원소가 사라지는것은 아님
			 */
		}
		
	}

}
