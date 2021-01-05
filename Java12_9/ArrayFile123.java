package Java12_9;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ArrayFile123 {

	public static void main(String[] args) {
		try {
			// TODO Auto-generated method stub
			File file = new File("C:\\workspace\\number_1.txt");
			Scanner sc = new Scanner(file);
			
			while (sc.hasNextLine()) {
				String str = sc.nextLine();
				String sub = "";
				int idx[] = new int[str.length()];
				System.out.println(str);
				for(int i = 0; i<str.length();i++) {
					sub = str.substring(i,i+1);
					if(sub.equals("+")) {
						int j = 0;
						j++;
						idx[j]=i;
					}
				}
				for (int i = 0; i<idx.length;i++) {
					System.out.println(idx[i]);
				}
			}
		}
			 catch (FileNotFoundException e) {
				System.out.println(e);
			}

		
	}
	}