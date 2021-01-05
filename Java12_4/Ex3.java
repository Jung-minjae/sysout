package Java12_4;

public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "1234";
		char c = 'E';
		
		int str_lang = str.length();
		int sum = 0;
		for(int i = 0; i<str_lang; i++) {
			String sub = str.substring(i,i+1);
			int sub_pars = Integer.parseInt(sub);
			//int change = c;
			int multi = sub_pars*c ;
			sum += multi;
		}
		System.out.println("총합은:"+sum);	
		

	}

}
