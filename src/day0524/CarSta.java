package day0524;

public class CarSta {

	static int sum = 0; // 클래스 변수
	int num;
	double gas;
	
	public CarSta() {
		sum ++;
	} // 생성자
	
	void setCarSta(int n, double g) {
		num = n;
		gas = g;
		
		System.out.println("차량 번호 : " + num + ", 연료량 : " + gas + "로 설정");
	}
	
	public static void showSumSta() {
//		System.out.println("차량 번호 : " + num); // 인스턴스 변수라서 클래스 메서드 내에서는 사용 불가
		System.out.println("자동차의 수 : " + sum + "대");
	}
	
	void showCarSta() {
		System.out.println("차량번호 : " + num);
		System.out.println("연료량 : " + gas);
	}
	
}
