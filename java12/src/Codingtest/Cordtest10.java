package Codingtest;

import java.util.Random;
import java.util.Scanner;

public class Cordtest10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rdm = new Random();
		Scanner sc = new Scanner(System.in);
		boolean run = true;

		String chulsu = "";
		String minsu = "";

		int chulsu_rdm;
		int minsu_rdm;

		int chulsu_money = 2000;
		int minsu_money = 2000;

		int chulsu_tongjangmoney = 50000;
		int minsu_tongjangmoney = 70000;

		int pandon = 500;

		System.out.println("철수,민수가 가위바위보를 합니다.");
		System.out.println("이긴사람은 진사람한테서 500원을 받습니다.");

		while (run) {
			chulsu_rdm = rdm.nextInt(3) + 1;
			minsu_rdm = rdm.nextInt(3) + 1;
			System.out.println("1. 가위바위보 시작  2. 아직 마음의 준비가안됨 3. 집에 간다");
			int start = sc.nextInt();
			switch (start) {
			case 1:
				System.out.println("가위~~~바위~~~~보!");

				switch (chulsu_rdm) {
				case 1:
					chulsu = "묵";
					break;
				case 2:
					chulsu = "찌";
					break;
				case 3:
					chulsu = "빠";
					break;
				}
				switch (minsu_rdm) {
				case 1:
					minsu = "묵";
					break;
				case 2:
					minsu = "찌";
					break;
				case 3:
					minsu = "빠";
					break;
				}

				System.out.println("철수 : " + chulsu + " vs 민수 : " + minsu);

				if (chulsu_rdm == 1 && minsu_rdm == 1 || chulsu_rdm == 2 && minsu_rdm == 2
						|| chulsu_rdm == 3 && minsu_rdm == 3) {
					System.out.println("철수,민수 : 에잇 비겼네 다시");
					System.out.println("철수 돈 : " + chulsu_money);
					System.out.println("민수 돈 : " + minsu_money);
				} else if (chulsu_rdm == 1 && minsu_rdm == 2 || chulsu_rdm == 2 && minsu_rdm == 3
						|| chulsu_rdm == 3 && minsu_rdm == 1) {
					System.out.println("철수 : 아싸 이겼다~ 500원 내놔");
					chulsu_money += pandon;
					minsu_money -= pandon;
					System.out.println("철수 돈 : " + chulsu_money);
					System.out.println("민수 돈 : " + minsu_money);
				} else if (chulsu_rdm == 1 && minsu_rdm == 3 || chulsu_rdm == 2 && minsu_rdm == 1
						|| chulsu_rdm == 3 && minsu_rdm == 2) {
					System.out.println("민수 : 아싸 이겼다~ 500원 개꿀");
					chulsu_money -= pandon;
					minsu_money += pandon;
					System.out.println("철수 돈 : " + chulsu_money);
					System.out.println("민수 돈 : " + minsu_money);
				}

				if (chulsu_money == 0) {
					System.out.println("민수 : 철수야 돈이 다 떨어졌네 빨리 충전해온나");
					System.out.println("철수 : 딱 기다리라");
					System.out.println("ATM기로 가시겠습니까? 1. Yes 2.No");
					int p = sc.nextInt();
					switch (p) {
					case 1:
						ATM at = new ATM();
						chulsu_tongjangmoney = at.output(chulsu_tongjangmoney);
						System.out.println("돈갖고왔다 다시하자");
						System.out.println("철수 통장 돈 : " + chulsu_tongjangmoney);
						break;
					case 2:
						System.out.println("도망간다");
						run = !run;
						break;
					}
				}
				if (minsu_money == 0) {
					System.out.println("철수 : 머하노 돈안뽑아오고");
					System.out.println("민수 : 지금 간다이가");
					System.out.println("ATM기로 가시겠습니까? 1. Yes 2.No");
					int p = sc.nextInt();
					switch (p) {
					case 1:
						ATM at = new ATM();
						minsu_tongjangmoney = at.output(minsu_tongjangmoney);
						System.out.println("돈갖고왔다 다시하자");
						System.out.println("민수 통장 돈 : " + minsu_tongjangmoney);
						break;
					case 2:
						System.out.println("도망간다");
						run = !run;
						break;
					}
				}
				break;

			case 2:
				System.out.println("준비되면 말해라");
				break;

			case 3:
				System.out.println("철수 : 고마 집에가자");
				System.out.println("민수 : 그래 담에또하자");
				run = false;
				break;
			}

		}
	}
}
