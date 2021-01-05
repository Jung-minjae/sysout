package Javatest;
import java.util.Scanner;
public class Cloudstudy11 {

//	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//		뼈대 코드를 토대로 조건문을 사용하여 나이를 입력하면 성인, 청소년, 어린이, 유아를 구분하는 프로그램을 만들어 주세요. 기준은 아래와 같습니다.
		//		•성인: 만 18세 이상
		//		•청소년: 만 13세 이상
		//		•어린이: 만 6세 이상
		//		•유아: 만 5세 이하

		    public static String getRole(int age) {
		       if(age>=18) {
		        return "성인";
		    }
		       else  if(age>=13) {
			        return "청소년";
			    }
		       else  if(age>=6) {
		    	   return "어린이";
		       }
		       else   {
		    	   return "유아";
		       }
		    }
		       public static void main(String[] args) {
		        Scanner input = new Scanner(System.in);
		        System.out.println("나이를 입력해 주세요");
		        int age = input.nextInt();
		        String role = getRole(age);
		        System.out.println(role);
		    }
		}

		
	


