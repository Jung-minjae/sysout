package Java12_7;
import java.util.Scanner;
public class While4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		boolean run = true;
		
		while(run) {
		
		System.out.println("단을 입력하세요");
		int n = sc.nextInt();
		
		for(int i=1; i<=9; i++) {
			int sum = n*i;
			System.out.println(n+"x"+i+"="+ sum);
		}
		
		System.out.println("계속 하시겠습니까? 1.Yes 2.No");
		int a = sc.nextInt();
		
		if(a==1) {
			run = true;
			
		}
		if(a==2) {
			System.out.println("구구단을 종료합니다");
			run = false;
			
		}
		
		}
	}

}
