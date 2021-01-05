package Java12_17;

public class Sonata {
	
	static String model = "Sonata";
static	String brand = "Hyundai";
static	String owner = "";
static String color = "";
static	int maxSpeed = 250;
static	int km = 0; 

	public Sonata(int maxSpeed, int km, String name,String color) {
		this.maxSpeed = maxSpeed;
		this.km = km;
		this.owner = name;
		this.color = color;
		
//		run(model,brand,maxSpeed,km,owner);
	}
	
	public static void run() {
		System.out.println("나는"+model+"다");
		System.out.println("내 주인은: "+owner+"님이야");
		System.out.println("나를 만든 회사는: "+brand);
		System.out.println("내 최고속도는 : "+maxSpeed+"km");
		System.out.println("난 이만큼 달려왔어 : "+km+"km");
		System.out.println("내 색깔은 : "+color);
	}
	}

//String model, String brand, int maxSpeed, int km ,String owner