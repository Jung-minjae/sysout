package Parking;

import java.util.Scanner;

public class Parking_main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean parking_run = true;
		Parking_console pc = new Parking_console();

		while (parking_run) {
			System.out.println("[1]입차 [2]예상 요금조회 [3]출차");
			int menu = scan.nextInt();
			switch (menu) {
			case 1: // 입차
				pc.input_car();
				break;
			case 2: // 임의의 시간부터 계산한 예상 요금조회
				pc.show_Predictfee();
				break;
			case 3: // 출차(결제)
				pc.output_car();
				break;
			default:
				System.out.println("다시입력!");
				break;
			}
		}

	}

}