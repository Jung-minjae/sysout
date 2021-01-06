package Rent_Car;

import java.util.Scanner;

public class Car_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 차종 2. 입력
		Scanner sc = new Scanner(System.in);
		Car_console cc = new Car_console();
		
		boolean run = true;
		while (run) {
			System.out.println("1.입력 2. 조회 3. 종료");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:

				cc.input();
				break;
			case 2:
				System.out.println("조회");
				cc.output();
				break;
			case 3:
				System.out.println("종료");
				run = false;
				break;

			}

		}
	}

}
