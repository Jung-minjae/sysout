package Java12_16;

public class TryCatch1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "ABCDE";
		try {
			for(int i = 0; i<=str.length();i++) {
				String sub = str.substring(i,i+1);
			}
		}catch(ArithmeticException e) {
			System.out.println(e);
		}
		catch(NullPointerException e) {
			System.out.println(e);
		}
		catch(IndexOutOfBoundsException e) {
			System.out.println(e);
		}
		
	}

}
