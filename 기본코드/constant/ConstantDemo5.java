package org.javatutorials.constant;
//enum예제

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
			System.out.println("월요일");
			Day.MONDAY.getName();
			break;
		case TUESDAY:
			System.out.println("화요일");
			break;
		case WEDNESDAY:
			System.out.println("수요일");
			break;
		case THURSDAY:
			System.out.println("목요일");
			break;
		case FRIDAY:
			System.out.println("금요일");
			break;
		case SATURDAY:
			System.out.println("토요일");
			break;
		case SUNDAY:
			System.out.println("일요일");
			break;
		
		}
	}

}
