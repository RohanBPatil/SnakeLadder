package SnakeLadderPackage;

public class SnakeLadder {
	public static void main(String[] args) {
		int player1_position = 0;
		int dice_num = (int)Math.floor(Math.random() * 10) % 6 + 1 ;
		System.out.println("Number on dice : "+dice_num);
	}
}
