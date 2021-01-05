package Java12_3;
import java.util.Scanner;
public class Ifpractice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 책 184p 예제 11
		Scanner sc = new Scanner(System.in);
		
//		System.out.println("첫번째 숫자를 입력하세요");
//		int a = sc.nextInt();
//		System.out.println("계산할 연산자를 입력하세요. ( + , - , * , / )");
//		String c = sc.next();
//		System.out.println("두번째 숫자를 입력하세요");
//		int b = sc.nextInt();
		
//		if (c.equals("+")) {
//			System.out.println(a+b);
//		}
//		if (c.equals("-")) {
//			System.out.println(a-b);
//		}
//		if (c.equals("*")) {
//			System.out.println(a*b);
//		}
//		if (c.equals("/")) {
//			System.out.println(a/b);
//		}
		System.out.println("1~9까지중");
		System.out.println("첫번째 숫자를 입력하세요");
		int a = sc.nextInt();
		
		System.out.println("계산할 연산자를 입력하세요. ( + , - , * , / )");
		String c = sc.next();
//		if (c.equals("+")||c.equals("-")||c.equals("*")||c.equals("/")) {
//			
//		}
//		else {
//			System.out.println("다시 입력해주세요");
//		}
		System.out.println("두번째 숫자를 입력하세요");
		int b = sc.nextInt();
		if(a>9 && b>9) {
		System.out.println("9보다 큰 숫자가 들어갔네");
		System.out.println("이번 한번만 계산해준다");
		}
		double d = (double)a;
		double e = (double)b;
		
		switch(c) {
		case "+" :  System.out.println(a+b);
		break;
		case "-" :  System.out.println(a-b);
	    break;
	    case "*" :  System.out.println(a*b);
	    break;
	    case "/" :  
	    	 	    System.out.println(d/e);
	    break;
		
	    default :
	    	System.out.println("계산 할 수 없는 연산자입니다");
	    	System.out.println("다시 입력해주세요");
	    	
//	    	int f = sc.nextInt();
//			System.out.println("계산할 연산자를 입력하세요. ( + , - , * , / )");
//			String g = sc.next();
//			System.out.println("두번째 숫자를 입력하세요");
//			int h = sc.nextInt();
//			double i = (double)f;
//			double j = (double)h;
//			
//			switch(g) {
//			case "+" :  System.out.println(f+h);
//			break;
//			case "-" :  System.out.println(f-h);
//		    break;
//		    case "*" :  System.out.println(f*h);
//		    break;
//		    case "/" :  
//		    	 	    System.out.println(i/j);
//		    break;
//	    
//		}
		
		
		}
		
	}

}
