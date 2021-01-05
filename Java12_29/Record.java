package Java12_29;

import java.util.Scanner;

public class Record {
	static int[] kors = new int[3];
	static int total = 0;
	static float avg;
	static int menu;
	static boolean keepLoop = true;

	public static void main(String[] args) {
		 int[] kors = new int[3];
		 int[] eng = new int[3];
		 int[] math = new int[3];
		Scanner scan = new Scanner(System.in);

		while (keepLoop) {
			System.out.println("----------------------------------------------------------");
			System.out.println("|         메인 메뉴                   | ");
			System.out.println("----------------------------------------------------------");
			System.out.println("\t1. 성적입력 ");
			System.out.println("\t2. 성적출력 ");
			System.out.println("\t3. 종료 ");
			System.out.println("\t선택> ");
			menu = scan.nextInt();

			switch (menu) {
			case 1:
				Record_input();
				break;
			case 2:
				Record_pl();
				break;
			case 3:
				exit();
				break;

			default:
				System.out.println("잘못된 값을 입력하셨습니다 1~3 까지의 숫자를 입력해주세요.");
			}
		}
	}

	public static void Record_input() {// 성적입력
		Scanner scan = new Scanner(System.in);
		System.out.println("----------------------------------------------------------");
		System.out.println("|         성적 입력                    | ");
		System.out.println("----------------------------------------------------------");
		System.out.println();

		for (int i = 0; i < 3; i++)
			do {
				System.out.printf("국어%d : ", i + 1);
				kors[i] = scan.nextInt();

				if (kors[i] < 0 || 100 < kors[i])
					System.out.println("국어 성적은 0~100까지의 범위만 입력해주세요.");

			} while (kors[i] < 0 || 100 < kors[i]);

		System.out.println("----------------------------------------------------------");

	}

	public static void Record_pl() {// 성적 출력

		for (int i = 0; i < 3; i++)
			total += kors[i];

		avg = total / 3.0f;

		System.out.println("----------------------------------------------------------");
		System.out.println("|           성적 출력                  | ");
		System.out.println("----------------------------------------------------------");
		System.out.println();

		for (int i = 0; i < 3; i++)
			System.out.printf("국어 %d : %3d\n", 3 - i, kors[i]);

		System.out.printf("총점 : %3d\n", total);
		System.out.printf("평균 : %6.2f\n", avg);
		System.out.println("----------------------------------------------------------");

	}

	public static void exit() {
		System.out.println("Bye~~");

		keepLoop = false;
	}
}