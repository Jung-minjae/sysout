package Java12_15;
import java.util.Scanner;
import java.util.Random;
public class Lotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		Random rdm = new Random();
		int [] lotto = new int[6];
		lotto[0] = rdm.nextInt(44)+1;
		System.out.println(lotto[0]);
		lotto = first(lotto[0]);
		
		for(int K :lotto) {
			System.out.println(K);
		}
	}
	
	public static int[] first(int k) {
		
		Random rdm = new Random();
		int[] lotto=new int[6];
		for(int i =1; i<6;i++) {
			
			lotto[i] = rdm.nextInt(44)+1;
			if (lotto[i]!=k) {
				lotto[i] = lotto[i];
			}
			else {
				lotto[i]=rdm.nextInt(44)+1;
			}
		}
		
		
		return lotto;
	}
}
