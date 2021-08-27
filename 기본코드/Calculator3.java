package org.javatutorials.calculator;
 //클래스와 인스턴스간의 접근 가능 연습
class C1{
    static int static_variable = 1;
    int instance_variable = 2;
    static void static_static(){//클래스 메소드
        System.out.println(static_variable);
    }
    static void static_instance(){//클래스 메소드
        //System.out.println(instance_variable);
    	//클래스메소드에서 인스턴수 변수로 접근하려 하므로 주석처리해야함
    }
    void instance_static(){//인스턴스 메소드
        System.out.println(static_variable);
    }
    void instance_instance(){//인스턴스 메소드     
        System.out.println(instance_variable);
    }
}
public class Calculator3 { 
    public static void main(String[] args) {
        C1 c = new C1();
        //인스턴스 c 생성
        
        c.static_static();
        /*인스턴스 c 에서 클래스메소드에 접근하려함 가능
         * static_static메소드를 보면 클래스 메소드가
         * 클래스 변수에 접근하려고 하므로 가능
         * 출력값=1
         */
        
        c.static_instance();
        /*인스턴스 c에서 클래스메소드에 접근하려함 가능
         * static_instance메소드를 보면 클래스 메소드가
         * 인스턴스 변수(instance_variable)에 접근하려고 하므로 불가
         */
        
        c.instance_static();
        /*인스턴스 c에서 인스턴스 메소드에 접근하려함 가능
         * instance_static메소드를 보면 인스턴스 메소드가
         * 클래스 변수에 접근하려고 하므로 가능
         * 출력값=1
         */
        
        c.instance_instance();
        /*인스턴스 c에서 인스턴스 메소드에 접근하려함 가능
         * instance_instance메소를 보면 인스턴스 메소드가
         * 인스턴스 변수에 접근하려고 하므로 가능
         * 출력값=2
         */
        
        C1.static_static();
        /*클래스 C1에서 클래스메소드에 접근하려함 가능
         * static_static메소드를 보면 클래스메소드가
         * 클래스 변수에 접근하려고 하므로 가능
         * 출력값=1
         */
        
        C1.static_instance();
        /*클래스 C1에서 클래스메소드에 접근하려함 가능
         * static_instance메소드를 보면 클래스 메소드가
         * 인스턴스 변수에 접근하려고 하므로 불가
         */
        
        //C1.instance_static();
        //클래스 C1에서 인스턴스메소드에 접근하려함 불가
        //컴파일 시에는 주석처리해야함
        
        //C1.instance_instance();
        //클래스 C1에서 인스턴스메소드에 접근하려함 불가
        //컴파일 시에는 주석처리해야함
    }
 
}