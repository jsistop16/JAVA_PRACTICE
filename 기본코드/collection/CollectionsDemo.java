package org.javatutorials.collection;
//collection framework를 활용하여 데이터 처리
import java.util.*;

class Computer implements Comparable {
	
	int serial;
	String owner;
	
	Computer(int serial, String owner){//생성자
		this.serial = serial;
		this.owner = owner;
	}
	
	public int compareTo(Object o) {
		return this.serial - ((Computer)o).serial;
		//이 메소드 이해했음
		//데이터를 순서대로 정렬해주는 메소드
		//반환값이 0이면 둘이 같다
		//반환값이 양수면 this.serial이 더 크다
		//반환값이 음수면 ((Computer)o).serial이 더 크다.
	}
	public String toString() {
		return serial+" "+owner;
	}

}


public class CollectionsDemo{
	public static void main(String[] args) {
		List<Computer> computers = new ArrayList<Computer>();
		computers.add(new Computer(500, "egoing"));
		computers.add(new Computer(200, "leezche"));
		computers.add(new Computer(500, "grapghittie"));
		Iterator i = computers.iterator();
		System.out.println("before");
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		Collections.sort(computers);//Collections는 클래스 바로 메소드(sort) 호출 가능
		System.out.println("\nafter");
		i = computers.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
	}
}