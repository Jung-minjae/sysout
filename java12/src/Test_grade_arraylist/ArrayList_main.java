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
			System.out.println("[1]성적 입력 [2]성적 출력 [3]성적 삭제 [4]종료");
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
			System.out.print("이름: ");
			String name = scan.next();
			System.out.print("국어: ");
			int kor = scan.nextInt();
			System.out.print("영어: ");
			int eng = scan.nextInt();
			System.out.print("수학: ");
			int math = scan.nextInt();

			Field_val student = new Field_val();
			student.setKor(kor);
			student.setEng(eng);
			student.setMath(math);
			student.setName(name);

			fv.add(student);

			System.out.println("성적입력완료!");
		}

		public static void output(ArrayList<Field_val> fv) {
			for (int i = 0; i < fv.size(); i++) {
				System.out.println("-------------------");
				System.out.println("이름: " + fv.get(i).getName());
				System.out.println("국어: " + fv.get(i).getKor());
				System.out.println("영어: " + fv.get(i).getEng());
				System.out.println("수학: " + fv.get(i).getMath());
				System.out.println("-------------------");
			}
		}

		public static void delete(ArrayList<Field_val> fv) {
			System.out.print("삭제할 이름: ");
			String name = scan.next();
			for (int i = 0; i < fv.size(); i++) {
				if (fv.get(i).getName().equals(name)) {
					fv.remove(i);
					System.out.println("삭제왼료!");
				}
			}
		}
	}

}
