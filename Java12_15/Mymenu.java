package Java12_15;

import java.util.Scanner;

public class Mymenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 분식메뉴 = 라면,오뎅,떡볶이 순대
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		int price = 0;
		while (run) {
			String menu[] = { "라면", "오뎅", "떡볶이", "순대" };
			System.out.println("카트에 메뉴를 담으세요");
			System.out.println("1. 라면  2. 오뎅  3. 떡볶이  4. 순대");

			price = price_1(price);
			System.out.println("총 금액은" + price);
			System.out.println("더 주문하시겠습니까? \n 1.예 2.아니오");
			int p1 = sc.nextInt();
			if (p1 == 2) {
				System.out.println("주문을 종료합니다.");
				run = !run;
			}
		}
	}

	public static int price_1(int price) {
		Scanner sc = new Scanner(System.in);
		int p = sc.nextInt();
		int ra = 2500;
		int odeng = 3000;
		int dduc = 3500;
		int soon = 4000;

		switch (p) {
		case 1:
			System.out.println("라면을 선택하셨습니다.");
			price += ra;
			break;
		case 2:
			System.out.println("오뎅을 선택하셨습니다.");
			price += odeng;
			break;
		case 3:
			System.out.println("떡볶이를 선택하셨습니다.");
			price += dduc;
			break;
		case 4:
			System.out.println("순대를 선택하셨습니다.");
			price += soon;
			break;
		}

		return price;
	}

}
