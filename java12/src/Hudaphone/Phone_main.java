package Hudaphone;

import java.util.Scanner;

public class Phone_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book_list list = new Book_list();

		Scanner sc = new Scanner(System.in);
		boolean run = true;

		while (run) {
			System.out.println("1.입력 2. 조회 3 . 끝내기");
			int choice = sc.nextInt();

			switch (choice) {

			case 1:
				System.out.println("입력으로 들어왔습니다");
				list.input(list);

				break;
			case 2:
				System.out.println("조회하겠습니다");

				list.output(list);
				break;

			case 3:
				System.out.println("사용종료하겠습니다");
				run = !run;
				break;
			}

		}
	}
}