package Java12_7;

import java.util.Scanner;

public class While2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		boolean run = true;

		while (run) {

			System.out.println("숫자를 입력하세요");
			int a = sc.nextInt();
			System.out.println("두번째 숫자를 입력하세요");
			int b = sc.nextInt();

			System.out.println("계산할 연산자를 입력하세요");
			String s = sc.next();
			double c = a;
			double d = b;

			System.out.println(a + s + b + "=");

			switch (s) {
			case ("+"):
				System.out.println(a + b);
				break;
			case ("-"):
				System.out.println(a - b);
				break;
			case ("*"):
				System.out.println(a * b);
				break;
			case ("/"):
				System.out.println(c / d);
				break;
			}

			System.out.println("계속 하시겠습니까? 1.Yes  2.No");
			int p = sc.nextInt();
			if (p == 1) {
				run = true;
			}
			if (p == 2) {
				System.out.println("계산 종료");
				run = false;

			}

		}
	}
}
