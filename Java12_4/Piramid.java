package Java12_4;

import java.util.Scanner;

public class Piramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("피라미드 단 수를 입력해주세요");
		int k = sc.nextInt();

		for (int i = k; i > 0; i--) {
			for (int j = 0; j < k * 2; j++) {
				if (j <= k && i <= j) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			k++;
			System.out.println();
		}

	}

}
