package Java12_8;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;



public class Array4 {

	public static void main(String[] args) {
		try {
		// TODO Auto-generated method stub
		File file = new File("C:\\workspace\\number.txt");
		Scanner sc = new Scanner(file);
		while(sc.hasNextLine()) {
			String str = sc.nextLine();
			String array[]=str.split("-| |@");
			for (int i =0; i<array.length;i++) {
				System.out.println(array[i]);
			}
			
		}

//		System.out.println(scan.useDelimiter("\\z").next());
		
	}catch (FileNotFoundException e) {
		System.out.println(e);
	}


}
}

