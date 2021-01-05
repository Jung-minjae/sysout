package Java12_10;

import java.util.Scanner;
import java.util.Random;

public class Baseballgame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean run = true;
		boolean run1 = true;
		Scanner sc = new Scanner(System.in);
		Random rdm = new Random();
		double dice3 = Math.random();
		int dice3_1 = (int) (dice3);
		int cnt = 0;
		int cnt1 = 0;
		while (run1) {
			while (run) {
				System.out.println("투수가 공을 던집니다");
				int dice1 = rdm.nextInt(9);
				int dice2 = rdm.nextInt(50) + 100;
				System.out.println("1~9 번호를 선택하세요");
				int p = sc.nextInt();
				if (p == dice1 && dice2 >= 100 && dice2 < 140) {
					if (dice3 > 0.2) {
						System.out.println("쳤습니다");
						System.out.println("홈~~~런");
					} else {
						System.out.println("쳤습니다! 안타~");
						cnt++;
					}
				} else if (p == dice1 - 1 && dice2 >= 100 && dice2 < 130
						|| p == dice1 + 1 && dice2 >= 100 && dice2 < 130) {
					if (dice3 > 0.5) {
						System.out.println("쳤습니다");
						System.out.println("안타입니다");
					} else {
						System.out.println("스윙~ 스트라이크");
						cnt++;
					}
				} else {
					System.out.println("스윙~ 스트라이크");
					cnt++;
				}
				if (cnt == 3) {
					System.out.println("아웃 타자교체");
					run = !run;
					cnt1++;
				}
			}
//			if (cnt1 == 3) {
//				System.out.println("삼진 아웃 게임 끝");
//				run1 = !run1;
	//		}
		}
	}
}
