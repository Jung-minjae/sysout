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

			System.out.println("전화번호부 입니다. 어떤기능을 이용하시겠습니까?\n 1. 등록 2. 찾기 3. 종료");
			int ch = sc.nextInt();

			switch (ch) {

			case 1:
				System.out.println("새 전화번호를 등록합니다");
				sbl.enroll(sbl);
				break;
			case 2:
				System.out.println("연락처 찾기입니다");
				sbl.found(sbl);
				break;
			case 3:
				System.out.println("전화번호부를 종료합니다");
				run = false;
				break;
			}
		}
	}
}