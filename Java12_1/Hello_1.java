package Java12_1;

import java.text.SimpleDateFormat;

public class Hello_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Hello Java");  


long time = System.currentTimeMillis(); 



SimpleDateFormat dayTime = new SimpleDateFormat("yyyy년 mm월 dd일 aa hh시 mm분 ss초");

String s = dayTime.format(time);
System.out.println(s);

	}
}
