package Java12_9;
import java.util.Scanner;
public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("문자열을 입력하세요");
		String a = sc.nextLine();
		System.out.println("비교할 문자열을 입력하세요");
		String b = sc.nextLine();
		
		if(a.equals(b)) {
			System.out.println("a와b는 같습니다.");
		}
		else {
			System.out.println("a와b는 다릅니다");
		}
	}

}
