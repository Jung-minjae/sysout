package Test_Arraylist;

import java.util.Scanner;
import java.util.ArrayList;

public class Flied_main_2 {
	static ArrayList<Flied_val_2> fv = new ArrayList<Flied_val_2>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean run = true;
		Scanner sc = new Scanner(System.in);
		while (run) {

			System.out.println("1.�Է� 2. ��ȸ 3. ���� 4. ����");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				input();
				break;
			case 2:
				output();
				break;
			case 3:
				delete();
				break;
			case 4:
				run = false;
				System.out.println("��� ��");
				break;

			}
		}

	}

	static void delete() {

		Scanner sc = new Scanner(System.in);
		System.out.println("�����Ͻ� �̸��� �Է��Ͻÿ�.");
		String name_search = sc.next();

		for (int i = 0; i < fv.size(); i++) {
			if (name_search.equals(fv.get(i).name))
				fv.remove(i);
			else {
				System.out.println("�׷��̸� ã���������ϴ�");
			}
		}
	}

	static void input() {

		Scanner sc = new Scanner(System.in);
		int i = 0;
		Flied_val_2 fdv = new Flied_val_2();

		System.out.println("���̵� �Է��ϼ���");
		fdv.id = sc.nextLine();

		System.out.println("�̸��� �Է��ϼ���");
		fdv.name = sc.nextLine();

		System.out.println("��й�ȣ�� �Է��ϼ���");
		fdv.password = sc.nextLine();

		fv.add(i, fdv);
		i++;
	}

	static void output() {

		Flied_val_2 fdv = new Flied_val_2();

		for (int i = 0; i < fv.size(); i++) {

			fv.get(i);
			System.out.println(fv.get(i).id);
			System.out.println(fv.get(i).name);
			System.out.println(fv.get(i).password);
		}
	}
}
