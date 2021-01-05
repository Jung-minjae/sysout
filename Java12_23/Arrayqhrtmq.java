package Java12_23;
import java.util.Scanner;
public class Arrayqhrtmq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("이름을 입력하세요");
		String name = sc.nextLine();
		int name_leng = name.length();
		String array_name[] = new String[name_leng];
		
		
		System.out.println("전화번호를 입력하세요");
		String number = sc.nextLine();
		int number_leng = number.length();
		String array_number[] = new String[number_leng];
		
		for(int i = 0; i<name_leng;i++) {
			array_name[i] = name.substring(i,i+1);
		}
		
		array_number = number.split("-");
		
		for(String a :array_name ) {
			System.out.println(a);
		}
		
		for(String b :array_number ) {
		System.out.println(b);	
		}
		
	}

}
