package Java12_2;
import java.util.Scanner;

public class Iftest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 숫자 3개를 받는다 앞의 2개 숫자의 곱이 홀수이면 곱셈값을 출력하고 짝수이면 뒤의 3번째 숫자를 나눈값을 출력
		Scanner sc = new Scanner(System.in);
		System.out.println("값을 입력하세요");
		int a = sc.nextInt();
		System.out.println("값을 입력하세요");
		int b = sc.nextInt();
		int c = a*b;
		System.out.println("값을 입력하세요");
		int d = sc.nextInt();
				
						
		if (c%2==1) {
			System.out.println("곱한값은");
			System.out.println(c);
		}
		else if (c%2==0) {
			System.out.println("나눈값은");
			System.out.println(c/d);
		}
	

	
				
	}

}
