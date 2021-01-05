package Java12_29;
import java.util.Scanner;
public class Exam_print {

	
	public static void print() {
		Exam exam = new Exam();
		int kor;
		int eng;
		int math;
		Scanner scan = new Scanner(System.in);
		
		

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
		
		
//	exam.kor = kor;
//		exam.eng = eng;
//		exam.math = math;
		
	}
	
}
