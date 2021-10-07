package org.javatutorials.collection;
import java.util.HashSet;
import java.util.Iterator;
public class SetDemo {
	//set�� ������ ���п����� ���հ� ���� ���� 
	//set�� list�� �޸� �ߺ��Ǹ� �ȵǰ� ������ ����
	//list�� �ߺ� �����ϰ� ������ ����������
	public static void main(String[] args) {
		HashSet<Integer> A = new HashSet<Integer>();
		//HashSet�� collection interface�� �����ϰ��ִ� Ŭ�����̱� ������
		//iterator��� �޼ҵ带 ����Ҽ�����
		//Collection<Integer> A = new HashSet<Integer>();
		//Collection<Integer> A = new ArrayList<Integer>();
		//���� ���� ó�� �º����� ���� Ŭ������ Collection���� �������ִ°�
		//����
		//�ֳ� ������ HashSet�� ArrayList�� �Ѵ� Collection�� ����
		//Ŭ�����̱⶧��
		A.add(1);
		A.add(2);
		A.add(3);
		
		HashSet<Integer> B = new HashSet<Integer>();
		B.add(3);
	 	B.add(4);
		B.add(5);
		
		HashSet<Integer> C = new HashSet<Integer>();
		C.add(1);
		C.add(2);
		
		System.out.println(A.containsAll(B));//false
		System.out.println(A.containsAll(C));//true
		//A�ȿ� B�� ���� ���ִ���
		//A�ȿ� C�� ���� ���ִ���
		//��ȯ�� Ÿ��=boolean
		
		//A.addAll(B);//B�� �����Ҹ� A�� �߰��ϰڴ�.(������)
		
		//A.retainAll(B);//A��B�� �������� A�� �ϰڴ�.(������)
		
		//A.removeAll(B);//A���� A,B�� �������� ���ڴ�.(������)
		
		Iterator hi = (Iterator) A.iterator();
		/*HashSet�̶�� Ŭ������ ��ü�� A����
		 * iterator��� �޼ҵ�(����� �������̽�) ��� 
		 * iterator��� �޼ҵ�� Iterator��� ������Ÿ���� ��ȯ��
		 */
		while(hi.hasNext()) {
			/*���� hi���� A�� ������ 1,2,3�� ����
			 * hasNext�޼ҵ�� hi��� iterator���� ������ ���� �ִ��� Ȯ��
			 * ������ true ������ false 
			 */
			System.out.println(hi.next());
			/*next��� �޼ҵ�� hi��� HashSet���� ���� ������
			 * �������� ���� hi��� ���տ��� ������Ե�
			 * �̶� �����Ұ���
			 * ������ �����̾��� A���� ���Ұ� ������°��� �ƴ�
			 */
		}
		
	}

}
