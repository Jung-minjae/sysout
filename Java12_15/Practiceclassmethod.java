package Java12_15;

public class Practiceclassmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Identify id = new Identify();
	
		int age = id.age("LEE");
		
		System.out.println(age);
		
		String job[] = new String[5];
		job = id.job();
		for(String k : job) {
			System.out.println(k);
		}
	}

}
