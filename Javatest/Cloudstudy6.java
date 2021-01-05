package Javatest;
import java.util.Scanner;
public class Cloudstudy6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// N유로 M달러를 입력받아 원화로 환전한 결과를 출력해주세요. 환전 결과는 아래의 환율에 따라 결정되며, 소수점 이하의 자리수는 버립니다.
		//		•1 유로 = 1320.48026 원
		//		•1 달러 = 1063.82979 원

		Scanner sc = new Scanner(System.in);
		
		System.out.println("몇 유로를 환전하시겠습니까");
		int euro = sc.nextInt();
		System.out.println("몇 달러를 환전하시겠습니까");
		int dollar = sc.nextInt();
		
		double eurRate = 1320.48026;
        double dallarRate = 1063.82979;
        
        int won = (int)((euro * eurRate) + (dollar * dallarRate));
        System.out.println(won +" 원 입니다");


	}

}
