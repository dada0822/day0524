package day0524;

public class CalculateTest {

	public static void main(String[] args) {
		
		Calculate cal = new Calculate();
		
		long result1 = cal.add(5L, 3L);
		long result2 = cal.subtract(5L, 3L);
		long result3 = cal.multiply(5L, 3L);
		double result4 = cal.divide(5L, 3L); // 자동형변환
		
		System.out.println("add(5L, 3L) = " + result1);
		System.out.println("subtract(5L, 3L) = " + result2);
		System.out.println("multiply(5L, 3L) = " + result3);
		System.out.println("divide(5L, 3L) = " + result4);

	}

}
