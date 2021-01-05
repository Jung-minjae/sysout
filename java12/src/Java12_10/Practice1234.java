package Java12_10;

import java.util.ArrayList;

public class Practice1234 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				ArrayList<String> list = new ArrayList<String>();
				String str = "ABCDEF";
				for(int i =0; i<str.length(); i++) {
					list.add(str.substring(i,i+1));
				}//list.add(index 값, 입력값)
				for(String s : list) { //for문을 통한 전체출력  for:each 문 배열출력 루프문
				    System.out.println(s);
				}	
				System.out.println(list.get(0));	
				list.remove(1);  //index 1 제거
				list.clear();  //모든 값 제거

	}	

}
