package org.javatutorials.polymorphism;
//인터페이스와 다형성으로 가족 표현하기

interface father{}
interface mother{}
interface human{
	public void mind();
}
interface crew{}

class Hwan implements father, human, crew{
	public void mind() {
		System.out.println("cold");
	}
}

class Song implements mother, human, crew{
	public void mind() {
		System.out.println("respect");
	}
}

public class InterfacePolymorphismExample {

	public static void main(String[] args) {
		human person1 = new Hwan();
		human person2 = new Song();
		
		person1.mind();
		person2.mind();
	}

}
