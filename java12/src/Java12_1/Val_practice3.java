package Java12_1;

public class Val_practice3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// = ex) A=10 할 때 씀
		// == 같다 ex) A==B
		// != 틀리다 ex)A!=B  !=boolean   boolean b= 'true' !b='false'
		//&& and 
		//<작다 <= 작거나같다 >크다  >=크거나 같다
		//i++ = 1씩 더해라  ++i
        // i += 10  --> i에 10을 더한다
		// i -= 10  --> i에 10을 뺀다
		
		int i = 10;
		int j = 20;
		
		int sum = i +j;
		int k = sum*i;
		System.out.println("sum1: "+sum);
		i++;
		i++;
		
		
		sum++;
		++sum;
		int l=sum*i;
		
		
		
		System.out.println("sum2: "+sum);
		
		System.out.println(sum);
		System.out.println(k);
		System.out.println(l);
		
		
		
	}

}
