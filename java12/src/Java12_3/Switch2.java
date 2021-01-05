package Java12_3;
import java.util.Scanner;
public class Switch2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 돈을 건다. 주사위 2개 굴림
		// 주사위가 1 1 이 나오면 2배받음
		// 주사위가 2 6 이 나오면 4배 받음
		// 주사위가 6 6 이 나오면 2배 손해
		// 그 외는 본전
		Scanner sc = new Scanner(System.in);
		
		System.out.println("배팅 게임을 시작합니다");
		System.out.println("캐릭터를 선택해주세요");
		System.out.println("1.변호사(1000만원),2.조폭(500만원),3.백수(50만원)");
		int cha = sc.nextInt();
		int mon1 = 0;
		switch(cha) {
		case 1 :  
		System.out.println("변호사를 선택하셨습니다 + 10000000");
		 mon1 = 10000000;
		 break;
		case 2 :  
			System.out.println("조폭을 선택하셨습니다 + 5000000");
			mon1 = 5000000;
			break;
		case 3 :  
			System.out.println("백수를 선택하셨습니다 + 500000");
			mon1 = 500000;
			break;
		}
		
		
		System.out.println("배팅을 시작합니다");
		System.out.println("배팅할 금액을 입력하세요");
		
		int Mon = sc.nextInt();
		
		System.out.println(Mon+"원 걸었습니다.");
		System.out.println("2개의 주사위를 던집니다");
		double dice1 = Math.random();
		double dice2 = Math.random();
		
		int dice1_1 =(int)(dice1*6)+1;
		int dice2_1 =(int)(dice2*6)+1;
		
		System.out.println("첫번째 주사위는"+dice1_1+"입니다");
		System.out.println("두번째 주사위는"+dice2_1+"입니다");
		if (dice1_1==1 && dice2_1 ==1 ) {
			System.out.println(mon1+(Mon*2) + " 축하합니다 두배 따셨습니다");
			
		}
		if (dice1_1==2 && dice2_1==6) {
			System.out.println(mon1+Mon*4+" 축하합니다 네배 따셨습니다");
		}
		if (dice1_1==6 &&dice2_1==6) {
			System.out.println(mon1+Mon/2+" 아쉽지만 2배 잃으셨습니다");
		}
				
		else {
			System.out.println(Mon+"본전 입니다");
			
		}
		
		
		
		
		
		
		
		
		
	}

}
