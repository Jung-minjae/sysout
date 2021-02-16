package Day_1;



import java.util.Scanner;

public class JDBC_Practice2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		JDBC_Dao jd =new JDBC_Dao();
		boolean run = true;

		while (run) {
			System.out.println("무엇을 하시겠습니까? (1. 글 쓰기 | 2: 글 전체조회 | 3: 원하는 번호 글 조회 | 4: 종료하기)");
			int select = sc.nextInt();
			switch (select) {
			case 1:
				jd.write_document();
				// 글쓰기
				break;
			case 2:
				jd.reading_document();
				break;
			case 3:
				System.out.println("몇번 글을 보시겠습니까?");
				int num = sc.nextInt();
				jd.view_document(num);
				break;
			case 4:
				System.out.println("Good bye~!");
				run = false;
				break;
			// 종료 하기
			}

		}
	}
}
