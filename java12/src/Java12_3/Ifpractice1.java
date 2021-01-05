package Java12_3;

import java.util.Scanner;

public class Ifpractice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("직업을 선택하세요");
		System.out.println("1. Hero(능력치10), 2. Esper(능력치8), 3. Viper(능력치6)");
		String job1 = "Hero";
		String job2 = "Esper";
		String job3 = "Viper";
		int Hstr = 5;
		int Estr = 4;
		int Vstr = 3;
		int job = sc.nextInt();
		switch(job) {
		case 1 : 
			System.out.println("Hero를 선택하셨습니다.");
			System.out.println("능력치의 반이 데미지에 추가됩니다");
			break;
		
	    case 2 : 
		    System.out.println("Esper를 선택하셨습니다.");
		    System.out.println("능력치의 반이 데미지에 추가됩니다");
		    break;
		    
	    case 3 : 
		    System.out.println("Viper를 선택하셨습니다.");
		    System.out.println("능력치의 반이 데미지에 추가됩니다");
		    break;
	}
		
		
		System.out.println("무기를 선택하세요");
		System.out.println("1. Sword, 2. Axe, 3. Hammer");
		String wepon = "";
		int damage = 0;
		int wepon_num = sc.nextInt();
		int Monster_hp = 100;
		int Sd = 12;
		int Ad = 11;
		int Hd = 10;
		int Poison = 2;
		
		int up1 = Sd + Poison;
		int up2 = Ad + Poison;
		int up3 = Hd + Poison;

		String m = "Monster_hp";
		String a = "Sword";
		String b = "Axe";
		String c = "Hammer";

//		System.out.println(a);
//		System.out.println(b);
//		System.out.println(c);

		
		
		
		switch(wepon_num){
		case 1 :
			wepon = a;	
			damage = Sd;
			System.out.println("Sword를 선택하셨습니다(데미지 12+5)");
			break;
		case 2 :
			wepon = b;	
			damage = Ad;
			System.out.println("Axe를 선택하셨습니다(데미지11+4)");
			break;
		case 3 :	
			wepon = c;	
			damage = Hd;
			System.out.println("Hammer를 선택하셨습니다(데미지10+3)");
			break;
		}
		
