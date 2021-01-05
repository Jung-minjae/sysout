package Java12_7;

import java.util.Scanner;

public class Car {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean Carsort = true;
		boolean boo = true;
		Scanner sc = new Scanner(System.in);

		int Porchee_v = 10;
		int Porchee_Max_v = 300;
		int Benz_v = 8;
		int Benz_Max_v = 250;

		int Sonata_v = 5;
		int Sonata_Max_v = 200;

		int max = 200;
		int v = 0;
		int run = 5;
		int stop = 5;
		int v_run = 0;
		int v_stop = 0;

		while (Carsort) {
			System.out.println("자동차를 선택해주세요. 1. Porchee 2.Benz 3. Sonata");
			int P1 = sc.nextInt();

			switch (P1) {
			case 1:
				System.out.println("Porchee를 선택하셨습니다");
				System.out.println("속도 : +" + Porchee_v);
				break;
			case 2:
				System.out.println("Benz를 선택하셨습니다");
				System.out.println("속도 : +" + Benz_v);
				break;
			case 3:
				System.out.println("Sonata를 선택하셨습니다");
				System.out.println("속도 : +" + Sonata_v);
				break;
			}

			if (P1 == 1) {

				while (boo) {
					System.out.println("달리시겠습니까? 1. Yes 2.No");
					int P = sc.nextInt();

					switch (P) {

					case 1:
						System.out.println("과속합니다" + "+" + Porchee_v);
						v_run = v + Porchee_v;
						System.out.println("현재속도는:" + v_run);
						if (v_run >= Porchee_Max_v) {
							System.out.println("더 이상 과속할 수 없습니다");

						} else {
							v += Porchee_v;
						}

						break;
					case 2:
						System.out.println("감속합니다" + "-" + Porchee_v);
						v_stop = v - Porchee_v;
						System.out.println("현재속도는:" + v_stop);
						if (v_stop <= 0) {
							System.out.println("차가 멈췄습니다. 더 이상 감속할 수 없습니다");
						} else {
							v -= Porchee_v;
						}
						break;

					default:
						System.out.println("1,2 중에 선택해주세요");
						break;

					}

				}
			} else if (P1 == 2) {
				while (boo) {
					System.out.println("달리시겠습니까? 1. Yes 2.No");
					int P = sc.nextInt();

					switch (P) {

					case 1:
						System.out.println("과속합니다" + "+" + Benz_v);
						v_run = v + run;
						System.out.println("현재속도는:" + v_run);
						if (v_run >= Benz_Max_v) {
							System.out.println("더 이상 과속할 수 없습니다");

						} else {
							v += Benz_v;
						}

						break;
					case 2:
						System.out.println("감속합니다" + "-" + Benz_v);
						v_stop = v - Benz_v;
						System.out.println("현재속도는:" + v_stop);
						if (v_stop <= 0) {
							System.out.println("차가 멈췄습니다. 더 이상 감속할 수 없습니다");
						} else {
							v -= Benz_v;
						}
						break;

					default:
						System.out.println("1,2 중에 선택해주세요");
						break;
					}

				}

			}

			else if (P1 == 3) {
				while (boo) {
					System.out.println("달리시겠습니까? 1. Yes 2.No");
					int P = sc.nextInt();

					switch (P) {

					case 1:
						System.out.println("과속합니다" + "+" + run);
						v_run = v + run;
						System.out.println("현재속도는:" + v_run);
						if (v_run >= max) {
							System.out.println("더 이상 과속할 수 없습니다");

						} else {
							v += run;
						}

						break;
					case 2:
						System.out.println("감속합니다" + "-" + stop);
						v_stop = v - stop;
						System.out.println("현재속도는:" + v_stop);
						if (v_stop <= 0) {
							System.out.println("차가 멈췄습니다. 더 이상 감속할 수 없습니다");
						} else {
							v -= stop;
						}
						break;

					default:
						System.out.println("1,2 중에 선택해주세요");
						break;

					}
				}
			}
		}
	}
}

//System.out.println("다시 고르시겠습니까? 1. Yes 2.No");
//int P2 = sc.nextInt();
//if (P2 == 1) {
//	Carsort = true;
//}
//if (P2 == 2) {
//	Carsort = false;
//}

//		while (boo) {
//			System.out.println("달리시겠습니까? 1. Yes 2.No");
//			int P = sc.nextInt();
//
//			switch (P) {
//
//			case 1:
//				System.out.println("과속합니다" + "+" + run);
//				v_run = v + run;
//				System.out.println("현재속도는:" + v_run);
//				if (v_run >= max) {
//					System.out.println("더 이상 과속할 수 없습니다");
//
//				} else {
//					v += run;
//				}
//
//				break;
//			case 2:
//				System.out.println("감속합니다" + "-" + stop);
//				v_stop = v - stop;
//				System.out.println("현재속도는:" + v_stop);
//				if (v_stop <= 0) {
//					System.out.println("차가 멈췄습니다. 더 이상 감속할 수 없습니다");
//				} else {
//					v -= stop;
//				}
//				break;
//
//			default:
//				System.out.println("1,2 중에 선택해주세요");
//				break;
//
//			}
//
//		}
