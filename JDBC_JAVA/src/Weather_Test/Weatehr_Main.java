package Weather_Test;

import java.util.Scanner;

public class Weatehr_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub flag =Y ,N ��ġ��<
		// (1.���� �Է� 2. ���� update 3. ���� insert 4. ����update 5. �������� 6.������߰� 7.����� ����
		// 8.��������� 9, ������)
		Scanner sc = new Scanner(System.in);
		weatherConsole wc = new weatherConsole();
		boolean run = true;

		while (run) {

			switch (wc.Choice()) {
			case 1:
				// ���� �Է�
				wc.input();
				break;
			case 2:
				wc.update();
				// ���� ������Ʈ
				break;
//			case 3:
//				wc.local_input();
//				// ���� �Է�
//				break;
//			case 4:
//				wc.local_update();
//				// ���� ������Ʈ
//				break;
//			case 5:
//				wc.local_delete();
//				// ���� ���� flag Y > N
//				
//				break;
//			case 6:
//				wc.user_input();
//				// ����� �߰�
//				break;
//			case 7:
//				wc.user.Delete();
//				// ����� ����
//				break;
//			case 8:
//				wc.user_ranking
//				// ������ ���
//				break;
			case 9:
				// ������
				run = false;
				System.out.println("�����ϼ̽��ϴ�");
				break;
			}
		}
	}

}
