package Java12_4;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				if(j==1) {
					System.out.println(i+"단");
				}

				System.out.println(i + "*" + j + "=" + i * j);

			}
		}
	}

}
