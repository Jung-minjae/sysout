package Java12_2;
import java.util.Scanner;

public class Iftest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//숫자 2개를 입력받고 둘이 더한값이 홀수인지 짝수인지 구분하여 홀수이면 홀 짝수이면 짝
		
		Scanner sc = new Scanner(System.in);
		System.out.println("값을 입력하세요");
	    int a = sc.nextInt();
	    
		System.out.println("더할 값을 입력하세요");
		int b = sc.nextInt();
		int c = a+b;
		if (c%2==0) {
			System.out.println("더한 값은 짝수입니다");
		}
		//else if (c%2==1) {
			//System.out.println("더한 값은 홀수입니다");
		//}
				
			else {
			System.out.println("더한 값은 홀수입니다");
		}
	}

}
