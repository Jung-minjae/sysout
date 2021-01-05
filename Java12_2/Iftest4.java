package Java12_2;

import java.util.Scanner;
public class Iftest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 숫자 2개를 입력받는다 
		// 두개를 더하고 50보다 크면 3으로 나누고
		// 60보다 크면 6으로 나누고
		// 100보다 크면 숫자를 하나 받아 나눈다
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int a = sc.nextInt();
		System.out.println("숫자를 입력하세요");
		int b = sc.nextInt();
		int c = a+b;
		if (c>=50 && c<60) {
			System.out.println("나눈값"+c/3);
		}
		else if (c>=60 && c<100) {
			System.out.println("나눈값"+c/6);
		}
		else if (c>=100) {
			System.out.println("숫자를 입력하세요");
			int d =sc.nextInt();
		System.out.println("나눈값"+c/d);
		}
	}

}
