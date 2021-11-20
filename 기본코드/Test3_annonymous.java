package baekjoon;

public class Test3_annonymous {
	//익명객체
	
	public static void main(String[] args) {
		Rectangle a = new Rectangle();
		Rectangle rt = new Rectangle() {
			int depth = 10;
			int get() {
				//오버라이딩
				return width*height*depth;
			}
		};
		System.out.println(rt.get());
		System.out.println(a.get());
	}
}

class Rectangle {
	int width = 10;
	int height = 20;
	
	int get() {
		return height;
	}
}