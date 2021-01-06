package Nam;

import java.util.Scanner;

public class Smart_Book_List {

	Smart_Book[] Smb;
	int cnt = 0;

	public void found(Smart_Book_List sbl) { // 전화번호 찾기
		Scanner sc = new Scanner(System.in);
		if (sbl.cnt == 0) {
			System.out.println("등록 정보가 없습니다");
			return;
		} else {
			System.out.println("찾을 이름을 입력해 주세요");
			String found = sc.nextLine();

			for (int i = 0; i < sbl.cnt; i++) {

				Smart_Book sb = sbl.Smb[i];

				if (sb.getName().contains(found)) {
					System.out.println(found + "님의 정보를 찾습니다");
					System.out.println(sb.getName());
					System.out.println(sb.getNumber());
					System.out.println(sbl.Smb[i].getMail());
				}
			}
		}
	}

	public void enroll(Smart_Book_List sbl) { // 전화번호 등록
		Scanner sc = new Scanner(System.in);
		String name;
		String number;
		String mail;
		System.out.println("이름을 입력하세요");
		name = sc.nextLine();
		System.out.println("연락처를 입력하세요");
		number = sc.nextLine();
		System.out.println("메일을 입력하세요");
		mail = sc.nextLine();

		Smart_Book sb = new Smart_Book();

		sb.setName(name);
		sb.setMail(mail);
		sb.setNumber(number);

		sbl.Smb[sbl.cnt] = sb;
		sbl.cnt++;
	}
}