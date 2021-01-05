package Java12_7;

import java.io.IOException;

public class Keycode {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		boolean run = true;
		int speed = 0;
		int keycode = 0;

		while (run) {
			System.out.println("keycode:" + keycode);
			if (keycode != 13 && keycode != 10) {
				System.out.println("1.가속|2.감속|3.중지");
				System.out.println("선택:");
			}

			keycode = System.in.read();

			if (keycode == 49) {
				speed++;
				System.out.println("속도=" + speed);
			} else if (keycode == 50) {
				speed--;
				System.out.println("속도=" + speed);
			} else if (keycode == 51) {
				run = false;
			}

		}
	}

}
