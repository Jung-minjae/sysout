package Java12_14;

public class Practicemethod8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 10;
		int j = 20;
		int hap = plus(i,j);
		System.out.println(hap);
	}
	public static int plus(int i, int j) {
		int sum = 0;
		sum = i+j;
		int min = min(sum,-5);
		sum = min;
		return sum;
	}
	public static int min(int sum,int i) {
		
		sum = sum+i;
		return sum;
	}
}
