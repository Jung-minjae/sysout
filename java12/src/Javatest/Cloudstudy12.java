package Javatest;
import java.util.Scanner;
public class Cloudstudy12 {

//		문제
//		입력받은 키(m)와 몸무게(kg)를 토대로 BMI 지수를 계산하여 비만도를 측정 프로그램을 만들어 주세요.
//		요구사항
//		•비만도는 아래의 네 가지 단계로 구분 할 것. 
//		•저체중(18.5미만), 정상(18.5이상 ~ 25미만), 과체중(25이상~30미만), 비만(30이상)
//		BMI 지수란?
//		체질량 지수(體質量指數, Body Mass Index, BMI)는 인간의 비만도를 나타내는 지수로, 체중과 키의 관계로 계산된다. 키가 t 미터, 체중이 w 킬로그램일 때, BMI는 다음과 같다. - 위키피디아 -
//		•BMI = w / t^2
		
		    public static double calculateBMI(double weight, double tall) {
		        double bmi = weight/(tall*tall);
		        return bmi;
		    }

		    public static void printBMIClassification(double bmi) {
		        if(bmi>=30) {
		        	System.out.println("비만입니다");
		        }
		        else  if(bmi>=25&&bmi<30) {
		        	System.out.println("과체중입니다");
		        }
		        else  if(bmi>=18.5&&bmi<25) {
		        	System.out.println("정상입니다");
		        }
		        else {
		        	System.out.println("저체중입니다");
		        }
		    }

		    public static void main(String[] args) {
		        Scanner input = new Scanner(System.in);
		        System.out.println("몸무게를 입력하세요");
		        double weight = input.nextDouble();
		        System.out.println("키를 입력하세요");
		        double tall = input.nextDouble();

		        // BMI 지수 계산
		        double bmi = calculateBMI(weight, tall);
		        // BMI 지수를 입력하여 비만도 결과 출력
		        printBMIClassification(bmi);
		    }
		}
