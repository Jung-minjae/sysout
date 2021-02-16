package Java1_12day;

import java.util.ArrayList;
import java.util.Scanner;

public class Subway {

	ArrayList<Subway_info> info = new ArrayList<Subway_info>();

	public void choise() {

		Scanner sc = new Scanner(System.in);

		String bread = "";
		String source = "";
		String ham = "";
		String onion = "";
		String picle = "";

		System.out.println("빵을 선택하시오. ");
		System.out.println("1. 플랫    2. 오트밀   3. 파마산");
		int choise = sc.nextInt();

		switch (choise) {
		case 1:
			bread = "플랫";
			break;
		case 2:
			bread = "오트밀";
			break;
		case 3:
			bread = "파마산";
			break;
		}

		System.out.println("양파을 넣으시겠습니까?  1. yes   2. no");

		choise = sc.nextInt();
		switch (choise) {
		case 1:
			onion = "양파 추가";
			break;
		case 2:
			onion = "넣지 않습니다";
			break;
		}
		System.out.println("피클을 넣으시겠습니까?  1. yes   2. no");

		choise = sc.nextInt();
		switch (choise) {
		case 1:
			picle = "피클 추가";

			break;
		case 2:
			picle = "넣지않습니다";

			break;
		}

		System.out.println("고기를 넣으시겠습니까?  1. yes   2. no");

		choise = sc.nextInt();
		switch (choise) {
		case 1:
			ham = "고기 추가";
			break;
		case 2:
			ham = "넣지 않습니다";
			break;
		}

		System.out.println("소스을 선택하시오. ");
		System.out.println("1. 케찹    2. 마요네즈   3. 핫소스");
		choise = sc.nextInt();

		switch (choise) {
		case 1:
			source = "케찹";
			break;
		case 2:
			source = "마요네즈";
			break;
		case 3:
			source = "핫소스";
			break;
		}

		info.add(new Subway_info(bread, onion, picle, ham, source));
	}

	public void check() {

		for (int i = 0; i < info.size(); i++) {
			System.out.println("┌──────────────────────────────────────┐");
			System.out.println("│" + (i + 1) + "번 손님");
			System.out.println("├──────────────────────────────────────");
			System.out.println("│ 빵 :  " + info.get(i).bread);
			System.out.println("├──────────────────────────────────────");
			System.out.println("│ 고기 : " + info.get(i).ham);
			System.out.println("├──────────────────────────────────────");
			System.out.println("│ 피클 : " + info.get(i).picle);
			System.out.println("├──────────────────────────────────────");
			System.out.println("│ 양파 : " + info.get(i).onion);
			System.out.println("├──────────────────────────────────────");
			System.out.println("│ 소스 : " + info.get(i).source);
			System.out.println("└──────────────────────────────────────┘");
		}

	}

	public void search() {
		Scanner sc = new Scanner(System.in);
		System.out.println("고객님의 번호를 적어주세요");
		int choise = sc.nextInt();

		System.out.println("┌──────────────────────────────────────┐");
		System.out.println("│" + (choise) + "번 손님");
		System.out.println("├──────────────────────────────────────");
		System.out.println("│ 빵 :  " + info.get(choise - 1).bread);
		System.out.println("├──────────────────────────────────────");
		System.out.println("│ 고기 : " + info.get(choise - 1).ham);
		System.out.println("├──────────────────────────────────────");
		System.out.println("│ 피클 : " + info.get(choise - 1).picle);
		System.out.println("├──────────────────────────────────────");
		System.out.println("│ 양파 : " + info.get(choise - 1).onion);
		System.out.println("├──────────────────────────────────────");
		System.out.println("│ 소스 : " + info.get(choise - 1).source);
		System.out.println("└──────────────────────────────────────┘");
	}
}
