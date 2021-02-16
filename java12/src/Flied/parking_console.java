package Flied;

import java.text.SimpleDateFormat;
import java.util.Scanner;

public class parking_console {
	private Scanner sc = new Scanner(System.in);
	private parking pk = new parking();
	private SimpleDateFormat format = new SimpleDateFormat("HH��mm��ss��");

	public void Do() {
		System.out.println("================================");
		System.out.println("|         �������� �����Է�         |");
		System.out.println("================================");

		if (pk.get().size() == 50) {

			System.out.println("���������� ��� ���� ������ �Ҽ������ϴ�.");
		} else {
			String Car_number;
			String pk_time;
			System.out.println(". ���� ��ȣ :");
			Car_number = sc.next();

			pk_time = format.format(System.currentTimeMillis());
			System.out.println(". ���� �ð� : " + pk_time + " ������ �����մϴ�.");
			pk.add(Car_number, pk_time);
		}

	}

	public void List() {
		System.out.println("================================");
		System.out.println("|      �������� �� ���� ����Ʈ       |");
		System.out.println("================================");
		String[] spl_1 = new String[100];
		int[] str_num_1 = new int[1];
		String str_sum_1;

		String[] spl_2 = new String[100];
		int[] str_num_2 = new int[1];
		String str_sum_2;

		String usage_time = format.format(System.currentTimeMillis());
		int use;
        int fee=3000;
		for (int i = 0; i < pk.get().size(); i++) {
			//���� ��� �ð�
			Car_list car = pk.get().get(i);
			String sub_1 = car.getPk_time().substring(0, 5); // �ð��̶� �б����� �ڸ� ex 12�� 30��/
			spl_1 = sub_1.split("\\��"); //���ø����� �� �ܾ� ���� ���ڸ� �迭�� ����    ex 12,30

			str_sum_1 = spl_1[i] + spl_1[i + 1]; //String ���ϱ�� String�� ���ڳ��� ����  ex 1230;
			str_num_1[i] = Integer.parseInt(str_sum_1);  // String�� ���ڸ�  int������ ��ȯ  Ex int 1230;
			
			//��ȸ �ð�
			String sub_2 = usage_time.substring(0, 5); 
			spl_2 = sub_2.split("\\��");

			str_sum_2 = spl_2[i] + spl_2[i + 1];  
			str_num_2[i] = Integer.parseInt(str_sum_2);  
			
              use=str_num_2[i]-str_num_1[i];//���� �̿� �ð�
              if(use>30&&use<60) {
            	  fee+=1000;
              }else if(use>=60) {
            	  fee+=2000;
              }
			
			int space = 50 - pk.get().size();

			System.out.println("\t. ���� �������� ������ : " + space);

			System.out.println(". ���� ��ȣ : " + car.getCar_number());
			System.out.println(". ���� ��� �ð� : " + car.getPk_time());
			System.out.println(". ���� �̿� �ð� : " + use+" ��");
			System.out.println(". ���� ��� : " + fee+" ��" );
			System.out.println("--------------------------------------------");

		}
//		for (int k : str_num_1) {
//			System.out.println(k);
//		}

	}

	

}