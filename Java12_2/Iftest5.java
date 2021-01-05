package Java12_2;

import java.util.Scanner;

public class Iftest5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("주사위를 골라주세요");
		int num = sc.nextInt();
		double dice = Math.random();  //0.0<Math>1.0
		//System.out.println(dice);
		System.out.println(num+"면체 주사위를 굴립니다.");
		
		
		int dice_num = (int)(dice*6)+1;	
		if(dice_num>num) {
		System.out.println("주사위 값은:"+(dice_num-1));
		}
		else {
			System.out.println("주사위 값은"+dice_num);
		}
		
		
	}

}
