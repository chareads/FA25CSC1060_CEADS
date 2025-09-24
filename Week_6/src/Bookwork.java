// STRINGS, BABY

import java.util.Scanner;

public class Bookwork {
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		String fruit = "banana";
		for(int i= 0; i < fruit.length(); i++) {
			System.out.println(fruit.charAt(i)); // prints word vertically
		}
		
		char first = fruit.charAt(0); // first letter is at "zeroth place"
		char last = fruit.charAt(fruit.length()-1);
		
		String firstHalf = fruit.substring(0, fruit.length()/2);
		String lastHalf = fruit.substring(fruit.length()/2);

		System.out.printf("%s, %s, %s, %s%n", first, last, lastHalf, firstHalf); //%n = new line
		
		int index = fruit.indexOf("a", 4); // looks for "a" AFTER character in place 4

		System.out.println(index);
		
		System.out.println("Enter a word: ");
		String word = input.next();
		if(word.equals("hello")) {
			System.out.println("You got it!");
		} else {
			System.out.println("Womp womp womp.");
		}
		
		String lady = "Ada Lovelace";
		String gent = "Alan Turing";
		if(lady.compareTo(gent) < 0) {
			System.out.println(lady);
		} else {
			System.out.println(gent);
		}
		System.out.println(lady.compareTo(gent)); // A=A, d is 8 less than L
		
		String newWord = String.format("%s %s %s", gent, lady, word);
		System.out.println(newWord);

	}

}
