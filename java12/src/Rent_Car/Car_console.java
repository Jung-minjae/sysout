package Rent_Car;

import java.util.Scanner;

public class Car_console {
	private Car_list list = new Car_list();
	private String[] car_name = { "소나타", "그랜져", "K5", "아반떼" };// 대여차
	void input() {
		String name;
		String number;
		Car car = new Car();

		Scanner sc = new Scanner(System.in);
		System.out.println("차종을 입력해주세요");
		int choice = sc.nextInt();
		
		System.out.println("이름을 입력하세요");
		name = sc.nextLine();

		System.out.println("전화번호를 입력해주세요");
		number = sc.nextLine();
		list.add( name, number );

	}

	void output() {
		for (int i = 0; i < list.size(); i++) {
			Car ca = list.get(i);
			System.out.println("----" + (i + 1) + "번째 빌려간손님----");

			System.out.println("성함 :: " + ca.getName());
			System.out.println("전화번호 :: " + ca.getNumber());

		}
	}
}
