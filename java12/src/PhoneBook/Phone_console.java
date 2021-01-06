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
		
		System.out.println(1 + "번 성함을 입력해주세요.");
		name= sc.next();
		System.out.println(1 + "번 전화번호를 입력해주세요.");
		number = sc.next();
		System.out.println(1 + "번 이메일을 입력해주세요.");
		mail = sc.next();
		
		list.add(name, number, mail);
	}
	
	public void output() {
		for (int i = 0; i < list.size(); i++) {
			Phone_book pb = list.get(i);
			System.out.println("----" + (i + 1) + "번 값----");
			System.out.println("성함 :: " + pb.getName());
			System.out.println("전화번호 :: " + pb.getNumber());
			System.out.println("이메일 :: " + pb.getMail());
		}
	}
}