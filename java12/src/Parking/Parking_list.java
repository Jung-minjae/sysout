package Parking;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

public class Parking_list {
	private ArrayList<Parking_data> pdList;
	private int current;

	public Parking_list() {
		pdList = new ArrayList<Parking_data>(50); // ������ ũ�� 50
		current = 0;
	}

	public void add_car(String car_number) {
		Parking_data car = new Parking_data(); // ����
		String input_time = now_time(); // ���� ���� �ð�
		int change_minutes = cal_minutes(input_time); // ���� �ð��� �д����� ��ȯ

		car.setCar_number(car_number);
		car.setInput_time(input_time);
		car.setChange_minutes(change_minutes);

		pdList.add(car);
		current++;
	}

	public void remove_car(int i) { // ����
		pdList.remove(i);
		current--;
	}

	public int get_fee(Parking_data car) { // ������ �� ��ݰ��
		String output_time = now_time();
		int fee = ((cal_minutes(output_time) - car.getChange_minutes()) / 30) * 1000;
		return fee;
	}

	public int get_Predictfee(Parking_data car, String current_time) { // ���� ��� ���
		int fee = ((cal_minutes(current_time) - car.getChange_minutes()) / 30) * 1000;
		if (fee == 0) {
			System.out.print("��¥");
			return 0;
		} else if (fee < 0) { // �����ϰ� ��12�ð� ������ ���� �鸸��
			System.out.println("���� �� �ϸ������� ������ �ƴ϶���? �鸸�� ��");
			return 1000000;
		} else {
			return fee;
		}

	}

	public String now_time() { // ����ð� ���
		Calendar time = Calendar.getInstance();
		SimpleDateFormat format = new SimpleDateFormat("HH��mm��");
		String now_time = format.format(time.getTime());
		return now_time;
	}

	public int cal_minutes(String time) { // �ð��� ������ ���
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