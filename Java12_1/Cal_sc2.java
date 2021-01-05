package Java12_1;
import java.util.Scanner;

public class Cal_sc2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		// 값 3개 받음
		// 앞의 값 두개를 서로 더함
		//뒤에 한개 값을 더한값에서 뺌
		//뺀 값을 5로 나누어 나머지를 구하세요.

		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요.");
		int i = sc.nextInt();
		System.out.println("더할값을 입력하세요.");
		int j = sc.nextInt();
		int Sum = i+j;
		System.out.println("더한값은");
		System.out.println(Sum);
		System.out.println("뺄값을 입력하세요.");
		int k = sc.nextInt();
		int l = Sum-k ;
		
		System.out.println("뺀값은");
		System.out.println(l);
		
		int m = l%5;
		System.out.println("5로 나눈 나머지는");
		System.out.println(m);
		
		
		
		
		
		
	}

}
