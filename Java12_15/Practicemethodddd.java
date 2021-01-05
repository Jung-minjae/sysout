package Java12_15;
import java.util.Scanner;
import java.util.Random;
public class Practicemethodddd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 스캐너로 숫자 받고, dice 메소드 만들어서 위에 받은 숫자만큼 굴림
		// dice 에서 숫자를 받으면 그 숫자를 가지고 다시 dice_2를 호출해서 굴림
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int a = sc.nextInt();
		
		int dice = dice(a);
		
		int dice_1 = dice2(dice);
		System.out.println(dice_1);
	}

	public static int dice(int a) {
		Random rdm = new Random();
		int dice1 = rdm.nextInt(a);
		return dice1;
	}
	public static int dice2(int dice) {
		Random rdm = new Random();
		int dice2 = rdm.nextInt(dice);
		return dice2;
	}
}
