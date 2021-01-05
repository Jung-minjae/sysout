package Java12_1;

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 80;
		int j = 20;
		
		double b = (double)(j)/(double)(i);
		double b_1 = b*100;
		System.out.println(b_1+"%");
		
		double b_2 = (double)(j)/(double)(i)*100;
		System.out.println(b_2+"%");
		
		double b_3 = (double)j/i;
		System.out.println(b_3);
		double b_4 =(double) b_3*100;
		System.out.println(b_4+"%");
	}

}
