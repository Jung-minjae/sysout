package Java12_15;

import java.util.Scanner;

public class Practicemethoddddd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 무비타이틀 배열 선언해주기
		// 스캐너로 숫자를 받는다 (예문에 장르를 선택해주세요 1.sf 2.액션 3.멜로)
		// 1. sf에 관련된 배열(ex)인터스텔라 마션 스타워즈
		// 2. 액션 선택하면 ...5편씩
		
		Scanner sc = new Scanner(System.in);
		
		String [] movie_title = new String[5];
		System.out.println("장르를 선택해주세요\n 1. sf판타지  2. 코미디  3. 연애");
		
		int choice = sc.nextInt();
		
		switch(choice) {
		
		case 1:System.out.println("sf판타지를 선택하셨습니다.");
		System.out.println("현재 상영중인 영화는");
		System.out.println();
		 	movie_title = fanta();
		 	for(String a :movie_title) {
		 		System.out.println(a);
		 	}
		 	
			break;
		case 2:System.out.println("코미디를 선택하셨습니다.");
		System.out.println("현재 상영중인 영화는");
		System.out.println();
		movie_title = comedy();
		for(String b :movie_title) {
			System.out.println(b);
		}
			break;
		case 3:System.out.println("연애를 선택하셨습니다.");
		System.out.println("현재 상영중인 영화는");
		System.out.println();
		movie_title = love();
		for(String c :movie_title) {
			System.out.println(c);
		}
			break;
		}
		
	}
	
	public static String[] fanta() {
		String[] fanta = {"해리포터", "반지의제왕","인터스텔라","아이언맨","박물관이살아있다"};
		return fanta;
		
	}
	public static String[] comedy() {
		String[] comedy = {"나홀로집에","소림축구","언터쳐블","엑시트","내안의그놈"};
		return comedy;
	}
	public static String[] love() {
		String[] love = {"지금 만나러갑니다","가장보통의연애","라라랜드","연애의온도","너의결혼식"};
		return love;
	}
}
