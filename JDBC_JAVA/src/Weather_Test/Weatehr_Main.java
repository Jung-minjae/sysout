package Weather_Test;

import java.util.Scanner;

public class Weatehr_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub flag =Y ,N 고치면<
		// (1.날씨 입력 2. 날씨 update 3. 지역 insert 4. 지역update 5. 지역삭제 6.사용자추가 7.사용자 삭제
		// 8.우수사원출력 9, 끝내기)
		Scanner sc = new Scanner(System.in);
		weatherConsole wc = new weatherConsole();
		boolean run = true;

		while (run) {

			switch (wc.Choice()) {
			case 1:
				// 날씨 입력
				wc.input();
				break;
			case 2:
				wc.update();
				// 날씨 업데이트
				break;
//			case 3:
//				wc.local_input();
//				// 지역 입력
//				break;
//			case 4:
//				wc.local_update();
//				// 지역 업데이트
//				break;
//			case 5:
//				wc.local_delete();
//				// 지역 삭제 flag Y > N
//				
//				break;
//			case 6:
//				wc.user_input();
//				// 사용자 추가
//				break;
//			case 7:
//				wc.user.Delete();
//				// 사용자 삭제
//				break;
//			case 8:
//				wc.user_ranking
//				// 우수사원 출력
//				break;
			case 9:
				// 끝내기
				run = false;
				System.out.println("수고하셨습니다");
				break;
			}
		}
	}

}
