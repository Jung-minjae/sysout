package Java12_2;
import java.util.Scanner;
public class Iftest8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 책 p.158 예제 10번
		
		Scanner sc = new Scanner(System.in);
		System.out.println("연도를 입력하세요");
		int a = sc.nextInt();
		if(a%4 == 0 && a%100 != 0||a%400==0) {
			System.out.println("윤년입니다");
		}
		else {
			System.out.println("윤년이 아닙니다");
		}
		
	}

}
