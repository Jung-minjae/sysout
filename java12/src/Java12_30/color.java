package Java12_30;



public class color {
	 String [] color = {"검정색","빨간색","분홍색","노란색","흰색","파란색"};
	 String color_ch;
	

	public String color_choice(int color_choice) {
		
		
		
//		String color_ch = color[];
		switch(color_choice) {
		case 1 :
			System.out.println("검정색을 선택하셨습니다");
			 color_ch = this.color[0];
			
			break;
			
		case 2 :
			System.out.println("빨간색을 선택하셨습니다");
			  color_ch =this.color[1];
			  break;
		case 3 :
			System.out.println("분홍색을 선택하셨습니다");
			  color_ch = this.color[2];
			  break;
		case 4 :
			System.out.println("분홍색을 선택하셨습니다");
			  color_ch = this.color[3];
			  break;
		case 5 :
			System.out.println("분홍색을 선택하셨습니다");
			  color_ch = this.color[4];
			  break;
		}
		return color_ch;
		
		
	}
}
