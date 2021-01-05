package Java12_1;
import java.util.Scanner;

//import java.util.Scanner; 스캐너 사용할때 적는것  열정리 ctrl+shipt+f
public class Cal_sc4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");
		int i = sc.nextInt();
		System.out.println("숫자를 입력하세요.");
		int j = sc.nextInt();
		double i_1 = (double) i;
		double j_1 = (double) j;
		System.out.println("더한값은");
		System.out.println(i + j);
		System.out.println("뺀값은");
		System.out.println(i - j);
		System.out.println("곱한값은");
		System.out.println(i * j);
		System.out.println("나눈값은");
		System.out.println((double) (i_1 / j_1));

	}

}
