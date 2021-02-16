package Flied;

import java.util.Scanner;

public class parking_lot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		parking_console pk_cs = new parking_console();
		Scanner sc = new Scanner(System.in);
		boolean bo = true;
		while (bo) {
			System.out.println("=========================================");
			System.out.println("|         주차장에 오신걸 환영합니다.          |");
			System.out.println("=========================================");
			System.out.println("\t1. 주차 하기");
			System.out.println("\t2. 주차 공간/차량 확인");
			System.out.println("\t3. 종료");
			int pick = sc.nextInt();
			switch (pick) {
			case 1:
				pk_cs.Do();
				break;

			case 2:
				pk_cs.List();
				break;

			case 3:
				bo = false;
				break;

			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				break;
			}
		}
	}

}