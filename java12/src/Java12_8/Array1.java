package Java12_8;

import java.util.Scanner;

public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("문자를 입력하세요");
		String str = sc.next();
		int str_leng = str.length();
		String array_str[] = new String[str_leng];
		String sub = "";

		for (int i = 0; i < str_leng; i++) {
			array_str[i] = str.substring(i, i + 1);

			System.out.println(array_str[i]);
		}

//		System.out.println(array_str[0]);
//		System.out.println(array_str[1]);
//		System.out.println(array_str[2]);
//		System.out.println(array_str[3]);
//		System.out.println(array_str[4]);

	}

}
