package Record;

import java.util.Scanner;

public class Exam_Console {
	private Exam_list list = new Exam_list();

	public void input_list() {
		int kor;
		int eng;
		int math;
		Scanner scan = new Scanner(System.in);
		System.out.println("----------------------------------------------------------");
		System.out.println("|         ���� �Է�                    | ");
		System.out.println("----------------------------------------------------------");
		System.out.println();

		do {
			System.out.printf("���� : ");
			kor = scan.nextInt();
			if (kor < 0 || 100 < kor)
				System.out.println("���� ������ 0~100������ ������ �Է����ּ���.");
		} while (kor < 0 || 100 < kor);

		System.out.println("----------------------------------------------------------");

		do {
			System.out.printf("���� : ");
			eng = scan.nextInt();
			if (eng < 0 || 100 < eng)
				System.out.println("���� ������ 0~100������ ������ �Է����ּ���.");
		} while (eng < 0 || 100 < eng);
		System.out.println("----------------------------------------------------------");

		do {
			System.out.printf("���� : ");
			math = scan.nextInt();
			if (math < 0 || 100 < math)
				System.out.println("���� ������ 0~100������ ������ �Է����ּ���.");
		} while (math < 0 || 100 < math);
		System.out.println("----------------------------------------------------------");
		list.add(kor, eng, math);

	}

	public void print() {
		System.out.println("----------------------------------------------------------");
		System.out.println("|           ���� ���                  | ");
		System.out.println("----------------------------------------------------------");
		System.out.println();

		for (int i = 0; i < list.size(); i++) {
			Exam exam = list.get(i);
			int kor = exam.getKor();
			int eng = exam.getEng();
			int math = exam.getMath();
			int total = exam.getTotal();
			double avg = exam.getavg();

			System.out.printf("���� : %d\n", kor);
			System.out.printf("���� : %d\n", eng);
			System.out.printf("���� : %d\n", math);

			System.out.printf("���� : %d\n", total);
			System.out.printf("��� : %6.2f\n", avg);
			System.out.println("----------------------------------------------------------");

		}
	}
}