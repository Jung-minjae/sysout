package Java12_9;

public class Arraytest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// P.298 ex7),ex8)

		// 배열의 크기르르 계산하는 프로그램

		int cc[] = { 100, 200, 300, 400, 500 };
		int len;

		len = cc.length * Integer.BYTES;
		System.out.printf("배열 cc[]가 차지하는 메모리 공간은 %d입니다.\n",len);

		int[][] aa = new int[3][4];
		int val = 1;
		int i = 0;
		
		while (i < 3) {
			int k = 0;
			while (k < 4) {

				aa[i][k] = val;
				val++;
				
				k++;
				System.out.println(val);
			}
			
			i++;
			
		}
		
	}

}
