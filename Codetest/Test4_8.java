package Codetest;

public class Test4_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i <= 10; i++) {
			for (int j = 0; j <= 10; j++) {
				int bang = (2 * i + 4 * j);
				if (bang == 10) {
					System.out.println("x: " + i + ", y: " + j);
				}
			}
		}

	}

}
