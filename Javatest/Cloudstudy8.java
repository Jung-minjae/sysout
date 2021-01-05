package Javatest;

public class Cloudstudy8 {

	public static void printSquare(int x) {
        System.out.println(x * x);   //한변이 x인 사각형 넓이
    }
    public static void main(String[] args) {
        int value = 2;
        System.out.println(value);  // 한변의 길이가 2
        printSquare(value);  // 한변의 길이가 2인 사각형 넓이
        printSquare(3); //한변의 길이가 3인 사각형 넓이
        printSquare(value * 2); //한변의 길이가 2*2 인 사각형 넓이

	}

}
