package org.javatutorials.generic;
//���� ���׸�
//���׸��� Ŭ�������� �Ӹ��ƴ϶� �޼ҵ� ���������� ����Ҽ��ִ�.
class Employee_Info{
	public int rank;
	Employee_Info(int rank){
		this.rank = rank;
	}
}

class Person_Info<T, S>{//T,S�ڸ����� ������ ������Ÿ�Ը� �ü����� �⺻������Ÿ���� �Ұ�
	//�⺻������Ÿ���� ���� �ʹٸ� wrapper class�� ����ؾ���
	//int�� Integer, double�� Double 
	public T info;
	public S id;
	Person_Info(T info, S id){
		this.info = info;
		this.id = id;
	}
	public <U> void printInfo(U info) {
		
		System.out.println(info);
	}
}

public class GenericDemo3 {

	public static void main(String[] args) {
		Integer id = new Integer(1);//int��� �⺻������ Ÿ���� wrapper class�� �̿��Ͽ� ��ü(id)�� �������
		//�ؿ� �� �ǳ��� id ��� ���� 1 �����ص� �������
		Person_Info<Employee_Info, Integer> p1 = new Person_Info<Employee_Info, Integer>(new Employee_Info(1), id);
		//T, S �� ���� ������ Ÿ���� �̸� ���صдٸ� <Employee_Info, Integer>�� ���� �ʿ���� (�ٷ� �ؿ� �ּ��ڵ�)
		/*Employee_Info e = new Employee_Info();
		 *Person_Info i = new Person_Info();
		 *Person_Info p1 = new Person_Info(e,i);
		 *e,i�� ������ Ÿ���� �˱⋚���� java�� �̸� �ν���
		 */
		Employee_Info e = new Employee_Info(1);
		System.out.println(p1.id.intValue());
		p1.<Employee_Info>printInfo(e);
	}

}
