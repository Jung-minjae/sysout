package Parking;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

public class Parking_list {
	private ArrayList<Parking_data> pdList;
	private int current;

	public Parking_list() {
		pdList = new ArrayList<Parking_data>(50); // 주차장 크기 50
		current = 0;
	}

	public void add_car(String car_number) {
		Parking_data car = new Parking_data(); // 입차
		String input_time = now_time(); // 차가 들어온 시간
		int change_minutes = cal_minutes(input_time); // 들어온 시간을 분단위로 변환

		car.setCar_number(car_number);
		car.setInput_time(input_time);
		car.setChange_minutes(change_minutes);

		pdList.add(car);
		current++;
	}

	public void remove_car(int i) { // 출차
		pdList.remove(i);
		current--;
	}

	public int get_fee(Parking_data car) { // 출차할 때 요금계산
		String output_time = now_time();
		int fee = ((cal_minutes(output_time) - car.getChange_minutes()) / 30) * 1000;
		return fee;
	}

	public int get_Predictfee(Parking_data car, String current_time) { // 예상 요금 계산
		int fee = ((cal_minutes(current_time) - car.getChange_minutes()) / 30) * 1000;
		if (fee == 0) {
			System.out.print("공짜");
			return 0;
		} else if (fee < 0) { // 입차하고 밤12시가 지나면 벌금 백만원
			System.out.println("들어올 땐 니맘이지만 나갈땐 아니란다? 백만원 줘");
			return 1000000;
		} else {
			return fee;
		}

	}

	public String now_time() { // 현재시간 계산
		Calendar time = Calendar.getInstance();
		SimpleDateFormat format = new SimpleDateFormat("HH시mm분");
		String now_time = format.format(time.getTime());
		return now_time;
	}

	public int cal_minutes(String time) { // 시간을 분으로 계산
		String hours = time.substring(0, 2);
		String minues = time.substring(3, 5);
		int change_minutes = (Integer.parseInt(hours) * 60) + Integer.parseInt(minues);
		return change_minutes;
	}

	public Parking_data get(int i) {
		return pdList.get(i);
	}

	public int get_count() {
		return current;
	}
}