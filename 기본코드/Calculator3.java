package org.javatutorials.calculator;
 //Ŭ������ �ν��Ͻ����� ���� ���� ����
class C1{
    static int static_variable = 1;
    int instance_variable = 2;
    static void static_static(){//Ŭ���� �޼ҵ�
        System.out.println(static_variable);
    }
    static void static_instance(){//Ŭ���� �޼ҵ�
        //System.out.println(instance_variable);
    	//Ŭ�����޼ҵ忡�� �ν��ϼ� ������ �����Ϸ� �ϹǷ� �ּ�ó���ؾ���
    }
    void instance_static(){//�ν��Ͻ� �޼ҵ�
        System.out.println(static_variable);
    }
    void instance_instance(){//�ν��Ͻ� �޼ҵ�     
        System.out.println(instance_variable);
    }
}
public class Calculator3 { 
    public static void main(String[] args) {
        C1 c = new C1();
        //�ν��Ͻ� c ����
        
        c.static_static();
        /*�ν��Ͻ� c ���� Ŭ�����޼ҵ忡 �����Ϸ��� ����
         * static_static�޼ҵ带 ���� Ŭ���� �޼ҵ尡
         * Ŭ���� ������ �����Ϸ��� �ϹǷ� ����
         * ��°�=1
         */
        
        c.static_instance();
        /*�ν��Ͻ� c���� Ŭ�����޼ҵ忡 �����Ϸ��� ����
         * static_instance�޼ҵ带 ���� Ŭ���� �޼ҵ尡
         * �ν��Ͻ� ����(instance_variable)�� �����Ϸ��� �ϹǷ� �Ұ�
         */
        
        c.instance_static();
        /*�ν��Ͻ� c���� �ν��Ͻ� �޼ҵ忡 �����Ϸ��� ����
         * instance_static�޼ҵ带 ���� �ν��Ͻ� �޼ҵ尡
         * Ŭ���� ������ �����Ϸ��� �ϹǷ� ����
         * ��°�=1
         */
        
        c.instance_instance();
        /*�ν��Ͻ� c���� �ν��Ͻ� �޼ҵ忡 �����Ϸ��� ����
         * instance_instance�޼Ҹ� ���� �ν��Ͻ� �޼ҵ尡
         * �ν��Ͻ� ������ �����Ϸ��� �ϹǷ� ����
         * ��°�=2
         */
        
        C1.static_static();
        /*Ŭ���� C1���� Ŭ�����޼ҵ忡 �����Ϸ��� ����
         * static_static�޼ҵ带 ���� Ŭ�����޼ҵ尡
         * Ŭ���� ������ �����Ϸ��� �ϹǷ� ����
         * ��°�=1
         */
        
        C1.static_instance();
        /*Ŭ���� C1���� Ŭ�����޼ҵ忡 �����Ϸ��� ����
         * static_instance�޼ҵ带 ���� Ŭ���� �޼ҵ尡
         * �ν��Ͻ� ������ �����Ϸ��� �ϹǷ� �Ұ�
         */
        
        //C1.instance_static();
        //Ŭ���� C1���� �ν��Ͻ��޼ҵ忡 �����Ϸ��� �Ұ�
        //������ �ÿ��� �ּ�ó���ؾ���
        
        //C1.instance_instance();
        //Ŭ���� C1���� �ν��Ͻ��޼ҵ忡 �����Ϸ��� �Ұ�
        //������ �ÿ��� �ּ�ó���ؾ���
    }
 
}