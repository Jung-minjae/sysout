package Java12_11;
import java.util.Scanner;
import java.util.Random;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("몇 개의 글자를 뽑으시겠습니까?");
	    int count = sc.nextInt();
	    Random rd = new Random();
	    String str[] = new String[count];
	    String text = "";
	    for(int i=0; i<count ;i++) {
	    	int txt = rd.nextInt(57)+65; //122 
	    	System.out.println("뽑힌 숫자는 :"+txt);
	    	if (txt >=91&&txt <=96 ) {
	    		i = -1;
	    		continue;
	    	}
	    	char c= (char) txt;
	    	str[i]= Character.toString(c);	
	    }
	   for(String t: str ) {
		   System.out.println(t);
		   text +=t;	   
	   }
	   System.out.println(text);
	}
}

		
		
		
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("몇개의 글자를 뽑으시겠습니까?");
//		int count = sc.nextInt();
//		Random rdm = new Random();
//		String str[] = new String[count];
//		int a = 0;
//		do {
//		System.out.println("숫자를 문자로 변형하기! 몇번 반복하시겠습니까?");
//		  a = sc.nextInt();
//		
//		}
//		while(a != a);
//		
