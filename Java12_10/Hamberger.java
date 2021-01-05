package Java12_10;

import java.util.Scanner;

public class Hamberger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 햄버거주문 1,2,3,4 중에 한개구현
		boolean re = true;
		boolean re1 = true;
		int price[] = new int[10];
		Scanner sc = new Scanner(System.in);
		String berger[] = { "새우버거", "불고기버거", "치즈버거", "에그불고기버거" };

		String berger_1[] = new String[5];
		while (re) {
			System.out.println("1.세트메뉴 2.버거 3.사이드메뉴 4.음료");
			int p = sc.nextInt();
			switch (p) {

			case 1:
				System.out.println("세트메뉴를 선택하셨습니다");
				break;
			case 2:
				System.out.println("버거 단품을 선택하셨습니다");
				
				while (re1) {
					int i = 0;
					System.out.println("주문하실 제품을 선택해주세요.\n 1. 새우버거 2. 불고기버거 3. 치즈버거 4. 에그불고기버거");
					int p1 = sc.nextInt();
					String menumain[] = new String[10];

					switch (p1) {

					case 1:
						System.out.println(berger[p1 - 1]);
						price[p1 - 1] = 3000;
						System.out.println(price[p1 - 1]);
						menumain[i] = berger[p1 - 1].toString();
						i++;
						break;
					case 2:
						System.out.println(berger[p1 - 1]);
						price[p1 - 1] = 3500;
						System.out.println(price[p1 - 1]);
						menumain[i] = berger[p1 - 1].toString();
						i++;
						break;
					case 3:
						System.out.println(berger[p1 - 1]);
						price[p1 - 1] = 4000;
						System.out.println(price[p1 - 1]);
						menumain[i] = berger[p1 - 1].toString();
						i++;
						break;
					case 4:
						System.out.println(berger[p1 - 1]);
						price[p1 - 1] = 4500;
						System.out.println(price[p1 - 1]);
						menumain[i] = berger[p1 - 1].toString();
						i++;
						break;
					}
					System.out.println("더 주문하시겠습니까\n 1.예 2.아니오");
					int p2 = sc.nextInt();
					if (p2 == 1) {
						
					} else {

					for (String a : menumain) {
						System.out.println(a);
				}
//					for (int j = 0; j<i; j++) {
//							System.out.println(menumain[j]);
//						}

						re1 = !re1;
					}
				}

				break;
			case 3:
				System.out.println("사이드메뉴를 선택하셨습니다");
				break;
			case 4:
				System.out.println("음료를 선택하셨습니다");
				break;
			}
		}

	}

}

		
//{"새우버거","불고기버거","치즈버거","에그불고기버거"};
//for(int i = p1-1;;) {
//
//System.out.println(berger[i]+"를 선택하셨습니다");
//
//berger_1[i] +=berger[i];
//System.out.println("주문하신 제품은"+berger_1[i]);
//System.out.println("더 주문하시겠습니까?\n1. 예  2. 아니오");
//int p2 = sc.nextInt();
//	if (p2==1) {
//		break;
//	}
