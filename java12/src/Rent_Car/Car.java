package Rent_Car;

public class Car {

	private String name;// 대여한 사람이름
	private int pick;
	private String number;// 대여한사람 전화번호

	public int getPick() {
		return pick;
	}

	public void setPick(int pick) {
		this.pick = pick;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

}
