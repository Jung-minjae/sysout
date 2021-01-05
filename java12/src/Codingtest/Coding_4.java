package Codingtest;

import java.util.Scanner;

public class Coding_4  {
	static int chanul=1;
	static int volume =0;
	static boolean power = false;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		Remote rm = new Remote();
		boolean run = true;
		while(run) {
		
		System.out.println("1. 채널선택 2. 볼륨조절 3. 전원 버튼");
		int a = sc.nextInt();
		
		switch(a) {
		case 1 :
			 rm.ch(chanul,power);
			break;
		case 2 :
			volume = rm.vol(volume,power);
			
			break;
		case 3 :
			power = !power;
			rm.turnon(power);
			break;
		}
	}
	}

}
