package Java12_14;

import java.util.Scanner;

public class Practicemethod {

		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			System.out.println("몇항 계산을 하시겠습니까?");
			int count = sc.nextInt(); // 항 갯수를 받음
			int num[] = new int[count]; // 항 갯수만큼 배열 생성
			for (int i = 0; i < count; i++) { // for 문 돌림
				num[i] = count_process(i); // count_process
			}
			String cal = cal();
			System.out.println(cal);
		}

		public static int count_process(int count) {
			Scanner sc = new Scanner(System.in);
			System.out.println(count + 1 + " 번 째 숫자를 입력해주세요.");
			int num = sc.nextInt();
			return num;
		}

		public static String cal() {
			Scanner sc = new Scanner(System.in);
			System.out.println("어떤 연산을 하시겠습니까?");
			String str = sc.nextLine();
			return str;
		}
	}