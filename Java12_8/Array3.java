package Java12_8;
import java.util.Scanner;
public class Array3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 스캐너로 문자를 입력받는다.
		// 띄워쓰기를 통한 배열에 값 저장하기
		// 배열 걊을 for를 돌려서 찍어보기
		
		Scanner sc = new Scanner(System.in);
		
		String a = sc.nextLine();
		String b[] = a.split("-|;|@");
		int s = 0;
		
		for(int i = 0; i<b.length; i++) {
			System.out.println(b[i]);
			for(int j = 0 ;j< b[i].length();j++) {
				//String c = b[i].substring(j,j+1);
				char c = b[i].charAt(j);
				int d = c;
					
				
				System.out.println(c+"의 유니코드 숫자: "+d);
				
				s += d;
				
			}
			System.out.println("유니코드 숫자 합 ="+s);
		}
		
		
		
	}

}
