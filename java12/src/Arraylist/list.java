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
			}System.out.println("�迭���� : "+str_array.size());
			str_array.remove(1);//�ε��� ��ȣ ����
			System.out.println(str_array.contains("A")); //�մ���Ȯ��
			
	//		str_array.remove("B"); //Ư�� ��¥ ����
			str_array.add(1, "b"); //Ư�� ���� �߰�
			
			
			System.out.println(str_array);
			System.out.println(str_array.get(0));
			for(int i = 0; i<str_array.size(); i++) {
				System.out.println("���: "+str_array.get(i));
				
			}
			for(String k : str_array) {
				System.out.println(k);
			}
}

}
