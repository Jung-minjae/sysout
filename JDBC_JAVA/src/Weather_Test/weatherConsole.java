package Weather_Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class weatherConsole {
	weather wt = new weather();
	Connection con = wt.con;
	
	public int Choice() { // �޴�

		Scanner sc = new Scanner(System.in);
		System.out.println("�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
		System.out.println("1.���� �Է� 2. ���� update 3. ���� insert 4. ����update 5. �������� 6.������߰� 7.����� ���� 8.��������� 9, ������)");
		int menu = sc.nextInt();

		return menu;
	}

	public void input() {

		Scanner sc = new Scanner(System.in);
		boolean run = true;

		System.out.println("�⵵�� �Է��Ͻÿ�.");
		String year = sc.next();

		System.out.println("�� �Է��Ͻÿ�.");
		int months = sc.nextInt();
		String month = null;

		if (months < 10) {
			month = "0" + Integer.toString(months);
		} else {
			month = Integer.toString(months);
		}

		System.out.println("�ִ� �ϼ��� �Է��Ͻÿ�.");
		int days = sc.nextInt();

		System.out.println("������ȣ�� �Է��Ͻÿ�.");
		int locID = sc.nextInt();
		int j = 0;
		System.out.println("����� �̸��� �Է��ϼ���");
		String str = sc.next();

		for (int i = 1; i < days + 1; i++) {
			System.out.println("�µ��� �Է��ϼ���");
			int temp = sc.nextInt();

			String day = null;

			if (i < 10) {
				day = "0" + Integer.toString(i);
			} else {
				day = Integer.toString(i);
			}

			String temp_day = year + month + day;

			String sql = "insert into temp(Date, Temp, locID, writer)values(?,?,?,?)";

			try {

				PreparedStatement psmt = con.prepareStatement(sql);
				psmt.setString(1, temp_day);
				psmt.setInt(2, temp);
				psmt.setInt(3, locID);
				psmt.setString(4, str);
				j++;
				if (j == 4) {
					j = 0;
				}
				int result = psmt.executeUpdate();
				if (result == 1) {
					System.out.println("���������� �Է� �Ǿ����ϴ�.");
				} else {
					System.out.println("�Էµ��� ���߽��ϴ�.");
				}

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public void update() {
		

		Scanner sc = new Scanner(System.in);
		System.out.println("�����Ͻ� ��¥�� �Է����ּ���");
		String Date = sc.next();

		System.out.println("�����Ͻ� �µ��� �Է����ּ���");
		int temp = sc.nextInt();

		System.out.println("�����Ͻ� ���� ��ȣ�� �Է����ּ���");
		int locid = sc.nextInt();

		System.out.println("���� �Ͻź��� ���̵� �Է����ּ���");
		String writer = sc.next();

		String sql = "update temp set (Temp= ?, locId= ?, writer= ?) where Date= ?";
		try {
			
			PreparedStatement psmt = con.prepareStatement(sql);
		
			psmt.setInt(1, temp);
			psmt.setInt(2, locid);
			psmt.setString(3, writer);
			psmt.setString(4, Date);

			int result = psmt.executeUpdate();

			System.out.println(result);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
	}

}
