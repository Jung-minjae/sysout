package Java12_8;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ArrayFile1 {

	public static void main(String[] args) throws IOException {
		//파일을 불러와서 수정하기
			
			File file = new File("C:\\workspace\\text.txt");
			File file_1 = new File("C:\\workspace\\test.txt");
			try(FileWriter fileWriter = new FileWriter(file))  {
				Scanner sc = new Scanner(file_1);
				String str = "";
				String array[]=null;
//				System.out.println("1111");
				while (sc.hasNextLine()) {
				str = sc.nextLine();
				array = str.split("-|@| ");
				}
				
				PrintWriter pw = new PrintWriter(fileWriter);
				for (int i = 0; i< array.length; i++) {
				pw.print(array[i]+"||");
			}
			}
				catch (FileNotFoundException e) {
				System.out.println(e);
				
			}
			
	}
}



//				Scanner sc = new Scanner(file);
//				(FileWriter fileWriter = new FileWriter;
//			Scanner sc = new Scanner(file);
//			while (sc.hasNextLine()) {
//				String str = sc.nextLine();
//				String array[] = str.split("-| |@");
//				
////				System.out.println(i);
//				for (int i = 0;i< array.length; i++) {
//					System.out.println(array[i]+"x"+array[i+1]+"="+array[i+2]);
//					i+=2;
//				}
//
//
//
//			}
//		} catch (FileNotFoundException e) {
//			System.out.println(e);
//		}

	


