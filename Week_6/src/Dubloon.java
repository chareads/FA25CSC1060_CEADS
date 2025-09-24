import java.util.Scanner;

public class Dubloon {
	// dubloon = every letter appears in word exactly twice
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the word: ");
		String word = input.next();
		
		System.out.println(isDubloon(word));
		
		isDubloon(word);

	}
	private static boolean isDubloon(String word) {
		int count;
		for (int i = 0; i < word.length(); i++) {
			count = 0;
			for (int j = 0; j < word.length(); j++) {
				char one = word.charAt(i);
				char two = word.charAt(j);
				if(one == two) {
					count++;
				}
			}
			if(count != 2)return false;
		}
		return true;
		
	}

}
// do exercise 6 scrabble thing