package Parking;

import java.util.Scanner;

public class Parking_main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean parking_run = true;
		Parking_console pc = new Parking_console();

		while (parking_run) {
			System.out.println("[1]���� [2]���� �����ȸ [3]����");
			int menu = scan.nextInt();
			switch (menu) {
			case 1: // ����
				pc.input_car();
				break;
			case 2: // ������ �ð����� ����� ���� �����ȸ
				pc.show_Predictfee();
				break;
			case 3: // ����(����)
				pc.output_car();
				break;
			default:
				System.out.println("�ٽ��Է�!");
				break;
			}
		}

	}

}