package Ex;

import java.util.Scanner;

public class Exam_list {

	Exam[] exams;
	int current;
	
	public void a(){
		this.exams = new Exam[5];
		this.current=0;
	}
	  void print_list(Exam_list list) {// ���
		System.out.println("----------------------------------------------------------");
		System.out.println("|           ���� ���                  | ");
		System.out.println("----------------------------------------------------------");
		System.out.println();
		for (int i = 0; i < list.current; i++) {
			Exam exam = list.exams[i];
			int kor = exam.Kor;
			int eng = exam.Eng;
			int math = exam.Math;

			int total = kor + eng + math;
			double avg = total / 3.0;

			System.out.printf("���� : %d\n", kor);
			System.out.printf("���� : %d\n", eng);
			System.out.printf("���� : %d\n", math);

			System.out.printf("���� : %d\n", total);
			System.out.printf("��� : %6.2f\n", avg);
			System.out.println("----------------------------------------------------------");
		}
	}

	 void input_list(Exam_list list) { // �Է�
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

		Exam exam = new Exam();

		exam.Kor = kor;
		exam.Eng = eng;
		exam.Math = math;

		if (list.exams.length == list.current) {
			Exam[] temp = new Exam[list.exams.length + 5];
			for (int i = 0; i < list.exams.length; i++) {
				temp[i] = list.exams[i];

			}
			list.exams = temp;
		}
		list.exams[list.current] = exam;
		list.current++;
	}
}
