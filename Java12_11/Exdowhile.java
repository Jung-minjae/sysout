package Java12_11;
import java.util.Scanner;
public class Exdowhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				Scanner sc = new Scanner(System.in);
		int i= 0;
		int a = 0;
		do {
			System.out.println("숫자고르기");
			i = sc.nextInt();
		}
		while(a > i);
		System.out.println(i);
		a++;
	}

}
