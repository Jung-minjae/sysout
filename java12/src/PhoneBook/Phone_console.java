package PhoneBook;

import java.util.Scanner;

public class Phone_console {
	private Phone_list list = new Phone_list();

	public void input() {
		Scanner sc = new Scanner(System.in);
		Phone_book pb = new Phone_book();
		String name;
		String number;
		String mail;
		
		System.out.println(1 + "�� ������ �Է����ּ���.");
		name= sc.next();
		System.out.println(1 + "�� ��ȭ��ȣ�� �Է����ּ���.");
		number = sc.next();
		System.out.println(1 + "�� �̸����� �Է����ּ���.");
		mail = sc.next();
		
		list.add(name, number, mail);
	}
	
	public void output() {
		for (int i = 0; i < list.size(); i++) {
			Phone_book pb = list.get(i);
			System.out.println("----" + (i + 1) + "�� ��----");
			System.out.println("���� :: " + pb.getName());
			System.out.println("��ȭ��ȣ :: " + pb.getNumber());
			System.out.println("�̸��� :: " + pb.getMail());
		}
	}
}