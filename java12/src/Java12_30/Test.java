package Java12_30;
import java.util.Random;
import java.util.Scanner;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random rdm = new Random();
		Scanner sc = new Scanner(System.in);
		boolean run = true;
//		int rock = 1;
//		int scissors = 2;
//		int paper = 3;
		
		String person1 = "철수";
		String person2 = "민수";
		
		String chulsu ="";
		String minsu ="";
				
		
		int chulsu_rdm ;
		int minsu_rdm ;
		
		
		int chulsu_money = 3000;
		int minsu_money = 3000;
		
		
		int win = 500 ;
		int lose = -500 ;
		
		System.out.println("철수,민수가 가위바위보를 합니다.");
		System.out.println("이긴사람은 진사람한테서 500원을 받습니다.");
		
		while(run) {
		chulsu_rdm = rdm.nextInt(3)+1;
		minsu_rdm = rdm.nextInt(3)+1;
		System.out.println("가위~~~바위~~~~보!");
		
		switch(chulsu_rdm) {
		case 1 : chulsu = "묵";
		break;
		case 2 : chulsu = "찌";
		break;
		case 3 : chulsu = "빠";
		break;
		}
		switch(minsu_rdm) {
		case 1 : minsu = "묵";
		break;
		case 2 : minsu = "찌";
		break;
		case 3 : minsu = "빠";
		break;
		}
	
		System.out.println("철수 : "+chulsu+" vs 민수 : "+minsu);
	
		if(chulsu_rdm==1&&minsu_rdm==1||chulsu_rdm==2&&minsu_rdm==2||chulsu_rdm==3&&minsu_rdm==3) {
			System.out.println("철수,민수 : 에잇 비겼네 다시");
		}
		else if(chulsu_rdm==1&&minsu_rdm==2||chulsu_rdm==2&&minsu_rdm==3||chulsu_rdm==3&&minsu_rdm==1) {
			System.out.println("철수 : 아싸 이겼다~ 500원 내놔");
			chulsu_money+=win;
		}
		else if(chulsu_rdm==1&&minsu_rdm==3||chulsu_rdm==2&&minsu_rdm==1||chulsu_rdm==3&&minsu_rdm==2) {
			System.out.println("민수 : 아싸 이겼다~ 500원 개꿀");
			chulsu_money-=win;
			
		}
	 
		if(chulsu_money==0) {
			System.out.println("민수 : 철수야 돈이 다 떨어졌네 빨리 충전해온나");
			System.out.println("철수 : 딱 기다리라");
			System.out.println("ATM기로 가시겠습니까? 1. Yes 2.No");
			int p = sc.nextInt();
			switch(p) {
			case 1 : 
				
				break;
			case 2 : 
				System.out.println("도망간다");
				run = !run;
				break;
			}
		}
		if(minsu_money==0) {
			System.out.println("철수 : 머하노 돈안뽑아오고");
			System.out.println("민수 : 지금 간다이가");
			
		}
	}
}
}
