package Day_1;



import java.util.Scanner;

public class JDBC_Practice2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		JDBC_Dao jd =new JDBC_Dao();
		boolean run = true;

		while (run) {
			System.out.println("������ �Ͻðڽ��ϱ�? (1. �� ���� | 2: �� ��ü��ȸ | 3: ���ϴ� ��ȣ �� ��ȸ | 4: �����ϱ�)");
			int select = sc.nextInt();
			switch (select) {
			case 1:
				jd.write_document();
				// �۾���
				break;
			case 2:
				jd.reading_document();
				break;
			case 3:
				System.out.println("��� ���� ���ðڽ��ϱ�?");
				int num = sc.nextInt();
				jd.view_document(num);
				break;
			case 4:
				System.out.println("Good bye~!");
				run = false;
				break;
			// ���� �ϱ�
			}

		}
	}
}
