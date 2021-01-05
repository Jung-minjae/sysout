package Codingtest;

import java.util.Random;
import java.util.Scanner;

public class Coding_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int a = sc.nextInt();
		int b = 0;
		for(int i = 1; i<=a; i++) {
		 b += i;
		}
		Random rdm = new Random();
		
		int c = rdm.nextInt(10)+1;
		System.out.println(b+"X"+c+"="+b*c);
	}

}
