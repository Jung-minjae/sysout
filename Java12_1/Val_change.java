package Java12_1;

public class Val_change {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		byte b = 10;
		short s = 20;
		int i = b;   //byte 형을 int 로 형변환
		long l = 100;
		int k = (int)l; // long형을 int 형으로 강제 형변환
		
		
		byte e = (byte)s;  // short 형을 byte 형으로 강제 형변환
		
		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		System.out.println(k);
		System.out.println(e);
	}

}
