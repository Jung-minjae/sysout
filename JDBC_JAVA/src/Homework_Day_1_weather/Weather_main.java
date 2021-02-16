package Homework_Day_1_weather;

import java.util.Scanner;

public class Weather_main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Weather_Dao wd = new Weather_Dao();
		boolean run = true;

		while (run) {
			System.out.println("무엇을 하시겠습니까?");
			System.out.println("1.날씨 입력 2. 입력된 온도값 조회, 3.월별 온도 평균값 조회 4.지역 온도 조회 5. 지역 달평균 온도조회 6.지역 연평균 온도 7. 끝내기");
			int select = sc.nextInt();
			switch (select) {
			case 1:
				wd.temp_record_1();
				// 글쓰기
				break;
			case 2:
				wd.read();
				break;
			case 3:
				wd.avg();
				break;
			case 4:
				wd.local();
				break;
			case 5:
				wd.local_avg();
				break;
			case 6:
				wd.local_yearavg();
				break;

			case 7:
				wd.rank();
				break;
			case 8:

				System.out.println("Good bye~!");
				run = false;
				break;
			// 종료 하기
			}

		}
	}
}
