package Nam;

import java.util.Scanner;

public class Smartphon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		Smart_Book_List sbl = new Smart_Book_List();
	
		boolean run = true;
		sbl.Smb = new Smart_Book[5];
		while (run) {

			System.out.println("��ȭ��ȣ�� �Դϴ�. ������ �̿��Ͻðڽ��ϱ�?\n 1. ��� 2. ã�� 3. ����");
			int ch = sc.nextInt();

			switch (ch) {

			case 1:
				System.out.println("�� ��ȭ��ȣ�� ����մϴ�");
				sbl.enroll(sbl);
				break;
			case 2:
				System.out.println("����ó ã���Դϴ�");
				sbl.found(sbl);
				break;
			case 3:
				System.out.println("��ȭ��ȣ�θ� �����մϴ�");
				run = false;
				break;
			}
		}
	}
}