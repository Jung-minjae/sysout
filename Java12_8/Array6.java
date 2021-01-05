package Java12_8;

public class Array6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int nums[] = { 1, 2, 3, 4, 5, 6, };
		String str = "ABCDE";
		char c = ' ';
		// nums 4 랑 str D랑 곱해보기
//
//		for(int i=0; i<nums.length;i++) {
//			int nums_1 = nums[i];
//			if (nums_1==4) {
//				
//				break;
//			}
//			
//		}
		
		for (int j =0; j<str.length();j++) {
			//String sub = str.substring(j,j+1);
//			if(sub.equals("D")) {
				
			c = str.charAt(j);
			if(c=='D') {
				break;
			}
			
		}
		int sum =nums[4]*c;
		System.out.println(sum);
		
		
		
//		int a = nums[4];
////		String sub = str.charAt(index)
//		c = str.charAt(3);
//		// int sub_int = Integer.parseInt(sub);
//        int c1 = c;
//		int b = a * c1;
//		System.out.println(b);

		
	}

}
