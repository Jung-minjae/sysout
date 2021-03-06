package Ex;

import java.util.Scanner;

public class Exam_list {

	Exam[] exams;
	int current;
	
	public void a(){
		this.exams = new Exam[5];
		this.current=0;
	}
	  void print_list(Exam_list list) {// 출력
		System.out.println("----------------------------------------------------------");
		System.out.println("|           성적 출력                  | ");
		System.out.println("----------------------------------------------------------");
		System.out.println();
		for (int i = 0; i < list.current; i++) {
			Exam exam = list.exams[i];
			int kor = exam.Kor;
			int eng = exam.Eng;
			int math = exam.Math;

			int total = kor + eng + math;
			double avg = total / 3.0;

			System.out.printf("국어 : %d\n", kor);
			System.out.printf("영어 : %d\n", eng);
			System.out.printf("수학 : %d\n", math);

			System.out.printf("총점 : %d\n", total);
			System.out.printf("평균 : %6.2f\n", avg);
			System.out.println("----------------------------------------------------------");
		}
	}

	 void input_list(Exam_list list) { // 입력
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

