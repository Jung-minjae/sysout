package Java12_2;
import java.util.Scanner;

public class Iftest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 스캐너에서 숫자를 받고 100이 넘으면 너무많아요, 100보다 작으면 적당해요, 50보다 작으면 너무작아요
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int a = sc.nextInt();
		
	
		if(a>100) {
			System.out.println("너무 많아요");
		}

		else if (a>50 && a<=100) {
			System.out.println("적당해요");
		}
		
		else {
			System.out.println("너무 작아요");
			
			
			
			
		}
		
	}
	

}
