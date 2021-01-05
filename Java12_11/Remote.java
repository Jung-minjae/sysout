package Java12_11;

import java.util.Scanner;

public class Remote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		boolean power = false;
		int chanul = 1;
		int sound = 10;
		while (run) {

			System.out.println("리모콘 어떤버튼을 누르시겠습니까?\n 1. ⓘ 전원버튼 \n 2. ◀ 음량 줄이기 3. ▶ 음량 높이기 \n 4. ↓ 채널 아래로 5. ↑ 채널 위로"
					+ "\n 6. (번호입력) \n       1   2   3\n       4   5   6\n       7   8   9\n           0");

			int button = sc.nextInt();

			switch (button) {

			case 1:
				System.out.println("전원버튼을 누릅니다");
		
				power = !power;		
				
				if (power == true) {
					System.out.println("TV를 켰습니다");
					System.out.println();

				}
				if (power == false) {
					System.out.println("TV를 껐습니다");
					sound = 10;
					chanul = 1;
				}

				break;

			case 2:
				if (power == true) {

					sound = sound_1(sound);
//					if (sound == 0) {
//						System.out.println("음량이 0 입니다. 더이상 음량을 내릴 수 없습니다. ");
//					} else {
//						System.out.println("음량을 줄입니다");
//						sound = sound - 1;
//						System.out.println(sound);
//					}
				}
				if (power == false) {
					System.out.println("화면이 꺼진상태입니다");
			
				}
				break;

			case 3:
				if (power == true) {
					sound = sound_2(sound);
//					if (sound == 40) {
//						System.out.println("음량이 40 입니다. 더이상 음량을 올릴 수 없습니다. ");
//					} else {
//						System.out.println("음량을 높입니다");
//						sound = sound + 1;
//						System.out.println(sound);
//					}

				}
				if (power == false) {
					System.out.println("화면이 꺼진상태입니다");
				}
				break;

			case 4:
				if (power == true) {
					chanul = chanul_1(chanul);
				
//					if (chanul > 1 && chanul <= 100) {
//						chanul = chanul - 1;
//						System.out.println("채널을 내립니다");
//						System.out.println(chanul);
//
//					} else if (chanul == 1) {
//						//int chanul1 = chanul();
//						chanul = 100;
//						System.out.println("채널을 내립니다");
//						System.out.println(chanul);
//					}
				}
				if (power == false) {
					System.out.println("화면이 꺼진상태입니다");
				}
				break;

			case 5:
				if (power == true) {
					chanul = chanul_2(chanul);
//					if (chanul >= 1 && chanul < 100) {
//						chanul = chanul + 1;
//						System.out.println("채널을 올립니다");
//						System.out.println(chanul);
//
//					} else if (chanul == 100) {
//						chanul = 1;
//						System.out.println("채널을 올립니다");
//						System.out.println(chanul);
//					}

				}
				if (power == false) {
					System.out.println("화면이 꺼진상태입니다");
				}
				break;

			case 6:
				if (power == true) {
					chanul = chanul_3(chanul);
//					System.out.println("채널을 입력하세요");
//					int input = sc.nextInt();
//					chanul = input;
				}
				if (power == false) {
					System.out.println("화면이 꺼진상태입니다");
				}
				break;
			}

		}
	}

	
	public static int chanul_1(int chanul) {
		
		if (chanul > 1 && chanul <= 100) {
			chanul = chanul - 1;
			System.out.println("채널을 내립니다");
			System.out.println(chanul);

		} else if (chanul == 1) {
			//int chanul1 = chanul();
			chanul = 100;
			System.out.println("채널을 내립니다");
			System.out.println(chanul);
		}

		return chanul;

	}
	
	public static int chanul_2(int chanul) {
		if (chanul >= 1 && chanul < 100) {
			chanul = chanul + 1;
			System.out.println("채널을 올립니다");
			System.out.println(chanul);

		} else if (chanul == 100) {
			chanul = 1;
			System.out.println("채널을 올립니다");
			System.out.println(chanul);
		}
		return chanul;
	}
	
	
	public static int sound_1(int sound) {
		if (sound == 0) {
			System.out.println("음량이 0 입니다. 더이상 음량을 내릴 수 없습니다. ");
		} else {
			System.out.println("음량을 줄입니다");
			sound = sound - 1;
			System.out.println(sound);
		}
		
	return sound;
	}
	
	public static int sound_2(int sound) {
		if (sound == 40) {
			System.out.println("음량이 40 입니다. 더이상 음량을 올릴 수 없습니다. ");
		} else {
			System.out.println("음량을 높입니다");
			sound = sound + 1;
			System.out.println(sound);
		}
		return sound;
	}
	public static int chanul_3(int chanul) {
		Scanner sc = new Scanner (System.in);
		System.out.println("채널을 입력하세요");
		int input = sc.nextInt();
		chanul = input;
		return chanul;
	}
	
}
