package Java12_14;
import java.util.Scanner;
public class Practicemethod1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		
		System.out.println("몇 항을 계산 하시겠습니까?");
		
		int n = sc.nextInt();
		int array[] = new int[n];
		int sum= 0;
		int min = 0;
		for(int i=0; i<n; i++) {
			System.out.println(i+1+"번째 숫자를 선택하세요");
			 array[i] = sc.nextInt();
		 
			
		}
		
		System.out.println("어떤 연산을 하시겠습니까? \n 1.+ 2.- 3.* 4./");
		int a = sc.nextInt();
		
		switch(a) {
		
		case 1: System.out.println("+를 선택하셨습니다 ");
			for(int j =0; j<n; j++) {
//					 sum += array[j];
//				}
//			System.out.println(sum);
		 sum = plus(sum,array[j]);
		
			}
			 System.out.println(sum);
		    break;
		case 2: System.out.println("-를 선택하셨습니다 ");
			for(int j =0; j<n; j++) {
				 min = minus(min,array[j],j);
			}
			System.out.println(min);
			break;
		case 3: System.out.println("*를 선택하셨습니다 ");
			break;
		case 4: System.out.println("/를 선택하셨습니다 ");
			break;
	}
		
	}
	public static int plus(int sum ,int array)  {
		
			 sum += array;
		
	
	return sum;
	}
	
	public static int minus(int mine, int array, int j) {
		if (j==0) {
			 mine =array;
		}
		else {
			mine-=array;
		}
		return mine;
	}
	
	
}
