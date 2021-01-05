package Java12_8;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ArrayFile {

	public static void main(String[] args) {
		try {
			// TODO Auto-generated method stub
			File file = new File("C:\\workspace\\number.txt");
			Scanner sc = new Scanner(file);
			while (sc.hasNextLine()) {
				String str = sc.nextLine();
				String array[] = str.split("-| |@");
				
//				System.out.println(i);
				for (int i = 0;i< array.length; i++) {
					System.out.println(array[i]+"x"+array[i+1]+"="+array[i+2]);
					i+=2;
				}



			}
		} catch (FileNotFoundException e) {
			System.out.println(e);
		}

	}
}

