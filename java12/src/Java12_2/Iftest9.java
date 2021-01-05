package Java12_2;

import java.util.Scanner;
public class Iftest9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 2개의 값을 받고 하나는 내가 바꿀 돈 원
		// 하나는 현재 환율을 입력하기
		//달러로 계산하기
		
		Scanner sc = new Scanner(System.in);
		System.out.println("바꿀 돈을 입력하세요");
		int won = sc.nextInt();
		double dol = 1101.5;
		System.out.println("현재 1달러에"+dol+"입니다");
		
		System.out.println(won+"받았습니다");
		double exc = won/dol ;
		int exc_2=(int)exc;
		System.out.println("여기"+exc_2+"달러 입니다");
		double exc_1 = won%dol;
		int exc_3 = (int)exc_1;
		System.out.println("환전하지 못한 금액"+exc_3+"입니다");
				
	}

}
