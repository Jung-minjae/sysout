package Rent_Car;

import java.util.Scanner;

public class Car_console {
	private Car_list list = new Car_list();
	private String[] car_name = { "�ҳ�Ÿ", "�׷���", "K5", "�ƹݶ�" };// �뿩��
	void input() {
		String name;
		String number;
		Car car = new Car();

		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է����ּ���");
		int choice = sc.nextInt();
		
		System.out.println("�̸��� �Է��ϼ���");
		name = sc.nextLine();

		System.out.println("��ȭ��ȣ�� �Է����ּ���");
		number = sc.nextLine();
		list.add( name, number );

	}

	void output() {
		for (int i = 0; i < list.size(); i++) {
			Car ca = list.get(i);
			System.out.println("----" + (i + 1) + "��° �������մ�----");

			System.out.println("���� :: " + ca.getName());
			System.out.println("��ȭ��ȣ :: " + ca.getNumber());

		}
	}
}
