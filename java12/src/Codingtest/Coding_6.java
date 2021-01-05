package Codingtest;

public class Coding_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String a = "9B768C";
		String c = "";
		int leng = a.length();
		String array[] = new String[leng];
		
		for(int i = 0 ; i<leng; i++) {
			array[i]= a.substring(i,i+1);
			System.out.println(c += array[i]);
		}
	
		
	}

}
