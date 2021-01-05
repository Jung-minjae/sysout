package Codingtest;
import java.util.Scanner;
public class ATM {

	
	public int output(int tongjang) {
		Scanner sc = new Scanner(System.in);
		System.out.println("얼마를 뽑으시겠습니까?");
		int a = sc.nextInt();
		System.out.println(a+"원을 출금합니다");
		if(tongjang<a) {
			System.out.println("출금금액이 잔액보다 많아 출금할 수 없습니다");
			
		}
		else {
			 tongjang = tongjang - a;
		}
		return tongjang;
	}
}
