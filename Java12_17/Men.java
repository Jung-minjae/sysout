package Java12_17;
import java.util.Scanner;
public class Men {
static	int money = 20000;
static	String Bow = "안녕하세요";
static	String Bow2 = "안녕히가세요";
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Men men = new Men();
	men.in();	
	
	Buggerking bgk = new Buggerking();
	System.out.println("버거를 선택해주세요");
	System.out.println("1. 1번버거, 2. 2번버거 선택");
	int choice = sc.nextInt();
	money = bgk.fee(money, choice);
	System.out.println(money);
		}
	
	
	public static void in () {
		System.out.println("안녕하세요");
	}
	public static void out () {
		System.out.println("안녕히가세요");
	}

}
