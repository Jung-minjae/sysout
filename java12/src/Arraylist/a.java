package Arraylist;

import java.util.ArrayList;

public class a {
	public static void main(String[] args) {
		ArrayList<Integer> number = new ArrayList<Integer>();
		int sum = 0;

		for (int i = 0; i <= 100; i++) {
			number.add(i);
		
		}
		for (int i = 0; i < number.size(); i++) {

			if (number.get(i) % 2 == 0) {
				number.remove(i);
			System.out.println(number);
			}

		}

	}

}