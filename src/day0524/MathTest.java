package day0524;

public class MathTest {

	public static void main(String[] args) {
		

		int sum;
		
		Math obj = new Math();
		
		sum = obj.add(2, 3);
		System.out.println("2 + 3 = " + sum);
		
		sum = obj.add(6, 2);
		System.out.println("6 + 2 = " + sum);
		
//		sum = obj.add(1, 2, 3); 매개변수 개수와
//		sum = obj.add(1.0, 2.0); 매개변수 타입이 동일해야 함 

	}

}
