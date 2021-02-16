package Test_Arraylist;
import java.util.Scanner;
import java.util.ArrayList;
public class Test_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//글자를 받아보세요
		//글자를 잘라서 배열에 넣으세요
		//배열길이를 측정하여
		//배열길이의 반만큼만 삭제하세요
		
		Scanner sc =new Scanner(System.in);

		
		
		ArrayList<String> a = new ArrayList<String>();
		System.out.println("글자를 입력하세요");
		String str = sc.nextLine();
		int leng = str.length();
		for(int i =0; i<leng; i++) {
			a.add(str.substring(i, i+1));
			
		}System.out.println("배열길이 :"+a.size());
		int cnt =a.size()/2;
		for(int i =0; i<cnt; i++) {
			a.remove(0);
			
		}System.out.println(a);
		
	}

}
