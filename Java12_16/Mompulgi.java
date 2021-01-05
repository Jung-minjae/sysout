package Java12_16;
import java.util.Scanner;
import java.util.Random;
public class Mompulgi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// String str = 스캔이라는 메소드만들어서 불러오기
		// 렝 메소드 만들어서 렝쓰 불러오기
		// 서브라는메소드 만들어서 글자를 잘라온다
		// 글자를 잘랐고 leng이 짝수일때와 홀수일때로 나눈다
		// 짝수일대는 6면체 주사위  홀수일때는 7면체주사위
		String str = scan();
		System.out.println("받아온 문자는 "+str);
		
		int leng[] = leng(str);
		System.out.println("문자의 길이는 "+leng[0]+" 주사위의 숫자는 "+leng[1]);
		
		String sub[] = sub(str,leng[0]);
		System.out.println("한글자씩 자른값은");
		for(String g :sub) {
			System.out.println(g);
		}
	}
	
	public static String scan() {
		Scanner sc = new Scanner(System.in);
		System.out.println("문자를 입력하세요");
		String str = sc.nextLine();
		return str;
	}
	
	public static int[] leng(String a) {
		int array[] = new int[2];
		int leng = a.length();
		int dice = dice(leng);
		array[0]=leng;
		array[1]=dice;
		return array;
		
		
	}
	
	public static String[] sub(String str, int leng) {
		String a[] =new String[leng] ;
		for(int i =0; i<leng;i++) {
			 a[i] = str.substring(i,i+1);
			
		}
		return a;
	}
	public static int dice(int leng) {
		Random rdm = new Random();
		int dice;
		if(leng%2==0) {
			dice = rdm.nextInt(5)+1;
		}
		else {
			dice =rdm.nextInt(6)+1;
		}
		return dice;
	}
}
