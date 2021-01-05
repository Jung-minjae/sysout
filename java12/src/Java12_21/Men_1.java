package Java12_21;
import java.util.Random;
public class Men_1 {
	
static int men1_weight = 50;
static int men1_floor ;
static int men2_weight = 40;
static int men2_floor ;
	public static void main(String[] args) {
		Random rdm = new Random();
		men1_floor =  rdm.nextInt(8)+2;
		men2_floor =  rdm.nextInt(8)+2;
		System.out.println("엘리베이터에 2남자가 탔습니다.");
		System.out.println("남자 1이 가고싶어 하는 층은 : "+men1_floor);
		System.out.println("남자 2가 가고싶어 하는 층은 : "+men2_floor);
		
		
		Ev ev = new Ev() ;
		
		ev.evweight(men1_weight, men2_weight);
		if(men1_weight+men2_weight<100) {
		ev.floor(men1_floor,men2_floor);
		
	}
	}

}
