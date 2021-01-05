package Java12_29;

import java.util.Scanner;

public class Atm_main {
//	static int don = 0;
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Atm_class ac = new Atm_class();
		

		boolean run = true;

		System.out.println("ATM기 입니다.");
		while (run) {
			System.out.println("1. 입금 2. 출금 3. 조회 4. 종료");

			int cho = sc.nextInt();

			switch (cho) {
			case 1:
				
				input(ac);
				
				break;
			case 2:
				
				output(ac);
				
				break;
			case 3:
				
				check(ac);

				break;
			case 4:

				System.out.println("안녕히 가세요!");
				run = false;
				break;
			}

		}
	}

	public static void input(Atm_class ac) {
		Scanner sc = new Scanner(System.in);
		System.out.println("입금 입니다.");
		System.out.println("금액을 입력해주세요");
		int in = sc.nextInt();
		ac.don += in;
		
	}

	public static void output(Atm_class ac) {
		Scanner sc = new Scanner(System.in);
		System.out.println("출금 입니다.");
		System.out.println("금액을 입력해주세요");
		int out = sc.nextInt();
		if (ac.don - out < 0) {
			System.out.println("현재 잔액보다 출금 금액이 많습니다. 현재 잔액은" + ac.don + "입니다.");
		} else {
			ac.don -= out;
		}
		
	}

	public static void check(Atm_class ac) {
		System.out.println("조회 입니다.");
		System.out.println("현재 잔액은 : " + ac.don);
	}
}
