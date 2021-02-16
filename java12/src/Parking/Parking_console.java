package Parking;

import java.util.Scanner;

public class Parking_console {
	private Scanner scan = new Scanner(System.in);
	private Parking_list pl = new Parking_list();

	public void input_car() {
		System.out.print("차번호: ");
		String car_number = scan.next();

		pl.add_car(car_number);
		System.out.println("주차장 IN");
	}

	public void show_Predictfee() {
		System.out.print("차넘버 입력: ");
		String car_number = scan.next();
		if (pl.get_count() == 0) {
			System.out.println("일치하는 차가 없슴둥");
		}
		for (int i = 0; i < pl.get_count(); i++) {
			if (pl.get(i).getCar_number().equals(car_number)) { // 차넘버가 같으면
				System.out.print("예상시간 입력(ex 01시35분): ");
				String current_time = scan.next();
				System.out.println("차번호: " + pl.get(i).getCar_number());
				System.out.println("입차시간: " + pl.get(i).getInput_time());
				System.out.println("예상요금: " + pl.get_Predictfee(pl.get(i), current_time) + "원");
				break;
			} else { // 다르면
				if (i == pl.get_count() - 1) {
					System.out.println("일치하는 차가 없슴둥");
				}
			}
		}
	}

	public void output_car() {
		System.out.print("차번호: ");
		String car_number = scan.next();
		if (pl.get_count() == 0) {
			System.out.println("일치하는 차가 없슴둥");
		}
		for (int i = 0; i < pl.get_count(); i++) {
			if (pl.get(i).getCar_number().equals(car_number)) { // 차넘버가 같으면
				System.out.println("차번호: " + pl.get(i).getCar_number());
				System.out.println("입차시간: " + pl.get(i).getInput_time());
				System.out.println("요금: " + pl.get_fee(pl.get(i)) + "원");
				pl.remove_car(i);
				System.out.println("주차장 OUT");
				break;
			} else { // 다르면
				if (i == pl.get_count() - 1) {
					System.out.println("일치하는 차가 없슴둥");
				}

			}

		}
	}

}