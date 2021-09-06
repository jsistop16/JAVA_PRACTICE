package org.javatutorials.exception;

class A{
	private int[] arr = new int[3];
	//arr�̶�� ������ ������ �̷���� ũ�� 3�� �迭
	A() {//������
		arr[0]=0;
		arr[1]=10;
		arr[2]=20;
	}
	public void z(int first, int second) {
		try {
			System.out.println(arr[first] / arr[second]);
		}
//		catch(Exception e){
//			//���ܸ� �뤊�� �ٷ�� �Ű�����
//			e.printStackTrace();
//		}
		catch(ArithmeticException e) {
			System.out.println("ArithmeticException");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException");
		}
		catch(Exception e) {
			//���� �� catch���� �ش���� �ʴ� ������ ������ �����ϴ°�
		}
		finally {
			System.out.println("finally");
			//������ �ֵ� ����(�� try,catch���� �����̵Ƶ� �ȵƵ�)
			//finally������ �׻� ����
		}
	}
}


public class ExceptionDemo1 {

	public static void main(String[] args) {
		A a = new A();
		//a.z(1,0);
		//������ �߻�
		//(�ε������� ������ �Ѿ�ٴ� ����)
		//(0���� ������ ���ٴ� ����)
		//2���� ���ܸ� �����Ҽ�����
		a.z(10, 0);
		a.z(1,0);
		a.z(2,1);
	}

}
