package Rent_Car_array;

import java.util.ArrayList;
import java.util.Scanner;

public class Car_list {
	ArrayList<Car> car = new ArrayList<Car>();

	public void input() {
		Scanner sc = new Scanner(System.in);

		System.out.println("이름을입력하세요");
		String name = sc.nextLine();
		System.out.println("차 번호를 입력하세요");
		String number = sc.nextLine();

		car.add(new Car(name, number));
	}

	public void output() {
		for (int i = 0; i < car.size(); i++) {
			System.out.println("이름 : " + car.get(i).name);
			System.out.println("차 번호 : " + car.get(i).number);

		}

	}

	public void remove() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("출차 하실 차 번호를 입력하세요.");
		String car_search = scanner.next();

		for (int i = 0; i < car.size(); i++) {
			if (car_search.equals(car.get(i).number)) {
				System.out.println(car.get(i).number + " 차량이 출차 되었습니다");
				car.remove(i);

			}

		}
	}
}
