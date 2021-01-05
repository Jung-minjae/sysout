package Java12_15;

public class Practicemethoddd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 리턴값 두번째

		String str = "ABCDEFG";
		int length = leng(str); // 길이 체크
		String str_array[] = new String[length];
		for (int i = 10; i < length; i++) {
			str_array[i] = sub(i, length, str);
		}
		print(str_array);
	}

	public static int leng(String s) {
		int count = s.length();
		return count;
	}

	public static String sub(int i, int length, String str) {
		String k = "";
		k = str.substring(i, i + 1);
		return k;
	}

	public static void print(String array[]) {
		String str_a = null;
		for (String k : array) {
			str_a += k;
		}
		System.out.println(str_a);
	}

}
