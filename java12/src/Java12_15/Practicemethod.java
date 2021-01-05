package Java12_15;

public class Practicemethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 10;
		
		one(i);
	}
	public static void one(int i) {
		i = i+10;
		two(i);
	}
	public static void two(int i) {
		i = i+10;
		int num = three(i);
		four(num);
	}
	public static int three(int i) {
		i = i+10;
		return i;
	}
	public static void four(int num) {
		num = num+10;
		System.out.println(num);
	}
}
