package Rent_Car_array;

import java.util.ArrayList;
import java.util.Scanner;

public class Car_list {
	ArrayList<Car> car = new ArrayList<Car>();

	public void input() {
		Scanner sc = new Scanner(System.in);

		System.out.println("�̸����Է��ϼ���");
		String name = sc.nextLine();
		System.out.println("�� ��ȣ�� �Է��ϼ���");
		String number = sc.nextLine();

		car.add(new Car(name, number));
	}

	public void output() {
		for (int i = 0; i < car.size(); i++) {
			System.out.println("�̸� : " + car.get(i).name);
			System.out.println("�� ��ȣ : " + car.get(i).number);

		}

	}

	public void remove() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("���� �Ͻ� �� ��ȣ�� �Է��ϼ���.");
		String car_search = scanner.next();

		for (int i = 0; i < car.size(); i++) {
			if (car_search.equals(car.get(i).number)) {
				System.out.println(car.get(i).number + " ������ ���� �Ǿ����ϴ�");
				car.remove(i);

			}

		}
	}
}
