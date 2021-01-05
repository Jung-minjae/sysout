package Java12_9;

import java.util.Scanner;

public class Arraycal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean run = true;
		String str[] = new String[5];
		int i = 0;
		int j = 0;
		int k = 0;
		Scanner sc = new Scanner(System.in);
		while (run) {
			System.out.println("숫자를 입력하세요");
			int a = sc.nextInt();

			System.out.printf("연산자를 입력하세요\n1.+ 2.- 3.* 4./");
			int b = sc.nextInt();
			System.out.println("계산할 숫자를 입력하세요");
			int c = sc.nextInt();
			int sum = a + c;
			int min = a - c;
			int dou = a * c;
			int per = a / c;

			switch (b) {
			case 1:
				System.out.println(a + "+" + c + "=" + (a + c));
				break;
			case 2:
				System.out.println(a + "-" + c + "=" + (a - c));
				break;
			case 3:
				System.out.println(a + "*" + c + "=" + (a * c));
				break;
			case 4:
				if (b == 4) {
					double d = (double) a;
					double e = (double) c;

					System.out.println(a + "+" + c + "=" + (d / e));
					break;
				}
			}

			String sum1 = Integer.toString(sum);
			String min1 = Integer.toString(min);
			String dou1 = Integer.toString(dou);
			String per1 = Integer.toString(per);

			if (b == 1) {

				str[i] = sum1;
				System.out.println("계산한 값 저장");
				i++;
			}
			//
			// }
			if (b == 2) {
				str[i] = min1;
				System.out.println("계산한 값 저장");
				i++;

			}
			if (b == 3) {
				str[i] = dou1;
				System.out.println("계산한 값 저장");
				i++;
			}
			if (b == 4) {
				str[i] = per1;
				System.out.println("계산한 값 저장");
				i++;
			}
			System.out.println("저장된 값을 조회 하시겠습니까?\n 1. 예 2. 아니오");
			int f = sc.nextInt();
			if (f == 1) {
				System.out.println("저장된 값은");
				for (j = 0; j < i; j++) {
					System.out.println(str[j]);
				}
//				System.out.println("저장된 값의 합은");
//				for (k=0;k<=j;k++) {
//					System.out.println();
//				}
			}

		}

	}

}

