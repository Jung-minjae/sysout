package Arraylist;
import java.util.ArrayList;
public class list {


public static void main(String[] args) {
	
//	String str="ABC";
//			int cnt = str.length();
//			String str_array[] = new String [cnt];
//			
//			for(int i=0; i<cnt; i++) {
//				str_array[i]=str.substring(i , i+1);
//			}
			
			ArrayList<String> str_array = new ArrayList<String>();
			String str ="ABC";
			int cnt =str.length();
			for(int i=0; i<cnt; i++) {
				str_array.add(str.substring(i,i+1));
			}System.out.println("배열길이 : "+str_array.size());
			str_array.remove(1);//인덱스 번호 제거
			System.out.println(str_array.contains("A")); //잇는지확인
			
	//		str_array.remove("B"); //특정 글짜 삭제
			str_array.add(1, "b"); //특정 글자 추가
			
			
			System.out.println(str_array);
			System.out.println(str_array.get(0));
			for(int i = 0; i<str_array.size(); i++) {
				System.out.println("출력: "+str_array.get(i));
				
			}
			for(String k : str_array) {
				System.out.println(k);
			}
}

}
