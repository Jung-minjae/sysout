package ClassArray;

import java.util.Scanner;

public class Class_A {

	public static void main(String[] args) {
		boolean run = true;
		Class_A_list list = new Class_A_list();
		list.Class_B_array = new Class_B[3];
		list.current = 0;

		while (run) {
			// ��ü�迭�� �Ű�����.
			//@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			System.out.println("--\n �ڡڡ� 1.�Է� 2.��� 3.���� �ڡڡ�");
			int select = sc.nextInt();
			System.out.println("--");

			switch (select) {
			case 1:
				plus(list);
				break;
			case 2:
				print(list);
				break;
			case 3:
				run = false;
				break;
			}
		}
	}

	public static void plus(Class_A_list list) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		// ��ü ���� ��, �� �Է�
		Class_B B1 = new Class_B();
		System.out.println(list.current + 1 + "��° �迭�� ù��° �� �Է�");
		B1.num_1 = sc.nextInt();
		System.out.println("�����ڸ� �Է�. (+,-,*,/)");
		String oper = sc.next();
		B1.oper = oper;
		System.out.println(list.current + 1 + "��° �迭�� �ι�° �� �Է�");
		B1.num_2 = sc.nextInt();

		switch (oper) {
		case ("+"):
			B1.num_3 = B1.num_1 + B1.num_2;
			break;
		case ("-"):
			B1.num_3 = B1.num_1 + (B1.num_2 * -1);
			break;
		case ("*"):
			B1.num_3 = B1.num_1 * B1.num_2;
			break;
		case ("/"):
			double ii = B1.num_1;
			double jj = B1.num_2;
			B1.num_3 = (int) (ii / jj); // ��� ��.
			B1.num_4 = ii / jj;
			break;
		}

		// �Ű����� �迭 ��ü�� �� ���
		list.Class_B_array[list.current] = B1;
		list.current++;

		if (list.Class_B_array.length == list.current) {
			Class_B[] temp = new Class_B[list.Class_B_array.length + 5];
			for (int i = 0; i < list.Class_B_array.length; i++) {
				temp[i] = list.Class_B_array[i];
			}
			list.Class_B_array = temp;
		}

	}

	public static void print(Class_A_list list) {
		for (int i = 0; i < list.current; i++) {
			// B1 ��ü �ٽ� ���� �� �� ���.
			Class_B B1 = list.Class_B_array[i];
			if (B1.oper.equals("/")) {
				System.out.println(i + 1 + "��° ���� �� :: " + B1.num_1 + B1.oper + B1.num_2 + " = " + B1.num_4);
			} else {
				System.out.println(i + 1 + "��° ���� �� :: " + B1.num_1 + B1.oper + B1.num_2 + " = " + B1.num_3);
			}

		}
	}
}