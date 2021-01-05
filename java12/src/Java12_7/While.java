package Java12_7;
import java.util.Scanner;
public class While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		String name = sc.next();
		int sum = 0;
		
		for(int i = 0 ; i<name.length(); i++) {
			
			char c = name.charAt(i);
			
						
			int a = c;
			
			sum += a;
			 
			System.out.println("총합은:"+sum);
			
			
		
		}
		
		
	}

}
