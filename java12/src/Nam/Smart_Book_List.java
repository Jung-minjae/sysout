package Nam;

import java.util.Scanner;

public class Smart_Book_List {

	Smart_Book[] Smb;
	int cnt = 0;

	public void found(Smart_Book_List sbl) { // ��ȭ��ȣ ã��
		Scanner sc = new Scanner(System.in);
		if (sbl.cnt == 0) {
			System.out.println("��� ������ �����ϴ�");
			return;
		} else {
			System.out.println("ã�� �̸��� �Է��� �ּ���");
			String found = sc.nextLine();

			for (int i = 0; i < sbl.cnt; i++) {

				Smart_Book sb = sbl.Smb[i];

				if (sb.getName().contains(found)) {
					System.out.println(found + "���� ������ ã���ϴ�");
					System.out.println(sb.getName());
					System.out.println(sb.getNumber());
					System.out.println(sbl.Smb[i].getMail());
				}
			}
		}
	}

	public void enroll(Smart_Book_List sbl) { // ��ȭ��ȣ ���
		Scanner sc = new Scanner(System.in);
		String name;
		String number;
		String mail;
		System.out.println("�̸��� �Է��ϼ���");
		name = sc.nextLine();
		System.out.println("����ó�� �Է��ϼ���");
		number = sc.nextLine();
		System.out.println("������ �Է��ϼ���");
		mail = sc.nextLine();

		Smart_Book sb = new Smart_Book();

		sb.setName(name);
		sb.setMail(mail);
		sb.setNumber(number);

		sbl.Smb[sbl.cnt] = sb;
		sbl.cnt++;
	}
}