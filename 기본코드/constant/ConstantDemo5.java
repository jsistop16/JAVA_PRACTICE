package org.javatutorials.constant;
//enum����

enum Day{
	MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
	
	void getName() {
		System.out.println(this);
	}
}

public class ConstantDemo5 {

	
	public static void main(String[] args) {
		
		
		Day day = Day.MONDAY;
		
		switch(day) {
		case MONDAY:
			System.out.println("������");
			Day.MONDAY.getName();
			break;
		case TUESDAY:
			System.out.println("ȭ����");
			break;
		case WEDNESDAY:
			System.out.println("������");
			break;
		case THURSDAY:
			System.out.println("�����");
			break;
		case FRIDAY:
			System.out.println("�ݿ���");
			break;
		case SATURDAY:
			System.out.println("�����");
			break;
		case SUNDAY:
			System.out.println("�Ͽ���");
			break;
		
		}
	}

}
