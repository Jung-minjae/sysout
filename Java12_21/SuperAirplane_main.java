package Java12_21;

public class SuperAirplane_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperAirplane ar = new SuperAirplane();
		ar.takeoff();
		ar.fly();
		ar.flyMode = ar.SUPERSONIC;
		ar.fly();
		ar.flyMode = ar.Nomal;
		ar.fly();
		ar.land();
	}

}
