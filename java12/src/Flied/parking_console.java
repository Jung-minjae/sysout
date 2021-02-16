package Flied;

import java.text.SimpleDateFormat;
import java.util.Scanner;

public class parking_console {
	private Scanner sc = new Scanner(System.in);
	private parking pk = new parking();
	private SimpleDateFormat format = new SimpleDateFormat("HH시mm븐ss초");

	public void Do() {
		System.out.println("================================");
		System.out.println("|         주차차량 정보입력         |");
		System.out.println("================================");

		if (pk.get().size() == 50) {

			System.out.println("주차공간이 없어서 현재 주차를 할수없습니다.");
		} else {
			String Car_number;
			String pk_time;
			System.out.println(". 차량 번호 :");
			Car_number = sc.next();

			pk_time = format.format(System.currentTimeMillis());
			System.out.println(". 현재 시간 : " + pk_time + " 주차를 시작합니다.");
			pk.add(Car_number, pk_time);
		}

	}

	public void List() {
		System.out.println("================================");
		System.out.println("|      주차공간 및 차량 리스트       |");
		System.out.println("================================");
		String[] spl_1 = new String[100];
		int[] str_num_1 = new int[1];
		String str_sum_1;

		String[] spl_2 = new String[100];
		int[] str_num_2 = new int[1];
		String str_sum_2;

		String usage_time = format.format(System.currentTimeMillis());
		int use;
        int fee=3000;
		for (int i = 0; i < pk.get().size(); i++) {
			//주차 당시 시간
			Car_list car = pk.get().get(i);
			String sub_1 = car.getPk_time().substring(0, 5); // 시간이랑 분까지만 자름 ex 12시 30분/
			spl_1 = sub_1.split("\\시"); //스플릿으로 시 단어 빼고 숫자만 배열에 담음    ex 12,30

			str_sum_1 = spl_1[i] + spl_1[i + 1]; //String 더하기로 String인 숫자끼리 더함  ex 1230;
			str_num_1[i] = Integer.parseInt(str_sum_1);  // String인 숫자를  int형으로 변환  Ex int 1230;
			
			//조회 시간
			String sub_2 = usage_time.substring(0, 5); 
			spl_2 = sub_2.split("\\시");

			str_sum_2 = spl_2[i] + spl_2[i + 1];  
			str_num_2[i] = Integer.parseInt(str_sum_2);  
			
              use=str_num_2[i]-str_num_1[i];//주차 이용 시간
              if(use>30&&use<60) {
            	  fee+=1000;
              }else if(use>=60) {
            	  fee+=2000;
              }
			
			int space = 50 - pk.get().size();

			System.out.println("\t. 현재 주차가능 공간은 : " + space);

			System.out.println(". 차량 번호 : " + car.getCar_number());
			System.out.println(". 주차 등록 시간 : " + car.getPk_time());
			System.out.println(". 주차 이용 시간 : " + use+" 분");
			System.out.println(". 주차 요금 : " + fee+" 원" );
			System.out.println("--------------------------------------------");

		}
//		for (int k : str_num_1) {
//			System.out.println(k);
//		}

	}

	

}