package Codingtest;

import java.util.Scanner;

public class Coding_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("몇 개의 숫자를 계산하시겠습니까");
		
		int a = sc.nextInt();
		int [] array = new int[a];
		int i = 0;
		while(i<a) {
			System.out.println("계산할 숫자를 입력하세요");
			array[i] = sc.nextInt();
			
			i++;
		}
		System.out.println("계산할 연산자를 입력하세요 1. + 2. - 3. * 4. /");
		int b = sc.nextInt();
		switch(b) {
		case 1:
			int c =0;
			for(int j = 0; j<a; j++) {
				 c+=array[j];
			}
			 System.out.println(c);
			break;
		case 2:
			int d = array[0];
			for(int j = 0; j<a-1; j++) {
				d -= array[j+1];
			}
			System.out.println(d);
			break;
		case 3:
			int e = 1;
			for(int j = 0; j<a; j++) {
				e *= array[j];
			}
			break;
		case 4:
			double f =(double) array[0];
			for(int j = 0; j<a-1; j++) {
				f /=(double) array[j+1];
			}
			System.out.println(f);
			break;
		}
		
	}

}
