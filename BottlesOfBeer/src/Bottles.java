import java.util.Scanner;

public class Bottles {

	public static void main(String[] args) {
		int num;
		System.out.println("Enter starting number of bottles: ");
		Scanner in = new Scanner(System.in);
		num = in.nextInt();
		
		int i = num;
		String plur = " bottles of beer";
		String sing = " bottle of beer";
		String wall = " on the wall";
		String take = "Take one down, pass it around, ";
		String store = "Go to the store and buy some more, ";
		String vari;
		String varj;

		while (i >= 0) {
			int j = i-1;
			if (i == 1) {
				vari = sing;
			}
			else {
				vari = plur;
			}
			if (j == 1) {
				varj = sing;
			}
			else {
				varj = plur;
			}
			System.out.println(i + vari + wall + ", " + i + vari + ",");
			if (j > -1) {
				System.out.println(take + j + varj + wall + "!");
				System.out.println("");
			}
			else {
				System.out.println(store + num + varj + wall + "!");
			}
			i--;
		}
	}
}
