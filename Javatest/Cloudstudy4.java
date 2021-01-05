package Javatest;

public class Cloudstudy4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 돈까스 16인분, 칼국수 8인분, 왕만두 1인분을 시켰을때, 계산서를 출력 예와 같이 작성해 주세요. 가격표는 아래와 같습니다.
		
		int donprice = 8000;
		int kalPrice = 10000;
		 int kingPrice = 5000;
		 
		 int donNumber = 16; 
	        int kalNumber = 8; 
	        int kingNumber = 1;
	        
	        System.out.println("돈까스"+donNumber+"개 X "+donprice+"원 = "+(donprice*donNumber)+"원");
	        System.out.println("칼국수"+kalNumber+"인분 X "+kalPrice+"원 = "+(kalPrice*kalNumber)+"원");
	        System.out.println("왕만두"+kingPrice+"인분 X "+kingPrice+"원 = "+(kingPrice*kingNumber)+"원");

	}

}
