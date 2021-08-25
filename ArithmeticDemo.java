package org.javatutorials.operator;

public class ArithmeticDemo {

	public static void main(String[] args) {
		
		//이항연산자
		String firststring="this is";
		String secondstring=" java";
		System.out.println(firststring+secondstring);
		
		int a=10;
		float d=3.0F;
		
		System.out.println(a/d);
		/* a는 int d는 float이므로 나누기 연산할때
		 * int에서 float으로 자동형변환 일어남
		 * 그럼 a/d의 결과는 float자료형으로 나옴
		 */
		
		//단항연산자 활용
		int i =3;
		i++;
		System.out.println(i); //4
		System.out.println(++i); //5
		System.out.println(i++); //5
		System.out.println(i); //6
		System.out.println(-i); //-6
		
		System.out.println(System.getProperty("user.dir"));
	}

}
