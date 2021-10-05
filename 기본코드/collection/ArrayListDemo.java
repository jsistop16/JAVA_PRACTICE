package org.javatutorials.collection;

import java.util.ArrayList;
//ArrayList를 사용할때는 항상 import해줘야함

public class ArrayListDemo {
	//배열을 선언해줄때 크기를 미리 설정해주거나
	//그로인해 크기를 모를때 사용하기 어렵다는 단점을 보완하기 위해
	//나온것이 ArrayList이므로 ArrayList는 처음 선언시 크기를 선언하지X
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("one");//index:0
		al.add("two");//index:1
		al.add("three");//index:2
		//원소를 아무리 많이 추가해도 에러가 발생하지 않음
		//add라는 메소드를 통해 원소를 추가할수있음
		for (int i=0; i<al.size(); i++) {
			/*String value = (String)al.get(i);
			//al.get()을 통해서 return되는 값은 Object데이터타입이므로
			//String value에 저장할수없음
			//그러므로 (String)으로 캐스팅 해줘야함
			//그래서 위에서 제네릭을 이용하여 <String>으로 지정해줌
			*/
			System.out.println(al.get(i));
			//get메소드를 통해 원소 출력
		}
		/*String a = "one";
		Object b = "two";
		String c;
		Object d;
		c=b;
		d=a;
		String->Object로의 저장은 가능
		Object->String으로의 저장은 불가
		Object가 조상이기떄문
		29line error*/
		
	}

}
