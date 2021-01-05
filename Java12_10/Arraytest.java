package Java12_10;
import java.util.Scanner;
public class Arraytest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("첫 번째 값");
		String str = sc.nextLine();
		int leng= str.length();
		String str_array[]=new String[leng];
		
		String number[]= {"1","2","3","4","5","6","7","8","9","0"};
		
		for(int i =0; i<leng; i++) {
			str_array[i]=str.substring(i,i+1);
		}
		
		int cnt = 0;
		for(int i =0; i<leng; i++) {
			for(int j = 0; j<number.length; j++) {
				if(!(str_array[i].equals(number[j]))) {
					cnt ++;
					System.out.println(cnt);
				}
				
			}
			if(cnt<=9) {
				cnt =0;
			}
			else if (cnt ==10) {
				System.out.println("너 숫자 입력 안함");
				break;
			}
		}
		
}
}