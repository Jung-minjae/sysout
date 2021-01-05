package Java12_14;

public class Practicemethod6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 10;
		int j = 20;
		int k = 30;
		int m = 40;
		
		int bani = ban(i);
		System.out.println(bani);
		int banj = banj(j);
		System.out.println(banj);
		int bank = banj(k);
		System.out.println(bank);
		int banm = banj(m);
		System.out.println(banm);
	}
	public static int ban(int i) {
		i = i/2;
		return i;
	}
	public static int banj(int j) {
		j = j/2;
		return j;
	}
	public static int bank(int k) {
		k = k/2;
		return k;
	}
	public static int banm(int m) {
		m = m/2;
		return m;
	}
}
