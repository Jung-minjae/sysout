package Hudaphone;

import java.util.Scanner;

public class Book_list {
	Book[] books;
	int current;

	public Book_list() {
		this.books = new Book[5];
		this.current = 0;
	}

	public void input(Book_list list) {

		Scanner sc = new Scanner(System.in);
		System.out.println("�̸��� �Է� �ϼ���");
		String name = sc.nextLine();

		System.out.println("��ȣ�� �Է��ϼ���");
		String number = sc.nextLine();
		System.out.println("e-mail�� �Է��ϼ���");
		String email = sc.nextLine();
		Book book = new Book();
		
		book.setName(name);
		book.setNumber(number);
		book.setEmail(email);

		if (list.books.length == list.current) {
			Book[] temp = new Book[list.books.length + 5];
			for (int i = 0; i < list.books.length; i++) {
				temp[i] = list.books[i];
			}
			list.books = temp;
		}
		list.books[list.current] = book;
		list.current++;
	}

	public void output(Book_list list, int count) {
		for (int i = 0; i < count; i++) {
			Book book = list.books[i];
			String name = book.name;
			String number = book.number;
			String email = book.email;
			System.out.println("�ѤѤѤѤѤѤѤѤѤѤ�");
			System.out.println(i+1+"���� ��� ");
			System.out.println("�̸�:\t" + book.getName());
			System.out.println("��ȣ:\t" + book.getNumber());
			System.out.println("�̸���:\t" + book.getEmail());
		}

	}

	void output(Book_list list) {
		output(list, list.current);
	}

}
