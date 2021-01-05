package Java12_4;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String str ="1234"          str 글자를 한글자씩 빼서 숫자로 바꾼후 char c와 곱하세요
		//String str_1 = "A123"
		//char c = "E"
		
		String str = "1234";
		String str_1 = "A123";
		char c = 'e';
		int d = c;
		for(int i = 0; i<str.length(); i++) {
			
			int str1 = Integer.parseInt(str.substring(i,i+1));
			System.out.println(str1);
			
		}
		
		for(int j = 0; j<str_1.length();j++) {
			
			int str_11 = Integer.parseInt(str_1.substring(j,j+1));
			System.out.println(str_11);
				}
		
			
		
			
			
			
		}
		

	}


