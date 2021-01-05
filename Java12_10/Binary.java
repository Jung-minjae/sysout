package Java12_10;

import java.util.Scanner;

public class Binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 글자를 ABC 문자로받고 o
		// chatAt 짜르고
		// 짤린것을 2진법으로 바꿈
		// 0=. ,1=-로포현

		Scanner sc = new Scanner(System.in);
		boolean run = true;
		while (run) {
			System.out.println("2진수로 변환할 문자를 입력하세요");
			String a = sc.next();
			int leng = a.length();
			char c = ' ';
			String array[] = new String[leng];
			for (int i = 0; i < leng; i++) {
				c = a.charAt(i);
				System.out.println(c);
				String bi = Integer.toBinaryString(c);
				// System.out.println(bi);
				array[i] = bi;
				System.out.println(array[i]);
				for (int j = 0; j < array[i].length(); j++) {
					String sub = array[i].substring(j, j + 1);
					// System.out.println(sub);
					if (sub.equals("1")) {
						System.out.println(sub + "   ㅡ");
					} else {
						System.out.println(sub + "   O");
					}
				}
			}

		}

	}

}
