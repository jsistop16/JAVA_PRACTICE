package org.javatutorials.exception;

class A{
	private int[] arr = new int[3];
	//arr이라는 변수는 정수로 이루어진 크기 3인 배열
	A() {//생성자
		arr[0]=0;
		arr[1]=10;
		arr[2]=20;
	}
	public void z(int first, int second) {
		try {
			System.out.println(arr[first] / arr[second]);
		}
//		catch(Exception e){
//			//예외를 통쨰로 다루는 매개변수
//			e.printStackTrace();
//		}
		catch(ArithmeticException e) {
			System.out.println("ArithmeticException");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException");
		}
		catch(Exception e) {
			//위의 두 catch문에 해당되지 않는 오류가 있을때 실행하는곳
		}
		finally {
			System.out.println("finally");
			//오류가 있든 없든(위 try,catch문이 실행이됐든 안됐든)
			//finally구문은 항상 실행
		}
	}
}


public class ExceptionDemo1 {

	public static void main(String[] args) {
		A a = new A();
		//a.z(1,0);
		//오류가 발생
		//(인덱스값이 범위를 넘어섰다는 내용)
		//(0으로 나눌수 없다는 내용)
		//2가지 예외를 예측할수있음
		a.z(10, 0);
		a.z(1,0);
		a.z(2,1);
	}

}
