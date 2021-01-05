package Javatest;
import java.util.Scanner;
public class Cloudstudy5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 시급과 일한 시간을 입력받아 총 급여를 계산하는 프로그램을 만들어주세요
		
		Scanner sc = new Scanner(System.in);
		System.out.println("시급을 입력하세요");
		int timeprice = sc.nextInt();  //시급
		System.out.println("일한 시간을 입력하세요");
		int whattime = sc.nextInt();  //일한 시간
		
		int pay = timeprice*whattime;
		System.out.println(pay);
	}

}
