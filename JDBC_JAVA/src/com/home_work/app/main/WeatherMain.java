package com.home_work.app.main;
import com.home_work.app.console.WeatherConsole;

public class WeatherMain {

	public static void main(String[] args) {
		WeatherConsole wc = new WeatherConsole();
		exit:
		while(true) {
			int menu = wc.choice_menu();
			switch(menu) {
			case 1:
				wc.temp_management();
				break;
			case 2:
				wc.temp_search();
				break;
			case 3:
				wc.location_management();
				break;
			case 4:
				wc.location_search();
				break;
			case 5:
				wc.user_management();
				break;
			case 6:
				wc.user_ranking();
				break;
			case 7:
				System.out.println("");
				break exit;
			}
		}

	}

}
