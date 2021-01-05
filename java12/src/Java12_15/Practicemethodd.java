package Java12_15;
import java.util.Scanner;
public class Practicemethodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 스캔 문자입력 lenth 호출 sub 호출 
		// 프린트 호출
		// 1. lenth에서 문자길이 체크후 리턴
		// 2. 문자를 하나씩 잘라 스트링[] 배열 값으로 리턴
		// 3. 배열값 화면에 출력
		
		Scanner sc = new Scanner(System.in);
		
		String a = sc.nextLine();
		
		int lenth = lenth(a);
		String[] array = new String[lenth];
		
			array = sub(a,lenth);
		
			print(array);
		
		
		
	}
	public static int lenth(String a) {
	int leng =a.length();
	return leng;
	}
	
	public static String[] sub(String a,int lenth) {
		String [] array = new String[lenth];
		for(int i = 0; i<lenth; i++) {
		 
		 array[i] = a.substring(i,i+1);
		}
		return array;
		
	}
	public static void print(String array[]) {
		for (String k : array) {
		System.out.println(k);
		System.out.println("🤣");
	}
	}
}
