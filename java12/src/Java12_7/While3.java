package Java12_7;
import java.util.Scanner;
public class While3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean run = true;
		
		Scanner sc = new Scanner(System.in);
		
		while(run) {
		
		System.out.println("사용할 연산자를 입력해주세요.");
		String s = sc.next();
		
		System.out.println("숫자를 입력하세요");
		int a = sc.nextInt();
		System.out.println("계산할 숫자를 입력하세요");
		int b = sc.nextInt();
		
		switch(s) {
		case "+" : System.out.println(a+b);
		break;
		case "-" : System.out.println(a-b);
		break;
		case "*" : System.out.println(a*b);
		break;
		}
		if (s.equals("/")) {
			double c = a;
			double d = b;
			System.out.println(c/d);
			
		}
		
		
		}
		
		
		
		
		}
		
	}


