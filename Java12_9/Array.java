package Java12_9;
import java.util.Scanner;
public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		String a = sc.nextLine();
		String c[] =null;
		String b[] = a.split("@|!|#");
		//String Array[] = b;
		
		
		for(int i =0; i<b.length;i++) {
			System.out.println(b[i]);
			
		
		}
		
	}

}
