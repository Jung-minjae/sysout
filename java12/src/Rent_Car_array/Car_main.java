package Rent_Car_array;

import java.util.Scanner;

public class Car_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. ���� 2. �Է�
		Scanner sc = new Scanner(System.in);
		Car_list cl = new Car_list();

		boolean run = true;
		while (run) {
			System.out.println("1.�Է� 2.��ȸ 3.���� 4. ����");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:

				cl.input();
				break;
			case 2:
				System.out.println("��ȸ");
				cl.output();
				break;

			case 3:
				cl.remove();
				break;
			case 4:
				System.out.println("����");
				run = false;
				break;

			}

		}
	}

}
