package Java1_12day;

import java.util.Scanner;

public class Subway_main {

	public static void main(String[] args) {

		Subway subway = new Subway();
		Scanner sc = new Scanner(System.in);
		boolean run = true;

		while (run) {
			System.out.println("1. 주문접수   2. 전체주문확인 3.1개 주문확인  3. 종료");
			int choise = sc.nextInt();

			switch (choise) {
			case 1:
				System.out.println("주문을 시작하겠습니다");
				subway.choise();
				break;
			case 2:
				System.out.println("주문을 확인합니다");
				subway.check();
				break;
			case 3:
				System.out.println("고객님의 주문을 확인합니다");
				subway.search();
				break;
			case 4:
				System.out.println("서브웨이에서 나갑니다");
				run = false;

				break;
			}
		}
	}
}