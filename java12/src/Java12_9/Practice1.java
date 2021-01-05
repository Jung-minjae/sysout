package Java12_9;
import java.util.Scanner;
public class Practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		while(run) {
		System.out.println("숫자를 입력하세요");
		int a = sc.nextInt();
		System.out.println("두번째 숫자를 입력하세요");
		int b = sc.nextInt();
		
		
		int c = a*b;
		if(c%2==0) {
			System.out.println("짝수값만 출력합니다");
			System.out.println(c);
		}

		else {
			System.out.println("홀수입니다.");
		}
	}
	}
}
