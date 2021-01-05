package Java12_2;
import java.util.Scanner;  //scanner 불러오는 것

public class Test {  

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);  //스캐너를 s라고 부를거고 s한테 시킬거다
		System.out.println("숫자를 입력하세요");
		int a = s.nextInt();
		System.out.println("더할 숫자를 입력하세요");
		int b = s.nextInt();
		System.out.println("더한값은");
		System.out.println(a+b);
		System.out.println("뺄 숫자를 입력하세요");
		int c = s.nextInt();
		int sum = a+b;
		System.out.println("뺀 값은");
		System.out.println(sum-c);
		System.out.println("뺄 숫자를 입력하세요");
		int d = s.nextInt();
		int min = sum-c;
		System.out.println("뺀 값은");
		System.out.println(min-d);
		
				
	}

}
