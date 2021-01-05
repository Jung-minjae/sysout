package Java12_21;

abstract class car{
	int speed = 0;
	String color;
	
	void upSpeed(int speed) {
		this.speed += speed;
	}
}
class Sedan extends car{
	
}
class Truck extends car{
	
}

public class Ex12_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Sedan sedan1 = new Sedan();
		System.out.println("승용차 인스턴스 생성~");
		
		Truck truck1 = new Truck();
		System.out.println("트럭 인스턴스 생성~");
		
		
	}

}