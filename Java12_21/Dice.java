package Java12_21;

public class Dice {

	private int dice1;

	public int getDice1() {
		return dice1;
	}

	public void setDice1(int dice1) {
		this.dice1 = dice1;
	}

	public void dice_play() {
		switch (dice1) {
		case 1:
			one();
			break;
		case 2:
			two();
			break;
		case 3:
			three();
			break;
		case 4:
			four();
			break;
		case 5:
			five();
			break;
		}
	}

	public void one() {
		System.out.println("1이 나왔습니다");
	}

	public void two() {
		System.out.println("2가 나왔습니다");
	}

	public void three() {
		System.out.println("3이 나왔습니다");
	}

	public void four() {
		System.out.println("4가 나왔습니다");
	}

	public void five() {
		System.out.println("5가 나왔습니다");
	}

}
