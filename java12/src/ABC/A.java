package ABC;

import java.util.Scanner;

public class A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C c = new C();
		Scanner sc = new Scanner(System.in);
		System.out.println("문자를입력하세요");
		c.str = sc.nextLine();
		
		for(int i =0; i<c.str.length(); i++) {
		String a =c.str.substring(i,i+1);
		System.out.println(a);
		}
}
}