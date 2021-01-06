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
		System.out.println("|         성적 입력                    | ");
		System.out.println("----------------------------------------------------------");
		System.out.println();

		do {
			System.out.printf("국어 : ");
			kor = scan.nextInt();
			if (kor < 0 || 100 < kor)
				System.out.println("국어 성적은 0~100까지의 범위만 입력해주세요.");
		} while (kor < 0 || 100 < kor);

		System.out.println("----------------------------------------------------------");

		do {
			System.out.printf("영어 : ");
			eng = scan.nextInt();
			if (eng < 0 || 100 < eng)
				System.out.println("영어 성적은 0~100까지의 범위만 입력해주세요.");
		} while (eng < 0 || 100 < eng);
		System.out.println("----------------------------------------------------------");

		do {
			System.out.printf("수학 : ");
			math = scan.nextInt();
			if (math < 0 || 100 < math)
				System.out.println("수학 성적은 0~100까지의 범위만 입력해주세요.");
		} while (math < 0 || 100 < math);
		System.out.println("----------------------------------------------------------");
		list.add(kor, eng, math);

	}

	public void print() {
		System.out.println("----------------------------------------------------------");
		System.out.println("|           성적 출력                  | ");
		System.out.println("----------------------------------------------------------");
		System.out.println();

		for (int i = 0; i < list.size(); i++) {
			Exam exam = list.get(i);
			int kor = exam.getKor();
			int eng = exam.getEng();
			int math = exam.getMath();
			int total = exam.getTotal();
			double avg = exam.getavg();

			System.out.printf("국어 : %d\n", kor);
			System.out.printf("영어 : %d\n", eng);
			System.out.printf("수학 : %d\n", math);

			System.out.printf("총점 : %d\n", total);
			System.out.printf("평균 : %6.2f\n", avg);
			System.out.println("----------------------------------------------------------");

		}
	}
}