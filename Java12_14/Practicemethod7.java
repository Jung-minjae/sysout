package Java12_14;
import java.util.Scanner;
public class Practicemethod7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 문자를 입력받고 문자를 보내면 문자안에 ! 표가 있는지 없는지
		// true false로 리턴 해주는 함수
		// ! 표가 있으면 index 값을 리턴하는 함수
		
		Scanner sc = new Scanner (System.in);
		System.out.println("문자를 입력하세요");
		String a = sc.nextLine();
		
		boolean b = boo(a);
//		if(b==true) {
//			
//		}
	}
	public static boolean boo(String a) {
	
		boolean p=a.contains("!");
		if (p==true) {
			System.out.println(true);
		int	ind =a.indexOf("!");
			System.out.println(ind);
		}
		if (p==false) {
			System.out.println(false);
		}
		return p ;
	}
}
