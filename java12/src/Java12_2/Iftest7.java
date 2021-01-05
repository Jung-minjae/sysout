package Java12_2;
import java.util.Scanner;
public class Iftest7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 책 P.157 예제9번
		Scanner sc = new Scanner(System.in);
		System.out.println("금액을 입력하세요");
		int Don = sc.nextInt();
		int a = 500;   //500원짜리 
		int b = 100;   //100원짜리
		int c = 50;    //50원짜리
		int d = 10;    //10원짜리
		
		int a_1 = Don / a;  // 돈에 500원 나눈거 
		int a_1_1 = Don % a; //돈에 500원 나눈 나머지금액
		
		int b_1 = a_1_1 / b; //돈을 500원으로 나눈 나머지를 100원으로 나눈것
		int b_1_1=a_1_1 % b;          //돈을 500원으로 나눈 나머지를 100원으로 나눈것의 나머지
		
		int c_1 = b_1_1/c ;
		int c_1_1 = b_1_1%c ;
		
		int d_1 = c_1_1 / d;
		int d_1_1 = c_1_1 % d;
						
		System.out.println("500원짜리"+a_1+"개");
		System.out.println("100원짜리"+b_1+"개");
		System.out.println("50원짜리"+c_1+"개");
		System.out.println("10원짜리"+d_1+"개");
		
		
	}

}
