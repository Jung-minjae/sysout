package Javatest;
import java.util.Scanner;
public class Cloudstudy7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//		세자리의 정수 N (100~999)을 표현하는 각 자리의 숫자들의 합을 구하는 프로그램을 작성하세요. 
		//		•[예] 932 정수의 각 자리 숫자들의 합계는 14 ( = 9 + 3 + 2)

		Scanner sc = new Scanner(System.in);
		boolean run = true;
		System.out.println("3자리 숫자를 입력하세요");
		String num;
	   String[] array = new String[3];
		 num = sc.nextLine();
	  
		int num_1 = Integer.parseInt(num);
	  if(num_1<100 || num_1>999) {
		  System.out.println("3자리 숫자가 아닙니다");
	  }
	  else {
		  run = !run;
	  }
	
	for(int i =0; i<3;i++) {  
	
	array[i]=num.substring(i,i+1);
	}
	int a = Integer.parseInt(array[0]);
	int b = Integer.parseInt(array[1]);
	int c = Integer.parseInt(array[2]);
	
	int sum = a+b+c;
	System.out.println("각 자리 숫자의 합은");
	System.out.println(sum);
	}
}