//		String wepon1 = sc.next();
//
//		if (wepon.equals(a)) {
//			System.out.println("Sword를 선택하셨습니다(데미지12)");
//		}
//		if (wepon.equals(b)) {
//			System.out.println("Axe를 선택하셨습니다(데이지11)");
//		}
//		if (wepon.equals(c)) {
//			System.out.println("Hammer를 선택하셨습니다(데미지10)");
//		}

		
		System.out.println("몬스터가 나타났습니다");
		System.out.println(m + Monster_hp);
		System.out.println("공격하시겠습니까?");
		System.out.println("Yes or No");

		String text = sc.next();

		if (text.equals("Yes")) {
			System.out.println("공격을 성공하셨습니다");
			if (wepon.equals(a)) {
				System.out.println(m + (Monster_hp - Sd - Hstr));
				System.out.println("다시 공격하시겠습니까");
				System.out.println("Yes or No");
				String text1 = sc.next();
				if (text1.equals("Yes")) {

					double dice = Math.random();
					int dice_1 = ((int) (dice * 6)) + 1;
					if (dice_1 > 3) {
						System.out.println("공격을 성공하셨습니다");
						System.out.println(m + (Monster_hp - Sd - Sd - Hstr));
					} else {
						System.out.println("공격에 실패하셨습니다");
					}
					System.out.println("무기 강화가 필요합니다");
					System.out.println("Yes or No");
					String text2 = sc.next();
					if (text2.equals("Yes")) {
						double dice2 = Math.random();
						int dice2_1 = (int) (dice2 * 10) + 1;
						if (dice2_1 > 3) {
							System.out.println("무기 강화를 성공하셨습니다");
						} else {
							System.out.println("무기 강화에 실패하셨습니다");
						}
					} else {
						System.out.println("강화를 진행하지 않습니다");
					}

					System.out.println("다시 공격하시겠습니까");
					System.out.println("Yes or No");
					String text3 = sc.next();
					if (text3.equals("Yes")) {
						System.out.println(m + (Monster_hp - Sd - Sd - up1- Hstr));
					} else {
						System.out.println("도망갑니다");
					}
				}
			}
			if (wepon.equals(b)) {
				System.out.println(m + (Monster_hp - Ad - Hstr));
				System.out.println("다시 공격하시겠습니까");
				System.out.println("Yes or No");
				String text1 = sc.next();
				if (text1.equals("Yes")) {

					double dice = Math.random();
					int dice_1 = ((int) (dice * 6)) + 1;
					if (dice_1 > 3) {
						System.out.println("공격을 성공하셨습니다");
						System.out.println(m + (Monster_hp - Ad - Ad - Hstr));
					} else {
						System.out.println("공격에 실패하셨습니다");
					}
					System.out.println("무기 강화가 필요합니다");
					System.out.println("Yes or No");
					String text2 = sc.next();
					if (text2.equals("Yes")) {
						double dice2 = Math.random();
						int dice2_1 = (int) (dice2 * 10) + 1;
						if (dice2_1 > 3) {
							System.out.println("무기 강화를 성공하셨습니다");
						} else {
							System.out.println("무기 강화에 실패하셨습니다");
						}
					} else {
						System.out.println("강화를 진행하지 않습니다");
					}

					System.out.println("다시 공격하시겠습니까");
					System.out.println("Yes or No");
					String text3 = sc.next();
					if (text3.equals("Yes")) {
						System.out.println(m + (Monster_hp - Ad - Ad - up2 - Hstr));
					} else {
						System.out.println("도망갑니다");
					}
				}
			}
			if (wepon.equals(c)) {
				System.out.println(m + (Monster_hp - Hd - Hstr));
				System.out.println("다시 공격하시겠습니까");
				System.out.println("Yes or No");
				String text1 = sc.next();
				if (text1.equals("Yes")) {

					double dice = Math.random();
					int dice_1 = ((int) (dice * 6)) + 1;
					if (dice_1 > 3) {
						System.out.println("공격을 성공하셨습니다");
						System.out.println(m + (Monster_hp - Hd - Hd -Hstr));
					} else {
						System.out.println("공격에 실패하셨습니다");
					}
					System.out.println("무기 강화가 필요합니다");
					System.out.println("Yes or No");
					String text2 = sc.next();
					if (text2.equals("Yes")) {
						double dice2 = Math.random();
						int dice2_1 = (int) (dice2 * 10) + 1;
						if (dice2_1 > 3) {
							System.out.println("무기 강화를 성공하셨습니다");
						} else {
							System.out.println("무기 강화에 실패하셨습니다");
						}
					} else {
						System.out.println("강화를 진행하지 않습니다");
					}

					System.out.println("다시 공격하시겠습니까");
					System.out.println("Yes or No");
					String text3 = sc.next();
					if (text3.equals("Yes")) {
						System.out.println(m + (Monster_hp - Hd - Hd - up3 - Hstr));
					} else {
						System.out.println("도망갑니다");
					}
				}

			}
		}

//		System.out.println("무기 강화가 필요합니다");
//		System.out.println("Yes or No");
//		String text2 = sc.next();
//		if (text2.equals("Yes")) {
//			double dice2 = Math.random();
//			int dice2_1 = (int) (dice2 * 10) + 1;
//			if (dice2_1 > 3) {
//				System.out.println("무기 강화를 성공하셨습니다");
//			} else {
//				System.out.println("무기 강화에 실패하셨습니다");
//			}
//		} else {
//			System.out.println("강화를 진행하지 않습니다");
//		}
//
//		System.out.println("다시 공격하시겠습니까");
//		System.out.println("Yes or No");
//		String text3 = sc.next();
//		if (text3.equals("Yes")) {
//			System.out.println(m + (Monster_hp - Sd - Sd - up1));
//		} else {
//			System.out.println("도망갑니다");
//		}

	}
}
