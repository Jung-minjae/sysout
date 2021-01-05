package Java12_15;

public class Car_ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car car = new Car();
		
		String car_nm = car.model;
		System.out.println(car_nm);
		System.out.println(car.color);
		
		car.speed = 100;
		System.out.println(car.speed);
		
		Car_extend ce = new Car_extend();
		String model_1 = ce.model;
		System.out.println(model_1);
	}

}
