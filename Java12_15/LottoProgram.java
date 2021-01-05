package Java12_15;
import java.util.Random;
public class LottoProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random rdm = new Random();
		int num = 0;
		int number[] = new int[6];
		for (int i = 0; i < 6; i++) {
			num = rdm.nextInt(44) + 1;
			boolean compare = Compare(number, num, i);
			if (compare == true) {
				i = i - 1;
				System.out.println("다시 뽑습니다.");
				continue;
			} else {
				number[i] = num;
			}
		}
		for (int k : number) {
			System.out.println(k);
		}
	}

	public static boolean Compare(int[] number, int num, int cnt) {
		boolean com = false;
		for (int i = 0; i <= cnt; i++) {
			if (number[i] == num) {
				com = true;
				break;
			}
		}
		return com;
	}
}