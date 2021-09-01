package org.javatutorials.accessmodifier;

class A{
	public String y() {
		return "public method y()";
	}
	
	private String z() {
		return "private method z()";
	}
	
	public String x() {
		return z();
	}
}

public class AccessDemo1 {

	public static void main(String[] args) {
		A a = new A();
		System.out.println(a.y());
		// public method y() 출력
		//System.out.println(a.z());
		//오류(z는 private이기 떄문에 다른 클래스에서 접근할 수 없음)
		System.out.println(a.x());
		// private method z() 출력 
		//x라는 메소드는 z메소드와 같은 클래스에 있기떄문에
		//z메소드에 접근 가능함
	}

}
