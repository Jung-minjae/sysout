package Parking;

public class Parking_data {
	private String car_number; // 차번호
	private String input_time; // HH시MM분
	private int change_minutes; // 분단위로 변환

	public String getCar_number() {
		return car_number;
	}

	public void setCar_number(String car_number) {
		this.car_number = car_number;
	}

	public String getInput_time() {
		return input_time;
	}

	public void setInput_time(String input_time) {
		this.input_time = input_time;
	}

	public void setChange_minutes(int change_minutes) {
		this.change_minutes = change_minutes;
	}

	public int getChange_minutes() {
		return change_minutes;
	}

}