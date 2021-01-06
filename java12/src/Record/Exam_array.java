package Record;


import java.util.Scanner;

public class Exam_array {
	public static void main(String[] args) {
		// Exam[] exams = new Exam[3];
		Exam_Console ec = new Exam_Console();

//		Exam_list.init(list);
//		list.init();

		// exams[0]~exams[2]
		Scanner scan = new Scanner(System.in);
		int menu;
		boolean keepLoop = true;

		while (keepLoop) {
			System.out.println("----------------------------------------------------------");
			System.out.println("|         메인 메뉴                   | ");
			System.out.println("----------------------------------------------------------");
			System.out.println("\t1. 성적입력 ");
			System.out.println("\t2. 성적출력 ");
			System.out.println("\t3. 종료 ");
			System.out.println("\t선택> ");
			menu = scan.nextInt();

			switch (menu) {
			case 1:
				ec.input_list(); //
				break;
			case 2:
				// print_list(list);
				ec.print();

				break;
			case 3:
				System.out.println("Bye~");
				break;

			default:
				System.out.println("잘못된 값을 입력하셨습니다 1~3 까지의 숫자를 입력해주세요.");
			}
		}
	}
}