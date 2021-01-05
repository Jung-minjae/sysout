package Java12_4;

public class Contains {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Yang!Jung";
		
		if(str.contains("Yang")) {
			System.out.println("contain 대소문자 구분");
		}

		if(str.contains("yang")) {
			System.out.println("contain 대소문자 구분 못함");
	}
		int i = str.indexOf("Y");
		System.out.println("indexof 의 인텍스 값:"+i);
		
	}

}
