package Java12_11;

import java.util.Scanner;
import java.util.ArrayList;

public class Cal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();

		System.out.println("숫자를 입력하세요");
		int array[] = new int[1];
		boolean run = true;

		int a = sc.nextInt();
		array[0] = a;
		while (run) {
			System.out.println("계산할 연산자를 입력하세요\n1. + 2. - 3. * 4. /");
			int c = sc.nextInt();
			System.out.println("계산할 숫자를 입력하세요");
			int b = sc.nextInt();

			int sum = array[0] + b;
			int min = array[0] - b;
			int dou = array[0] * b;
			int per = a / b;

			switch (c) {
			case 1:
				array[0] = sum;
				System.out.println(sum);
				break;
			case 2:
				array[0] = min;
				System.out.println(min);
				break;
			case 3:
				array[0] = dou;
				System.out.println(dou);
				break;
			case 4:
				array[0] = per;
				System.out.println(per);
				break;
			}

		}

	}
}
//int dou = a*b;
//double per = (double)a/b;

// list.add(0, sum);
// list.add(array[0]);
//int sum1 =array[0]+sum;
//System.out.println(array[0]);