package Java12_8;

import java.util.Scanner;

public class Array7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 은행업무 만들어보기 1. 입금 2. 출금 3. 조회
		// 입금은 무제한 잔액 0보다 낮을수 없고 잔액이없으면 출금이 안됨 조회 하면 현재잔액이 나오게

		Scanner sc = new Scanner(System.in);
		int purse = 0;
		int chul = 0;
		int janac = 0;

		boolean run = true;
		while (run) { // 업무 선택하기
			System.out.printf("사용하실 업무를 선택하세요.\n1. 입금 2. 출금 3. 조회");
			int p = sc.nextInt();
			switch (p) {

			case 1:
				System.out.println("입금하기를 선택하셨습니다.");
				if (p == 1) {
					System.out.println("입금하실 금액을 입력하세요.");
					int p2 = sc.nextInt();
					System.out.println(p2 + "만큼 입금합니다.");
					janac = janac + p2;
					System.out.println("통장 잔액은" + janac + "입니다.");
					break;
				}
			case 2:
				System.out.println("출금하기를 선택하셨습니다.");
				if (p == 2) {
					System.out.println("출금하실 금액을 입력하세요.");
					int p3 = sc.nextInt();
					System.out.println(p3 + "만큼 출금합니다.");

					if (p3 > janac) {
						System.out.println("통장 잔액보다 많은 금액은 출금하실 수 없습니다.");
					} else {
						janac = janac + p3;
						System.out.println("통장 잔액은" + janac + "입니다.");
					}
					System.out.println("통장 잔액은" + janac + "입니다.");

				}
				break;
			case 3:
				System.out.println("조회하기를 선택하셨습니다.");
				System.out.println("현재 통장 잔액은" + janac + "입니다.");
				break;
			}
			System.out.println("1. 계속거래하기 2.종료하기 ");
			int p1 = sc.nextInt();
			if (p1 == 1) {
				run = true;
			}
			if (p1 == 2) {
				run = false;
			}
		}

	}

}

//if(p==1) {
//System.out.println("입금하실 금액을 입력하세요");
//int p2 = sc.nextInt();
//System.out.println(p2+"만큼 입금합니다");
//janac = janac + p2