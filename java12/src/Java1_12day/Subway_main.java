package Java1_12day;

import java.util.Scanner;

public class Subway_main {

	public static void main(String[] args) {

		Subway subway = new Subway();
		Scanner sc = new Scanner(System.in);
		boolean run = true;

		while (run) {
			System.out.println("1. �ֹ�����   2. ��ü�ֹ�Ȯ�� 3.1�� �ֹ�Ȯ��  3. ����");
			int choise = sc.nextInt();

			switch (choise) {
			case 1:
				System.out.println("�ֹ��� �����ϰڽ��ϴ�");
				subway.choise();
				break;
			case 2:
				System.out.println("�ֹ��� Ȯ���մϴ�");
				subway.check();
				break;
			case 3:
				System.out.println("������ �ֹ��� Ȯ���մϴ�");
				subway.search();
				break;
			case 4:
				System.out.println("������̿��� �����ϴ�");
				run = false;

				break;
			}
		}
	}
}