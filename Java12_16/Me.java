package Java12_16;

import java.util.Scanner;

public class Me {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("아침에 일어납니다");
		System.out.println("씻고 버스를 타러갑니다");

		Bus Bus = new Bus();
		Bus.take(99);
		System.out.println("1. 카드를 찍습니다 2. 현금을 냅니다");
		int p = sc.nextInt();
		Bus.fee(p);

		System.out.println("학원에 도착합니다");
		School sch = new School();
		System.out.println("학교이름은 : " + sch.Schoo_name);
		System.out.println("강의 종목은 : " + sch.class_name);
		System.out.println(".");
		System.out.println(".");
		System.out.println(".");
		System.out.println(".");
		System.out.println("학원이 끝났습니다");
		System.out.println("회사에있는 여자친구를 데리러간다");

		Girlfriend gf = new Girlfriend();
		System.out.println(gf.company("on"));

		Smartphone sp = new Smartphone();
		System.out.println("현재 시간은");
		System.out.println(sp.time());

		System.out.println("시간이 남았으니 피시방에 간다");
		Game gm = new Game();
		System.out.println("피시방이름은" + gm.name);
		gm.my_game("on");
	
		System.out.println("계산할 숫자를 2개 선택하세요");
		int p1 = sc.nextInt();
		int p2 = sc.nextInt();
		System.out.println("계산할 연산자를 선택하세요\n 1. + 2. - 3. * 4. /");
		int p3 = sc.nextInt();
		Calculate ca = new Calculate(p1,p2,p3);
		if(p3==1) {
		System.out.println(ca.sum);
		}
		if(p3==2) {
			System.out.println(ca.min);
		}
		if(p3==3) {
			System.out.println(ca.dou);
		}
		if(p3==4) {
			System.out.println(ca.per);
		}
	}
}
