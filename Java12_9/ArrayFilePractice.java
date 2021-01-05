package Java12_9;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ArrayFilePractice {

	public static void main(String[] args) {
		try {
			// TODO Auto-generated method stub
			File file = new File("C:\\workspace\\number_1.txt");
			Scanner sc = new Scanner(file);
			
			while (sc.hasNextLine()) {
				String str = sc.nextLine();
				String sub = "";
				//int idx[] = new int[str.length()];
				System.out.println(str);
			for(int i = 0; i<str.length();i++) {
				sub = str.substring(i,i+1);
				if(sub.equals("+")) {
					System.out.println(i);
				}
					if(sub.equals("-")) {
						System.out.println(i);
					
				}
					if(sub.equals("*")) {
						System.out.println(i);
						
					}
					
			}
			String sub1 = str.substring(0,2);
			String sub2 = str.substring(3,6);
			String sub3 = str.substring(7,10);
			String sub4 = str.substring(11,str.length());
			
			int a = Integer.parseInt(sub1);
			int b = Integer.parseInt(sub2);
			int c = Integer.parseInt(sub3);
			int d = Integer.parseInt(sub4);
//			System.out.println(sub2);
			int sum = a+b+c+d;
			System.out.println(sum);
			}
		}
			 catch (FileNotFoundException e) {
				System.out.println(e);
			}

		
	}
	}

//int idx1 = sub.indexOf(i);
//System.out.println(idx1);