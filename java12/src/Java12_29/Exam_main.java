package Java12_29;
import java.util.Scanner;

public class Exam_main {

	public static void main(String[] args) {
		Exam exam = new Exam();
		Exam[] exams = new Exam[4];
		input(exam);
		print(exam);
	}

	public static void print(Exam exam) {
		int kor = exam.getKor();
		int eng = exam.getEng();
		int math = exam.getMath();
		int sci = exam.getSci();
		int soc = exam.getSoc();
		System.out.println("----------------------------------------------------------");
		System.out.println("|           성적 출력                  | ");
		System.out.println("----------------------------------------------------------");
		System.out.println();

		int total = kor + eng + math+sci+soc;
		double avg = total / 5.0;

		System.out.printf("국어 : %d\n", kor);
		System.out.printf("영어 : %d\n", eng);
		System.out.printf("수학 : %d\n", math);
		System.out.printf("사회 : %d\n", soc);
		System.out.printf("과학 : %d\n", sci);

		System.out.printf("총점 : %d\n", total);
		System.out.printf("평균 : %6.2f\n", avg);
		System.out.println("----------------------------------------------------------");
	}

	public static void input(Exam exam) {
		String korl = "국어";
		String engl = "영어";
		String maths = "수학";
		String soci = "사회";
		String scien = "과학";
		String [] sub = {korl,engl,maths,soci,scien};
		System.out.println("----------------------------------------------------------");
		System.out.println("|         성적 입력                    | ");
		System.out.println("----------------------------------------------------------");
		System.out.println();
		
		for(int i = 0; i<sub.length;i++) {
			
			if(i==0) {
				exam.setKor(do_process(sub[i]));
			}
			if(i==1) {
				exam.setEng(do_process(sub[i]));
			}
			if(i==2) {
				exam.setMath(do_process(sub[i]));
			}
			if(i==3) {
				exam.setSci(do_process(sub[i]));
			}
			if(i==4) {
				exam.setSoc(do_process(sub[i]));
			}
//		exam.setKor(do_process(korl));
//		exam.setEng(do_process(engl));
//		exam.setMath(do_process(maths));
//		exam.setSci(do_process(scien));
//		exam.setSoc(do_process(soci));
//		
		}

	}
	
	public static int do_process(String str) {
		Scanner scan = new Scanner(System.in);
		int num;
		do {
			System.out.printf(str + " : ");
			num = scan.nextInt();
			if (num < 0 || 100 < num)
				System.out.println(str + " 성적은 0~100까지의 범위만 입력해주세요.");
		} while (num < 0 || 100 < num);
	
		System.out.println("----------------------------------------------------------");
	return num;	
	}
}