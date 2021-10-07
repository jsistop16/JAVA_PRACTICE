package org.javatutorials.collection;
//collection framework�� Ȱ���Ͽ� ������ ó��
import java.util.*;

class Computer implements Comparable {
	
	int serial;
	String owner;
	
	Computer(int serial, String owner){//������
		this.serial = serial;
		this.owner = owner;
	}
	
	public int compareTo(Object o) {
		return this.serial - ((Computer)o).serial;
		//�� �޼ҵ� ��������
		//�����͸� ������� �������ִ� �޼ҵ�
		//��ȯ���� 0�̸� ���� ����
		//��ȯ���� ����� this.serial�� �� ũ��
		//��ȯ���� ������ ((Computer)o).serial�� �� ũ��.
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
		Collections.sort(computers);//Collections�� Ŭ���� �ٷ� �޼ҵ�(sort) ȣ�� ����
		System.out.println("\nafter");
		i = computers.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
	}
}