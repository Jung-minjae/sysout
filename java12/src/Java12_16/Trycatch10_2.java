package Java12_16;

public class Trycatch10_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] aa = new int[3];
		try {
			aa[2] = 100/0;
			aa[3] = 100;
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		finally {
			System.out.println("이 부분은 무조건 나와요");
		}
	}

}
