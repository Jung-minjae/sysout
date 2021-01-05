package Java12_16;

public class Bus {
	
	String bus_sort[] = {"99","87","86","110_1"};

	

public static void take(int a) {
	
	if (a==99) {
		System.out.println("99번 버스에 탑니다");
	}
	else if(a==87) {
		System.out.println("87번 버스에 탑니다");
	}
	else if(a==86) {
		System.out.println("86번 버스에 탑니다");
	}
	else {
		System.out.println("110_1번 버스에 탑니다");
	}
}

public static void fee(int a) {
	
	if(a==1) {
		System.out.println("카드를 찍습니다 (감사합니다)");
	}
	if(a==2) {
		System.out.println("요금은 1200원 입니다");
	}
}

}