package Java12_16;

public class Trycatch2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// str = ABCDEF가 있다. 서브스트링으로 인덱스오브바운드익셉션하나 띄워보고
		// 어레이에 담을때 에러하나 띄워보기
		
		String str = "ABCDEF";
		try {
			for(int i = 0; i<=str.length();i++) {
				String sub = str.substring(i,i+1);
				System.out.println(sub);
			}
		}
		catch(IndexOutOfBoundsException e) {
			System.out.println(e);
		}
		try { 
			String [] Array = {"A","B","C","D","E","F"};
			for(int i = 0; i<=Array.length; i++) {
				System.out.println(Array[i]);
			}
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
	}
	

}
