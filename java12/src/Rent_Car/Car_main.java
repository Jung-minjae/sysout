package Rent_Car;

import java.util.Scanner;

public class Car_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. ���� 2. �Է�
		Scanner sc = new Scanner(System.in);
		Car_console cc = new Car_console();
		
		boolean run = true;
		while (run) {
			System.out.println("1.�Է� 2. ��ȸ 3. ����");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:

				cc.input();
				break;
			case 2:
				System.out.println("��ȸ");
				cc.output();
				break;
			case 3:
				System.out.println("����");
				run = false;
				break;

			}

		}
	}

}
