package Java12_30;

import java.util.Scanner;

public class Car_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car car = new Car() ;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("색상을 선택해주세요");
		System.out.println("1. 검정색 2. 빨간색 3. 분홍색 4. 노란색 5.흰색");
		int color_choice = sc.nextInt();
		
		car.color_choice(color_choice);
		
		
//		car.run();
		
	}

}
