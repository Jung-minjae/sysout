package Java12_21;

public class Ev {
int maxfloor = 10;
int minfloor = 1;
int maxweight = 100;
int nowfloor;



public void evweight(int men1,int men2) {
	if (men1+men2>100) {
		System.out.println("정원초과입니다!!");
		
	}
	
}

public void floor(int men1, int men2) {
	
		System.out.println();
		System.out.println("문이 열립니다.");
		System.out.println();
		
	
		if(men1<men2) {
			System.out.println(men1+"층을 선택하셨습니다.");
			System.out.println(men2+"층을 선택하셨습니다.");
			System.out.println("문이 닫힙니다.");
			System.out.println(".");
			System.out.println(men1+"층입니다.");
			System.out.println("문이 열립니다.");
			System.out.println(".");
			System.out.println("문이 닫힙니다.");
			System.out.println(".");
			System.out.println(men2+"층입니다.");
			System.out.println("문이 열립니다.");
			
		}
		else if(men1>men2) {
			System.out.println(men1+"층을 선택하셨습니다.");
			System.out.println(men2+"층을 선택하셨습니다.");
			System.out.println("문이 닫힙니다.");
			System.out.println(".");
			System.out.println(men2+"층입니다.");
			System.out.println("문이 열립니다.");
			System.out.println(".");
			System.out.println("문이 닫힙니다.");
			System.out.println(".");
			System.out.println(men1+"층입니다.");
			System.out.println("문이 열립니다.");
			
		}
		else {
			System.out.println(men1+"층을 선택하셨습니다.");
			System.out.println("문이 닫힙니다.");
			System.out.println(".");
			
			System.out.println(men1+"층입니다.");
			System.out.println("문이 열립니다.");
		
		}
}




}