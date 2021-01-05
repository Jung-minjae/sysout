package Javatest;

public class Cloudstudy13 {

	
		// TODO Auto-generated method stub
		//		문제
		//		회사의 직원들에게 지급할 임금을 계산하는 프로그램을 작성해주세요.
		//		요구사항
		//		•직원의 임금은 주급으로 정산하며, (근무시간) X (기본시급)을 기준으로 한다.
		//		•주당 근무시간이 40시간을 초과시, 초과급여는 (초과시간) X (기본시급) X (1.5)으로 한다.
		//		•기본시급은 최저 $8.00이며, 이보다 작을 경우 에러를 출력한다.
		//		•주당 근무시간이 60시간을 초과하는 경우 에러를 출력한다.

		public static void printPay(double basePay, int hours) {
	        double pay ;
	        if(hours>40 && basePay>8 &&hours<60) {
	       double pay1 = (hours-40)*basePay*1.5;
	               pay = 40*basePay;
	        System.out.println(pay+pay1);
	       
	        }
	       
	        else if(hours>60 ) {
	        	System.out.println("ERROR: 제한 근무시간 초과");
	        }
	        else {
	        	System.out.println("ERROR: 최저시급 불이행");
	        }
	        
	    }

	    public static void main(String[] args) {
	        printPay(7.50, 35);
	        printPay(8.20, 47);
	        printPay(10.00, 73);
	    }
	}


