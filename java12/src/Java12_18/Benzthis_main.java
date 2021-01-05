package Java12_18;

public class Benzthis_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		Benzthis bz1 = new Benzthis("검정색",4000,4);
		System.out.println(bz1.brand);
		System.out.println(bz1.color);
		System.out.println(bz1.cc);
		System.out.println(bz1.door);
		System.out.println();
		Benzthis bz2 = new Benzthis("노란색");
		System.out.println(bz2.brand);
		System.out.println(bz2.color);
		System.out.println(bz2.cc);
		System.out.println(bz2.door);
		System.out.println();
		Benzthis bz3 = new Benzthis("흰색",2000);
		System.out.println(bz3.brand);
		System.out.println(bz3.color);
		System.out.println(bz3.cc);
		System.out.println(bz3.door);
		System.out.println();
		Benzthis bz4 = new Benzthis();
		System.out.println(bz4.brand);
		System.out.println(bz4.color);
		System.out.println(bz4.cc);
		System.out.println(bz4.door);
		
		
	}

}
