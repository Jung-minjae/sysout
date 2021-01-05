package Java12_4;

public class Forpractice4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "ABCDEF";
		
		char c = str.charAt(1);
		System.out.println("CharAt:"+c);
		
		for(int i = 0; i<str.length(); i++) {
			System.out.println(str.substring(i,i+1));
			System.out.println(str.charAt(i));
		}
		
		
		
		
		
	}

}
