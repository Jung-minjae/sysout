package Hudaphone;

import java.util.Scanner;

public class Phone_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book_list list = new Book_list();

		Scanner sc = new Scanner(System.in);
		boolean run = true;

		while (run) {
			System.out.println("1.�Է� 2. ��ȸ 3 . ������");
			int choice = sc.nextInt();

			switch (choice) {

			case 1:
				System.out.println("�Է����� ���Խ��ϴ�");
				list.input(list);

				break;
			case 2:
				System.out.println("��ȸ�ϰڽ��ϴ�");

				list.output(list);
				break;

			case 3:
				System.out.println("��������ϰڽ��ϴ�");
				run = !run;
				break;
			}

		}
	}
}