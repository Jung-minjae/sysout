package Java12_9;

import java.util.Scanner;

public class FinalPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 스캐너로 글자받고 숫자인지 문자인지 구분 숫자이면 숫자로 변환해서 덧셈 문자이면 숫자가 아닙니다 출력
		// 유니코드 48~57이 0~9

		Scanner sc = new Scanner(System.in);
		System.out.println("문자를 입력하세요");
		String a = sc.nextLine();
		int c = 0;
		String str[] = new String[100];

		for (int i = 0; i < a.length(); i++) {

			str[i] = a.substring(i, i + 1);
			// System.out.println(str[i]);
			if (str[i].equals("0") || str[i].equals("1") || str[i].equals("2") || str[i].equals("3")
					|| str[i].equals("4") || str[i].equals("5") || str[i].equals("6") || str[i].equals("7")
					|| str[i].equals("8") || str[i].equals("9")) {
				int b = (int) Integer.parseInt(str[i]);
				
				System.out.println(b);
				c += b;
				System.out.println("숫자의 총 합은" + c);
			}

			else {
				System.out.println("숫자가 아닙니다.");
			}
		}
//			if (c >= 48 && c < 58) {
//				System.out.println("숫자입니다.");
//				 c1=  ;
//				
//			}
//			
//			else {
//				System.out.println("숫자가 아닙니다.");
//			}
//			} 

	}

}
//	char c = a.charAt(i);
//	if (c >= 48 && c < 58) {
//		System.out.println("숫자입니다.");
//	 int b = Integer.parseInt(c);

//int Array[] = { b };
//
//System.out.println(Array[0]);
//for (int j = 0; j < Array.length; j++) {
//else {
//	System.out.println("숫자가아닙니다.");
//}

//
//if(sub.equals("0")||sub.equals("1")||sub.equals("2")||sub.equals("3")||sub.equals("4")||sub.equals("5")||
//		sub.equals("6")||sub.equals("7")||sub.equals("8")||sub.equals("9")) {
//	System.out.println("숫자입니다.");
//	for(int j = 0; j<a.length();j++) {
//	int b[] = {Integer.parseInt(sub)};
//	System.out.println(b[j]);
//	}
//}