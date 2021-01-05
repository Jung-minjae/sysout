package Java12_10;
import java.util.Scanner;
public class Mosbak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");					// 문자 입력
		String str = sc.nextLine();
		
		byte[] byte_str = new byte[str.length()];	// byte 배열 선언
		String[] code = new String[1000];			// 모스부호를 담기위한 배열 선언
		
		
		for(int i = 0; i < str.length(); i++) {
			// 입력받은 String 문자를 byte 배열로 형변환하여 저장
			byte_str[i] = (byte)str.charAt(i);		
			int j = 0;								
			
			System.out.print(byte_str[i] + " : ");
			
			// 2진수로 계산하여 모스부호 배열에 저장
			while(byte_str[i] > 1) {
				if((byte_str[i]) % 2 == 0)
					code[j] = "-"; 
				else
					code[j] = "0"; 
				
				byte_str[i] /= 2;
				j++;
			}
			
			if(byte_str[i] == 0) {
				code[j] = "-";  
			}
			else {
				code[j] = "0"; 
			
			// 역순 출력
			for(int k = j; k >= 0; k--) {
				System.out.print(code[k]);
			System.out.println("\n");
		}
	}
}
		
		}
	}


