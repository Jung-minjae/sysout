package Codetest;

public class Test4_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		int num = 0;

		while (sum < 100) {
			++num;
			if (num % 2 == 0)
				sum -= num;
			else
				sum += num;
		}
		System.out.println(num + "일 때, 총합이 " + sum + "이 된다.");

	}

}
