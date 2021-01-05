package Java01_04gyujong;

	import java.util.Scanner;

	public class Class_A {

		public static void main(String[] args) {
			boolean run = true;
			Class_A_list list = new Class_A_list();
			list.Class_B_array = new Class_B[3];
			list.current = 0;

			while (run) {
				// 객체배열이 매개변수.
				@SuppressWarnings("resource")
				Scanner sc = new Scanner(System.in);
				System.out.println("--\n ★★★ 1.입력 2.출력 ★★★");
				int select = sc.nextInt();
				System.out.println("--");
				
				switch (select) {
				case 1:
					plus(list);
					break;
				case 2:
					print(list);
				}
			}
		}

		public static void plus(Class_A_list list) {
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			// 객체 생성 뒤, 값 입력
			Class_B B1 = new Class_B();
			System.out.println(list.current + 1 + "번째 배열의 첫번째 값 입력");
			B1.num_1 = sc.nextInt();
			System.out.println(list.current + 1 + "번째 배열의 두번째 값 입력");
			B1.num_2 = sc.nextInt();
			B1.num_3 = B1.num_1 + B1.num_2;
			
			// 매개변수 배열 객체에 값 담기
			list.Class_B_array[list.current] = B1;
			list.current++;
		}

		public static void print(Class_A_list list) {
			for (int i = 0; i < list.current; i++) {
				// B1 객체 다시 생성 뒤 값 담기.
				Class_B B1 = list.Class_B_array[i];
				System.out.println("첫번째 값 :: " + B1.num_1);
				System.out.println("두번째 값 :: " + B1.num_2);
				System.out.println("합 :: " + B1.num_3);
			}
		}
	}
