package day0524;

import java.util.Scanner;

public class AreaMain {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("가로 길이 : ");
		int w = s.nextInt();
		
		System.out.print("세로 길이 : ");
		int h = s.nextInt();
		
		AreaCalculator ac = new AreaCalculator();
		
		int area = ac.areaResult(w, h);
		
		System.out.printf("가로 길이가 %d이고 세로 길이가 %d인 직사각형의 면적은 %d입니다.", w, h, area);

		s.close();

	}

}
