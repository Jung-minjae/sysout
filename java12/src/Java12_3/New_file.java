package Java12_3;

import java.util.Scanner;

public class New_file {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
				Scanner sc = new Scanner(System.in)) {
			System.out.println("돈을 거세요.");
			int money = sc.nextInt();
			
			System.out.println("주사위를 굴리시겠습니까?");
			System.out.println("1.Yes, 2.No");
			int c = sc.nextInt();
			

			if(c == 1) {
				System.out.println("주사위를 굴립니다.");

				double dice_1 = Math.random();
				double dice_2 = Math.random();
				int sum = 6;

				int dice_num =(int)(dice_1*sum)+1;
				int dice_num_2 =(int)(dice_2*sum)+1;
				
				System.out.println("주사위1: " +dice_num);
				System.out.println("주사위2: " +dice_num_2);

				if(dice_num ==1 && dice_num_2==1) {
					System.out.println("2배를 받습니다." + (money*2));
				}
				if((dice_num ==2||dice_num ==6) || (dice_num ==2||dice_num_2==6)) {
					System.out.println("4배를 받습니다." + (money*4));
				}
				if(dice_num ==6 && dice_num_2==6) {
					System.out.println("2배를 잃습니다." + money/2);
				} else {System.out.println("본전" + money);
				}
			}
			if(c ==2) {
				System.out.println("주사위를 굴리지 않습니다.");
			}


		}
	}
}
