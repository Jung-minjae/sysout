package Java12_17;

import java.util.Scanner;

public class Atm {

	public static void card() {
		System.out.println("카드를 넣어주세요");

	}

	public static void function() {

		System.out.println("업무를 선택해주세요");
		System.out.println("1. 입금 2. 출금 3. 잔액조회");
	}

	public static int deposit(int janac) {
		Scanner sc = new Scanner(System.in);
		System.out.println("입금할 금액을 입력해주세요");
		int deposit = sc.nextInt();
		System.out.println(deposit + " 가 입금되었습니다. 감사합니다.");
		janac = janac + deposit;
		return janac;
	}

	public static int withdraw(int janac) {
		Scanner sc = new Scanner(System.in);
		System.out.println("출금할 금액을 입력해주세요");
		int withdraw = sc.nextInt();
		if(withdraw>janac) {
			System.out.println("출금액이 보유 금액보다 많습니다. 현재 보유 금액은"+janac+"입니다.");
		}
		else {
		System.out.println(withdraw + " 가 출금되었습니다. 감사합니다.");
		janac = janac - withdraw;
		}
		return janac;
	}

	public static void inquiry(int janac) {
		System.out.println("카드 잔액조회입니다.");
		System.out.println("카드 잔액은 : " + janac + "원 입니다. 감사합니다.");
	}
}
