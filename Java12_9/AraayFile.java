package Java12_9;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class AraayFile {

	public static void main(String[] args) {
		try {
			// TODO Auto-generated method stub
			File file = new File("C:\\workspace\\number_1.txt");
			Scanner sc = new Scanner(file);
			
			while (sc.hasNextLine()) {
				String str = sc.nextLine();
				String array[] = str.split("\\+|-|\\*");
				int idx = str.indexOf("+");
				System.out.println(idx);
				//String plus = str.substring(idx,idx+1);
				String sub_1 = str.substring(0,idx);
				String sub_2 = str.substring(idx,str.length());
				int a = Integer.parseInt(sub_1);
				int b = Integer.parseInt(sub_2);
				int c = a+b;
				System.out.println(c);
				
//				for(int i = 0; i<array.length;i++) {
//					String sub = str.substring(0,1);
//					System.out.println(sub);
					
					
				}
				//for (int i = 0;i< array.length; i++) {
//					System.out.println(array[i]+"x"+array[i+1]+"="+array[i+2]);
//					i+=2;
				//}
			
			}
		
		 catch (FileNotFoundException e) {
			System.out.println(e);
		}

	
}
}
//while (sc.hasNextLine()) {
//	String str = sc.nextLine();
//	String array[] = str.split("-| |@");
//	
////	System.out.println(i);
//	for (int i = 0;i< array.length; i++) {
//		System.out.println(array[i]+"x"+array[i+1]+"="+array[i+2]);
//		i+=2;
//	}
