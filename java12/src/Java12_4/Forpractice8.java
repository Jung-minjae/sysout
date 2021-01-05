package Java12_4;

import java.util.Scanner;

public class Forpractice8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 임의의 String 문자를 받습니다
		// for 문을 돌려서 위 글자를 하나씩 갈라봅니다
		// 자른 글자에 특수 글자 #?! 가 있으면 잘못입력했다고 뜹니다
		Scanner sc = new Scanner(System.in);

		System.out.println("문자를 입력하세요");
		String s = sc.next();
		if(s.equals("#") || s.equals("!")|| s.equals("?")) {
			System.out.println("잘못입력하셨습니다.");
			
		}
		else {
			for (int i = 0; i < s.length(); i++) {
				String sub = s.substring(i, i + 1);
			System.out.println(sub);
			
			}
		}

//		for (int i = 0; i < s.length(); i++) {
//			String sub = s.substring(i, i + 1);
//			System.out.println(sub);
//			
//			if (sub.equals("#") || sub.equals("?") || sub.equals("!")) {
//				System.out.println("잘못 입력하셨습니다");
//			}
//			
//			
//		}
		
		
	}

}
