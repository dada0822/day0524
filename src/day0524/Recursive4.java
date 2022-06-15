package day0524;

public class Recursive4 {

	public static void main(String[] args) {
		
		/* 피보나치 수열
		 * 숫자의 앞에 값이 뒤의 값과 더하면서 계속해서 증가하는 규칙
		 * 1, 1, 2, 3, 5, 8, 13, 21... */

		System.out.println("n번째 fibonacci의 위치는 " + fibonacci(5));
		
	}

	public static int fibonacci(int n) {

//		int f = 1;
//		int s = 1;
//		int t = f + s;
//		int result = 0;
//		int i=2;
//		
//		System.out.println(f);
//		System.out.println(s);
//		
//		while (i < n) {
//			if(n==1 || n==2)
//				result = 1;
//			
//			System.out.println(t);
//			result = t;
//			
//			f = s;
//			s = t;
//			t = f + s;
//			i++;
//			
//		}
//		
//		return result;
//	}
		
		if (n == 1) return 1;
		if (n == 2) return 1;
		
		return fibonacci(n-1) + fibonacci(n-2);
		
		}
	
}
