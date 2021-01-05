package Java12_4;
import java.util.Scanner;
public class Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s= new Scanner(System.in);
		
		int dan = 0;
		System.out.println("몇 단?");
		dan = s.nextInt();
		
		for(int i = 1; i<10; i++) {
			System.out.println(dan+"*"+i + "=" + dan*i);
		}
		
		
		
//		for(int i = 1; i<=9; i++ ) {
//			System.out.printf("%d*%d = %d \n",dan,i,dan*i );
//		}

	}

}
