package Flied;

import java.util.Scanner;

public class parking_lot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		parking_console pk_cs = new parking_console();
		Scanner sc = new Scanner(System.in);
		boolean bo = true;
		while (bo) {
			System.out.println("=========================================");
			System.out.println("|         �����忡 ���Ű� ȯ���մϴ�.          |");
			System.out.println("=========================================");
			System.out.println("\t1. ���� �ϱ�");
			System.out.println("\t2. ���� ����/���� Ȯ��");
			System.out.println("\t3. ����");
			int pick = sc.nextInt();
			switch (pick) {
			case 1:
				pk_cs.Do();
				break;

			case 2:
				pk_cs.List();
				break;

			case 3:
				bo = false;
				break;

			default:
				System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
				break;
			}
		}
	}

}