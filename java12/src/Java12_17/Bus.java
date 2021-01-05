package Java12_17;

public class Bus {
static int fee = 1200;


public Bus(int card) {
	
	
}



public static int Reader(int card) {
	card = card - fee;
	System.out.println("잔액은"+card);
	return card;
}

	

}
