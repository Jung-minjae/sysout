package Codingtest;
import java.util.Scanner;
public class Remote  {

	
	public void ch(int chanul, boolean power) {
		Scanner sc = new Scanner(System.in);
		if(power==false) {
			System.out.println("TV 전원이 꺼져있습니다");
		}
		else {
		System.out.println("채널번호를 선택해주세요");
		 chanul = sc.nextInt();
		 System.out.println(chanul+"채널로 이동되었습니다.");
		 
		}
	}
	
	public int vol(int volume , boolean power) {
		Scanner sc = new Scanner(System.in);
		if(power == false) {
			System.out.println("TV 전원이 꺼져있습니다");
		}
		else {
		System.out.println("볼륨선택입니다 1. + 2. -");
		int a = sc.nextInt();
		switch(a) {
		case 1:
			System.out.println("볼륨이 올라갔습니다");
			volume += 1;
			if(volume>=40) {
				System.out.println("더이상 볼륨을 올릴 수 없습니다.");
				volume=40;
				
			}
			else {
				System.out.println("현재볼륨은 : "+volume+"입니다");
			}
			break;
		case 2:
			System.out.println("볼륨이 내려갔습니다");
			volume -= 1;
			if(volume==0) {
				System.out.println("더이상 볼륨을 내릴 수 없습니다.");
				volume=0;
			}
			else {
				System.out.println("현재볼륨은 : "+volume+"입니다");
			}
			
			break;
		}
		}
		return volume;
		
	}
	
	public void turnon(boolean power) {
		if(power == true) {
		System.out.println("TV가 켜졌습니다");
	}
		else {
			System.out.println("TV가 꺼졌습니다");
		}
	}
}
