package Java12_11;

import java.util.Scanner;
import java.util.Random;

public class Soccer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		Random rdm = new Random();
		double percent = Math.random();
		boolean run = true;

		System.out.println("축구 패널티킥 막기 게임");

		while (run) {
			System.out.println("선수가 공을 찹니다.");
			int shoot = rdm.nextInt(6) + 1;
			System.out.println("막을 방향을 선택하세요\n1. 왼쪽 2. 가운데 3. 오른쪽");
			int defense = sc.nextInt();
			System.out.println("슛~~~");
			switch (defense) {

			case 1:
				System.out.println("골키퍼 왼쪽을 선택합니다");
				break;
			case 2:
				System.out.println("골키퍼 가운데를 선택합니다");
				break;
			case 3:
				System.out.println("골키퍼 오른쪽 선택합니다");
				break;

			}
			if (defense == 1 && shoot == 4) {
				System.out.println("골키퍼가 완벽하게 막았습니다!");
			} else if (defense == 1 && shoot == 1 && percent >= 0.5) {
				System.out.println("골키퍼가 선방! 막았습니다!");

			} else if (defense == 1 && shoot == 1 && percent < 0.5) {
				System.out.println("아! 골키퍼가 방향은 맞췄으나 골이 들어갑니다");

			} else if (defense == 2 && shoot == 5) {
				System.out.println("막았습니다!! 골키퍼 서서 공을잡습니다");

			} else if (defense == 2 && shoot == 2 && percent >= 0.5) {
				System.out.println("아!. 골키퍼 ");

			} else if (defense == 2 && shoot == 2 && percent < 0.5) {
				System.out.println("아! 골키퍼가 반응도 못합니다. 그대로 들어가는 볼");

			} else if (defense == 3 && shoot == 6) {
				System.out.println("골키퍼 선방! 공을 쳐냅니다. 대닺합니다");

			} else if (defense == 3 && shoot == 3 && percent >= 0.5) {
				System.out.println("골키퍼! 방향을 완벽하게 예측합니다.");

			} else if (defense == 2 && shoot == 2 && percent < 0.5) {
				System.out.println("골!!! 골키퍼 방향은 맞췄는데 아쉽습니다");

			} else {
				System.out.println("골!! 선수가 공을 빠르게 잘찼네요!");
			}
			System.out.println();
			System.out.println("계속하시겠습니까 1. 예 2. 아니오");
			int choose = sc.nextInt();
			if (choose == 2) {
				System.out.println("게임을 종료합니다");
				run = !run;
			}
		}
	}

}
