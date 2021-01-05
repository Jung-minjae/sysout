package Java12_2;

import java.util.Scanner;

public class Iftest6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 주사위를 2개로 늘려서 만들기

		Scanner sc = new Scanner(System.in);
		System.out.println("1~10면체의 주사위가 있습니다");
		System.out.println("첫번째 주사위를 골라주세요");
		int a = sc.nextInt();
		double dice1 = Math.random();
		System.out.println(a+"면체 주사위를 고르셨습니다");

		System.out.println("두번째 주사위를 골라주세요");
		int b = sc.nextInt();
		double dice2 = Math.random();
		System.out.println(b+"면체 주사위를 고르셨습니다");
		
        int dice_1 = (int)(dice1*a)+1;
		int dice_2 = (int)(dice2*b)+1;
		if(dice_1>a){
		dice_1= dice_1-1;
		}
		if(dice_2>b){
		dice_2=dice_2-1;
		}
		System.out.println("첫번째 주사위 값은"+dice_1);
		System.out.println("두번째 주사위 값은"+dice_2);
		int sum = 0;
		sum= dice_1+dice_2;
		System.out.println("주사위합은"+sum);
		
		if (sum<3) {
			System.out.println("ㅋㅋㅋㅋ");
		}
		if (sum<6) {
			System.out.println("ㅎㅎㅎㅎ");
		}
		if (sum<9) {
			System.out.println("오오오오");
		}
		if (sum<13) {
			System.out.println("굿굿굿굿");
		}			
		
		
		
		
		/*Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 주사위를 골라주세요");
		int num_1 = sc.nextInt(); // 첫번째 주사위 면체 정하기
		double dice_1 = Math.random();
		System.out.println("두번째 주사위를 골라주세요");
		int num_2 = sc.nextInt(); // 두번째 주사위 면체 정하기
		double dice_2 = Math.random();
		System.out.println(num_1 + "면체 주사위를 굴립니다.");
		System.out.println(num_2 + "면체 주사위를 굴립니다.");
		int sum = 0;
		// double dice_1 = Math.random(); //첫번째 주사위의 값 0.0~1.0 사이의 실수
		// double dice_2 = Math.random(); //두번째 주사위의 값 0.0~1.0 사이의 실수

		int dice_num_1 = (int) (dice_1 * num_1) + 1; // 0.0*6이 나오는 경우 0 값이 나올 수 있으므로 1을 더해준다
		int dice_num_2 = (int) (dice_2 * num_2) + 1;

		if (dice_num_1 > num_1 || dice_num_2 > num_2) { // 1.0이 나왔을 경우 1.0*6 +1 이면 7이 나오므로
			// System.out.println("주사위값은:"+(dice_num_1 -1)); //-1을 해준다
			// System.out.println("주사위값은:"+(dice_num_2 -1));
			dice_num_1 = dice_num_1 - 1;
			dice_num_2 = dice_num_2 - 1;
			System.out.println("첫번째 주사위 값은" + dice_num_1);
			System.out.println("첫번째 주사위 값은" + dice_num_2);
			sum = dice_num_1 + dice_num_2;
		} else {
			// System.out.println("주사위값은:"+(dice_num_1));
			// System.out.println("주사위값은:"+(dice_num_2));
			sum = dice_num_1 + dice_num_2;
			System.out.println("첫번째 주사위 값은" + dice_num_1);
			System.out.println("첫번째 주사위 값은" + dice_num_2);
		}
		System.out.println(sum + "이나왔습니다");

		if (sum == 2) {
			System.out.println("부산으로 가세요");

		}
		if (sum == 3 || sum == 4) {
			System.out.println("울산으로 가세요");
		}
		if (sum == 5 || sum == 6) {
			System.out.println("대구으로 가세요");
		}
		if (sum == 7 || sum == 8) {
			System.out.println("대전으로 가세요");
		}
		if (sum == 9 || sum == 10) {
			System.out.println("주사위 한개를 다시 굴립니다");
			double dice_3 = Math.random();
			int dice_num_3 = (int) (dice_1 * num_1) + 1;
			System.out.println(dice_num_3+"이 나왔습니다");
			System.out.println(sum-dice_num_3);
		}
		if (sum > 10) {
			System.out.println("서울로 가세요");
		}
*/
	}

}
