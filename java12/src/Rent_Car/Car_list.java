package Rent_Car;

public class Car_list {
	private Car[] car;
	private int current;

	public Car_list() {
		car = new Car[3];
		current = 0;
	}

	public void add(String name, String number ) {
		Car c = new Car();
		c.setName(name);
		c.setNumber(number);

		if (car.length == current) {
			Car[] temp = new Car[car.length + 5];
			for (int i = 0; i < car.length; i++) {
				temp[i] = car[i];
			}
			car = temp;
		}
		car[current] = c;
		current++;
	}

	public int size() {
		return current;
	}

	public Car get(int i) {
		return this.car[i];
	}
}
