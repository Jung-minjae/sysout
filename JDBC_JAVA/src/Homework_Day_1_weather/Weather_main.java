package Homework_Day_1_weather;

import java.util.Scanner;

public class Weather_main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Weather_Dao wd = new Weather_Dao();
		boolean run = true;

		while (run) {
			System.out.println("������ �Ͻðڽ��ϱ�?");
			System.out.println("1.���� �Է� 2. �Էµ� �µ��� ��ȸ, 3.���� �µ� ��հ� ��ȸ 4.���� �µ� ��ȸ 5. ���� ����� �µ���ȸ 6.���� ����� �µ� 7. ������");
			int select = sc.nextInt();
			switch (select) {
			case 1:
				wd.temp_record_1();
				// �۾���
				break;
			case 2:
				wd.read();
				break;
			case 3:
				wd.avg();
				break;
			case 4:
				wd.local();
				break;
			case 5:
				wd.local_avg();
				break;
			case 6:
				wd.local_yearavg();
				break;

			case 7:
				wd.rank();
				break;
			case 8:

				System.out.println("Good bye~!");
				run = false;
				break;
			// ���� �ϱ�
			}

		}
	}
}
