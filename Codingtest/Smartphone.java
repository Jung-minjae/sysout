package Codingtest;

public class Smartphone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner_phone sp = new Scanner_phone();

		int ch = sp.scan();
		switch (ch) {
		case 1:
			sp.telelist();
			break;
		case 2:
			int ch1 = sp.callscan();
			sp.call(ch1);

			break;
		case 3:
			sp.nowtime();
			break;
		case 4:
			sp.search();
			break;
		}
	}
}
