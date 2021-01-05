package Java12_4;
import java.util.Scanner;
public class Forpractice6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		
		String num_str = "12345";
		System.out.println("Int 형 :" + num_str);
		
		
		int str_num = Integer.parseInt(num_str);
		
		int str_num_1 = Integer.valueOf(num_str);
		
		System.out.println("Int 형_pars :" + str_num);
		System.out.println("Int 형_valu :" + str_num_1);
		
		String sum = num_str+10;
		int sum_1 = str_num+10;
		
		System.out.println(sum);
		System.out.println(sum_1);
		
		
		
		

	}

}
