package Test_Arraylist;
import java.util.Scanner;
import java.util.ArrayList;
public class Test_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//���ڸ� �޾ƺ�����
		//���ڸ� �߶� �迭�� ��������
		//�迭���̸� �����Ͽ�
		//�迭������ �ݸ�ŭ�� �����ϼ���
		
		Scanner sc =new Scanner(System.in);

		
		
		ArrayList<String> a = new ArrayList<String>();
		System.out.println("���ڸ� �Է��ϼ���");
		String str = sc.nextLine();
		int leng = str.length();
		for(int i =0; i<leng; i++) {
			a.add(str.substring(i, i+1));
			
		}System.out.println("�迭���� :"+a.size());
		int cnt =a.size()/2;
		for(int i =0; i<cnt; i++) {
			a.remove(0);
			
		}System.out.println(a);
		
	}

}
