package Java12_1;
import java.util.Scanner;

public class Cal_sc1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");
		int i = sc.nextInt();
		System.out.println("곱할값을 입력하세요.");
		int j = sc.nextInt();
		System.out.println("곱한값은");
		System.out.println(i*j);
		System.out.println("숫자를 입력하세요.");
		double k = sc.nextDouble();
				double i_1 = i*j;
	    double k_1 =(double) k/i_1*100;
	    System.out.println((int)k_1+"%입니다");
		
				
		

	}

}
