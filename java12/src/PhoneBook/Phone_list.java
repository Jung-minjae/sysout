package PhoneBook;

import java.util.Scanner;

public class Phone_list {
	private Phone_book[] array;
	private int current;

	public Phone_list() {
		array = new Phone_book[3];
		current = 0;
	}

	public void add(String name, String number, String mail) {
		Phone_book pb = new Phone_book();
		pb.setName(name);
		pb.setNumber(number);
		pb.setMail(mail);

		if (array.length == current) {
			Phone_book[] temp = new Phone_book[array.length + 5];
			for (int i = 0; i < array.length; i++) {
				temp[i] = array[i];
			}
			array = temp;
		}
		array[current] = pb;
		current++;
	}

	public int size() {
		return current;
	}

	public Phone_book get(int i) {
		return this.array[i];
	}
}