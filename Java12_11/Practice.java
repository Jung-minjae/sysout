package Java12_11;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 항 갯수를 선택할수있고 for 문으로 항갯수를 받고
		// 그 숫자를 배열에 담아서 한개의 항만 덧셈

		Scanner sc = new Scanner(System.in);
		boolean run = true;
		while (run) {
			System.out.println("받아올 숫자의 갯수를 입력하세요.");

			int n = 1;
			int result = 0;
			int result1 = 1;

			int i = 0;
			int k = 0;
			int b = 0;
			int a = sc.nextInt();
			int array[] = new int[a];
			for (i = 0; i < a; i++) {
				System.out.println(n + "번째 숫자를 입력하세요");
				b = sc.nextInt();

				array[k] = b;
				n++;
				k++;

			}

			System.out.println("사용하실 연산자를 입력하세요.\n1.+ 2.- 3.* 4./");
			int p1 = sc.nextInt();
			switch (p1) {
			case 1:
//				for( int j = 0; j<a; j++) {
//					result += array[j];
				for (int kk : array) {
					result += kk;
				}
				System.out.println(result);
				break;
			case 2:
				for (int j = 1; j < a; j++) {
					result -= array[j];

				}
				System.out.println(result + array[0]);
				break;
			case 3:
				for (int j = 0; j < a; j++) {

					result1 *= array[j];
				}
				System.out.println(result1);
				break;
			case 4:
				for (int j = 1; j < a; j++) {
					double array_1 = (double) array[j];
					double array_2 = (double) array[0];
					array_2 /= array_1;
					System.out.println(array_2);
				}

				break;
			}

			System.out.println("다시 하시겠습니까?/n 1.예 2.아니오");
			int p = sc.nextInt();
			if (p == 2) {
				run = !run;
			}

		}
	}

}
//for( int j = 0; j<a; j++) {
//	 sum += array[j];
//}
