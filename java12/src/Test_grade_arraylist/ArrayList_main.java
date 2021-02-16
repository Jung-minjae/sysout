package Test_grade_arraylist;

import java.util.Scanner;
import java.util.ArrayList;

public class ArrayList_main {
	private static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Field_val> fv = new ArrayList<Field_val>();

		boolean run = true;
		while (run) {
			System.out.println("[1]���� �Է� [2]���� ��� [3]���� ���� [4]����");
			int menu = scan.nextInt();
			switch (menu) {
			case 1:
				input(fv);
				break;
			case 2:
				output(fv);
				break;
			case 3:
				delete(fv);
				break;
			case 4:
				run = false;
				break;
			default:
				break;
			}
		}
		public static void input(ArrayList<Field_val> fv) {
			System.out.print("�̸�: ");
			String name = scan.next();
			System.out.print("����: ");
			int kor = scan.nextInt();
			System.out.print("����: ");
			int eng = scan.nextInt();
			System.out.print("����: ");
			int math = scan.nextInt();

			Field_val student = new Field_val();
			student.setKor(kor);
			student.setEng(eng);
			student.setMath(math);
			student.setName(name);

			fv.add(student);

			System.out.println("�����Է¿Ϸ�!");
		}

		public static void output(ArrayList<Field_val> fv) {
			for (int i = 0; i < fv.size(); i++) {
				System.out.println("-------------------");
				System.out.println("�̸�: " + fv.get(i).getName());
				System.out.println("����: " + fv.get(i).getKor());
				System.out.println("����: " + fv.get(i).getEng());
				System.out.println("����: " + fv.get(i).getMath());
				System.out.println("-------------------");
			}
		}

		public static void delete(ArrayList<Field_val> fv) {
			System.out.print("������ �̸�: ");
			String name = scan.next();
			for (int i = 0; i < fv.size(); i++) {
				if (fv.get(i).getName().equals(name)) {
					fv.remove(i);
					System.out.println("�����޷�!");
				}
			}
		}
	}

}
