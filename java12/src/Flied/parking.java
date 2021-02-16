package Flied;

import java.util.ArrayList;

public class parking {
	private ArrayList<Car_list> Car_array = new ArrayList<Car_list>();

	public ArrayList<Car_list> get() {

		return Car_array;
	}

	public void add(String Car_number, String pk_time) {
		Car_list car = new Car_list();
		car.setCar_number(Car_number);
		car.setPk_time(pk_time);

		Car_array.add(car);

	}

}