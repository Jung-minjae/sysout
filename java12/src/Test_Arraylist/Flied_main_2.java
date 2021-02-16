package Test_Arraylist;

import java.util.Scanner;
import java.util.ArrayList;

public class Flied_main_2 {
	static ArrayList<Flied_val_2> fv = new ArrayList<Flied_val_2>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean run = true;
		Scanner sc = new Scanner(System.in);
		while (run) {

			System.out.println("1.입력 2. 조회 3. 삭제 4. 종료");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				input();
				break;
			case 2:
				output();
				break;
			case 3:
				delete();
				break;
			case 4:
				run = false;
				System.out.println("사용 끝");
				break;

			}
		}

	}

	static void delete() {

		Scanner sc = new Scanner(System.in);
		System.out.println("삭제하실 이름을 입력하시오.");
		String name_search = sc.next();

		for (int i = 0; i < fv.size(); i++) {
			if (name_search.equals(fv.get(i).name))
				fv.remove(i);
			else {
				System.out.println("그런이름 찾을수없습니다");
			}
		}
	}

	static void input() {

		Scanner sc = new Scanner(System.in);
		int i = 0;
		Flied_val_2 fdv = new Flied_val_2();

		System.out.println("아이디를 입력하세요");
		fdv.id = sc.nextLine();

		System.out.println("이름을 입력하세요");
		fdv.name = sc.nextLine();

		System.out.println("비밀번호를 입력하세요");
		fdv.password = sc.nextLine();

		fv.add(i, fdv);
		i++;
	}

	static void output() {

		Flied_val_2 fdv = new Flied_val_2();

		for (int i = 0; i < fv.size(); i++) {

			fv.get(i);
			System.out.println(fv.get(i).id);
			System.out.println(fv.get(i).name);
			System.out.println(fv.get(i).password);
		}
	}
}
