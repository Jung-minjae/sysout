package Java12_9;
import java.util.Scanner;
public class Practice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("문자를 입력하세요");
		String p = sc.nextLine();
		String o = " ";
		int p_1 = p.length()%2;
		if(p_1==1) {
			String a =p+o;
			for(int i = 0; i<a.length()-1; i++) {
				String b = a.substring(i,i+2);
				System.out.println(b);
				i=i+1;
			}
		}
		if(p_1==0) {
		for(int i = 0; i<p.length()-1; i++) {
		
			String a = p.substring(i,i+2);
			System.out.println(a);
			i=i+1;
		}
		}
		//		String b = p.substring(p.length(),p.length()+1);
//		System.out.println(b);
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("문자를 입력하세요");
//		String p = sc.nextLine();
//		String o = " ";
//		for(int i = 0; i<p.length()-1; i++) {
//			
//			int p_1 = p.length()%2;
//			if (p_1==0) {
//			String a = p.substring(i,i+2);
//			System.out.println(a);
//			i=i+1;
//		}
//			if(p_1==1) {
//				String b = p+o;
//				 b = p.substring(i,i+2);
//				System.out.println(b);
//				i=i+1;
//				
//			}
//			
//		}
		
		
		
	}

}

