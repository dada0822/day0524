package day0524;

public class MyMath {

	long a, b;
	static int c = 20; // 클래스 변수
	
	long add() {
		return a+b;
	}
	
//	static void test() {
//		System.out.println("c : " + c);
//		System.out.println("a : " + a);
//	}
	
//	void test() {
//		System.out.println("c : " + c);
//		System.out.println("a : " + a);
//	}
	
	static void test() {
		System.out.println("c : " + c);
		MyMath m = new MyMath();
		System.out.println("a : " + m.a); // 정 꼭 써야한다면 ,, 많이 사용하는 방법은 아님
	}
	
	static long add(long a, long b) {
		return a+b;
	}
	
}
