package Ex;

import java.util.Scanner;

public class Exam_array {
	public static void main(String[] args) {
		Exam_list list = new Exam_list();
		list.a();
		Scanner scan = new Scanner(System.in);
		int menu;
		boolean keepLoop = true;

		while (keepLoop) {
			System.out.println("----------------------------------------------------------");
			System.out.println("|         ���� �޴�                   | ");
			System.out.println("----------------------------------------------------------");
			System.out.println("\t1. �����Է� ");
			System.out.println("\t2. ������� ");
			System.out.println("\t3. ���� ");
			System.out.println("\t����> ");
			menu = scan.nextInt();

			switch (menu) {
			case 1:
				list.input_list(list);
				break;
			case 2:
				list.print_list(list);
				break;
			case 3:

				break;

			default:
				System.out.println("�߸��� ���� �Է��ϼ̽��ϴ� 1~3 ������ ���ڸ� �Է����ּ���.");
			}
		}
	}
}