package Java12_17;
import java.util.Scanner;
public class Mycar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("차량의 최고속도를 선택하세요");
		int maxSpeed = sc.nextInt();
		
		
		Sonata mycar = new Sonata(maxSpeed,10,"장준현","red");
		
		mycar.run();
	}

}
