package Java12_17;

import java.util.Scanner;

public class My {

	static int mycard = 100000;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Atm atm = new Atm();
		boolean run = true;
		while (run) {
			atm.card();
			System.out.println("1. 카드 넣기 2. 은행나가기");
			int p = sc.nextInt();
			if (p == 1) {
				atm.function();
			}
			if (p == 2) {
				System.out.println("안녕히가세요!");
				run = !run;
			}

			int p1 = sc.nextInt();
			if (p1 == 1) {
				mycard = atm.deposit(mycard);

			}
			if (p1 == 2) {
				mycard = atm.withdraw(mycard);
			}
			if (p1 == 3) {
				atm.inquiry(mycard);
			}
		}
	}

}
