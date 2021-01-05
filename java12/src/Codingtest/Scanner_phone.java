package Codingtest;

import java.util.Scanner;

public class Scanner_phone extends Smart {

	public int scan() {
		Scanner sc = new Scanner(System.in);
		System.out.println("1. 전화번호 부");
		System.out.println("2. 전화걸기");
		System.out.println("3. 시간 확인");
		System.out.println("4. 인터넷 검색");
		int ch = sc.nextInt();
		return ch;
	}

	public int callscan() {
		Scanner sc = new Scanner(System.in);
		System.out.println("어디에 전화를 거시겠습니까");
		System.out.println("1. 어머니 2.아버지 3. 동생 4. 여자친구 5. 친구1 6. 친구2");
		int ch1 = sc.nextInt();
		return ch1;
	}
}
