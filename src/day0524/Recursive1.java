package day0524;

public class Recursive1 {

	public static void main(String[] args) {
		
		/* 팩토리얼
		 * 5! = 5 * 4 * 3 * 2 * 1 */
		
//		int fac = 5;
//		int total = 1;
//		
//		for(int i=0; i<fac; i++) {
//			total *= (fac-i);
//		}
		
//		while (fac != 0) {
//			total *= fac;
//			fac--;
//		}
//		
//		System.out.println("5! = " + total);
		
		
		long result = factorial(4);
		System.out.println("4! = " + result);
	}
	
	// 3! = 3 * 2 * 1
	static long factorial(int n) {
		long result = 0;
		
		if(n == 1) {
			return 1;
		} else {
			result = n * factorial(n-1);
		}
		return result;
	}

}
