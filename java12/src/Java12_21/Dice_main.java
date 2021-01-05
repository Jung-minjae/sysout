package Java12_21;

import java.util.Random;

public class Dice_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random rdm = new Random();

		int dice1 = rdm.nextInt(5);

		Dice dice = new Dice();
		dice.setDice1(dice1);

		dice.dice_play();

	}
}