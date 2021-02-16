package Test_Arraylist;

import java.util.Scanner;
import java.util.ArrayList;

public class Flied_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Flied_val> fv = new ArrayList<Flied_val>();
		fv.add(new Flied_val("薑團營1", "********"));
		fv.add(new Flied_val("wjdalswp11@naver.com", "薑團營1", "********"));
		
		fv.get(0);
		System.out.println(fv.get(0).id);
		System.out.println(fv.get(0).name);
		System.out.println(fv.get(0).password);
	
	}
}
