package PhoneBook;

import java.util.Scanner;

public class Phone_main {
	public static void main(String[] args) {
		Phone_list list = new Phone_list();
		boolean run = true;
		Phone_console pc = new Phone_console();
		while (run) {
			System.out.println("�ڡ� ��ȭ��ȣ�� �Դϴ�.�ڡ� \n  1. �Է� 2. ���");
			Scanner sc = new Scanner(System.in);
			System.out.println("------------------");
			int i = sc.nextInt();
			System.out.println("------------------");

			switch (i) {
			case 1:
				pc.input();
				break;
			case 2:
				pc.output();
				break;
			}
		}
	}
}