package Codingtest;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.text.SimpleDateFormat;

public class Smart {
	String list[] = { "1. 어머니 : 01012341234", "2. 아버지 : 01012344321", "3. 동생 : 01043214321", "4. 여자친구 : 01043211234",
			"5. 친구1 : 01012345678", "6. 친구2 : 01087654321" };

	public void telelist() {

		for (String k : list) {
			System.out.println(k);
		}
	}

	public void call(int ch1) {

		System.out.println(list[ch1 - 1] + "에 전화를 겁니다.");

	}

	public void nowtime() {
		long time = System.currentTimeMillis();

		SimpleDateFormat simpl = new SimpleDateFormat(" aa hh시 mm분 ss초");
		//yyyy년 MM월 dd일
		String s = simpl.format(time);

		System.out.println(s);
	}

	public void search() {
		System.out.println("네이버를 실행합니다");

		try {
			Desktop.getDesktop().browse(new URI("http://www.naver.com/"));
		} catch (IOException e) {
			e.printStackTrace();
		} catch (URISyntaxException e) {
			e.printStackTrace();
		}
	}
}

