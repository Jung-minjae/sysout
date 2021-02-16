package Parking;

import java.util.Scanner;

public class Parking_console {
	private Scanner scan = new Scanner(System.in);
	private Parking_list pl = new Parking_list();

	public void input_car() {
		System.out.print("����ȣ: ");
		String car_number = scan.next();

		pl.add_car(car_number);
		System.out.println("������ IN");
	}

	public void show_Predictfee() {
		System.out.print("���ѹ� �Է�: ");
		String car_number = scan.next();
		if (pl.get_count() == 0) {
			System.out.println("��ġ�ϴ� ���� ������");
		}
		for (int i = 0; i < pl.get_count(); i++) {
			if (pl.get(i).getCar_number().equals(car_number)) { // ���ѹ��� ������
				System.out.print("����ð� �Է�(ex 01��35��): ");
				String current_time = scan.next();
				System.out.println("����ȣ: " + pl.get(i).getCar_number());
				System.out.println("�����ð�: " + pl.get(i).getInput_time());
				System.out.println("������: " + pl.get_Predictfee(pl.get(i), current_time) + "��");
				break;
			} else { // �ٸ���
				if (i == pl.get_count() - 1) {
					System.out.println("��ġ�ϴ� ���� ������");
				}
			}
		}
	}

	public void output_car() {
		System.out.print("����ȣ: ");
		String car_number = scan.next();
		if (pl.get_count() == 0) {
			System.out.println("��ġ�ϴ� ���� ������");
		}
		for (int i = 0; i < pl.get_count(); i++) {
			if (pl.get(i).getCar_number().equals(car_number)) { // ���ѹ��� ������
				System.out.println("����ȣ: " + pl.get(i).getCar_number());
				System.out.println("�����ð�: " + pl.get(i).getInput_time());
				System.out.println("���: " + pl.get_fee(pl.get(i)) + "��");
				pl.remove_car(i);
				System.out.println("������ OUT");
				break;
			} else { // �ٸ���
				if (i == pl.get_count() - 1) {
					System.out.println("��ġ�ϴ� ���� ������");
				}

			}

		}
	}

}