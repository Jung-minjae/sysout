package Java12_4;

public class Forpractice7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//ABCDE 
		//Substring(0) 하면       (1,2)하면
		//ABCDE                   B
		
		// 
		String num_str = "AB345";

		String num_str1 = "12BCD";
		
		String num_char = "ABC";
		
//		System.out.println(num_str.substring(2));
//		System.out.println(num_str1.substring(0,2)); 
		
		char c = num_char.charAt(2);
				//System.out.println(c);
				
				int num_str_1 = Integer.parseInt(num_str.substring(2));
				int num_str1_1 = Integer.parseInt(num_str1.substring(0,2));
				
				//System.out.println(num_str_1);
				//System.out.println(num_str1_1);
				System.out.println(num_str_1+num_str1_1+c);
//				
//				int sum = num_str_1 + num_str1_1;
//				System.out.println(sum);

//		System.out.println(num_str.substring(2)+num_str1.substring(0,2)+c);
		
		
        		
		
		
				
	}

}
