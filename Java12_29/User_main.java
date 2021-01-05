package Java12_29;

public class User_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ID();
		NAME();
		PASS();

	}

	public static void ID() {
		boolean run = true;
		User us = new User();
		User_scan scan = new User_scan();
		
		System.out.println("아이디를 입력해 주세요. (2~6자리)");
		while (run) {
			us.setID(scan.scan());
			if (us.getID().length() < 2 || us.getID().length() > 6) {
				System.out.println("잘못 입력하셨습니다. 2~6자리 아이디를 입력해주세요");
			} else {
				run = false;
			}
		}
	}

	public static void NAME() {
		User us = new User();
		User_scan scan = new User_scan();
		boolean run = true;

		System.out.println("이름을 입력해 주세요");

		while (run) {
			us.setNAME(scan.scan());
			if (us.getNAME().length() > 4) {
				System.out.println("잘못 입력하셨습니다. 4자리 이하의 이름을 입력해주세요.");
			} else {
				run = false;
			}
		}
	}

	public static void PASS() {
		boolean run = true;
		User us = new User();
		User_scan scan = new User_scan();
		
		System.out.println("비밀번호를 입력해 주세요. (8자리이하)");
		
		while (run) {
			us.setPASS(scan.scan1());
			if (us.getPASS() > 999999999) {
				System.out.println("잘못 입력하셨습니다. 8자리 이하의 비밀번호를 입력해주세요.");
			} else {
				run = false;
			}
			System.out.println("회원가입이 완료 되셨습니다!");
		}
	}
}
