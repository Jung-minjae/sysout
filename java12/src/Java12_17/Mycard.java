package Java12_17;

public class Mycard {
		
	static int Bus_card = 5000;
		
	public static void main(String[] args) {
			// TODO Auto-generated method stub
		
		Bus bus = new Bus(Bus_card);
		
		Bus_card = bus.Reader(Bus_card);
		
		Elevator ev = new Elevator(5);
		ev.up(6);
	}

}
