package Java1_12day;

import java.util.ArrayList;
import java.util.Scanner;

public class Subway {

	ArrayList<Subway_info> info = new ArrayList<Subway_info>();

	public void choise() {

		Scanner sc = new Scanner(System.in);

		String bread = "";
		String source = "";
		String ham = "";
		String onion = "";
		String picle = "";

		System.out.println("���� �����Ͻÿ�. ");
		System.out.println("1. �÷�    2. ��Ʈ��   3. �ĸ���");
		int choise = sc.nextInt();

		switch (choise) {
		case 1:
			bread = "�÷�";
			break;
		case 2:
			bread = "��Ʈ��";
			break;
		case 3:
			bread = "�ĸ���";
			break;
		}

		System.out.println("������ �����ðڽ��ϱ�?  1. yes   2. no");

		choise = sc.nextInt();
		switch (choise) {
		case 1:
			onion = "���� �߰�";
			break;
		case 2:
			onion = "���� �ʽ��ϴ�";
			break;
		}
		System.out.println("��Ŭ�� �����ðڽ��ϱ�?  1. yes   2. no");

		choise = sc.nextInt();
		switch (choise) {
		case 1:
			picle = "��Ŭ �߰�";

			break;
		case 2:
			picle = "�����ʽ��ϴ�";

			break;
		}

		System.out.println("��⸦ �����ðڽ��ϱ�?  1. yes   2. no");

		choise = sc.nextInt();
		switch (choise) {
		case 1:
			ham = "��� �߰�";
			break;
		case 2:
			ham = "���� �ʽ��ϴ�";
			break;
		}

		System.out.println("�ҽ��� �����Ͻÿ�. ");
		System.out.println("1. ����    2. �������   3. �ּҽ�");
		choise = sc.nextInt();

		switch (choise) {
		case 1:
			source = "����";
			break;
		case 2:
			source = "�������";
			break;
		case 3:
			source = "�ּҽ�";
			break;
		}

		info.add(new Subway_info(bread, onion, picle, ham, source));
	}

	public void check() {

		for (int i = 0; i < info.size(); i++) {
			System.out.println("��������������������������������������������������������������������������������");
			System.out.println("��" + (i + 1) + "�� �մ�");
			System.out.println("������������������������������������������������������������������������������");
			System.out.println("�� �� :  " + info.get(i).bread);
			System.out.println("������������������������������������������������������������������������������");
			System.out.println("�� ��� : " + info.get(i).ham);
			System.out.println("������������������������������������������������������������������������������");
			System.out.println("�� ��Ŭ : " + info.get(i).picle);
			System.out.println("������������������������������������������������������������������������������");
			System.out.println("�� ���� : " + info.get(i).onion);
			System.out.println("������������������������������������������������������������������������������");
			System.out.println("�� �ҽ� : " + info.get(i).source);
			System.out.println("��������������������������������������������������������������������������������");
		}

	}

	public void search() {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ ��ȣ�� �����ּ���");
		int choise = sc.nextInt();

		System.out.println("��������������������������������������������������������������������������������");
		System.out.println("��" + (choise) + "�� �մ�");
		System.out.println("������������������������������������������������������������������������������");
		System.out.println("�� �� :  " + info.get(choise - 1).bread);
		System.out.println("������������������������������������������������������������������������������");
		System.out.println("�� ��� : " + info.get(choise - 1).ham);
		System.out.println("������������������������������������������������������������������������������");
		System.out.println("�� ��Ŭ : " + info.get(choise - 1).picle);
		System.out.println("������������������������������������������������������������������������������");
		System.out.println("�� ���� : " + info.get(choise - 1).onion);
		System.out.println("������������������������������������������������������������������������������");
		System.out.println("�� �ҽ� : " + info.get(choise - 1).source);
		System.out.println("��������������������������������������������������������������������������������");
	}
}
