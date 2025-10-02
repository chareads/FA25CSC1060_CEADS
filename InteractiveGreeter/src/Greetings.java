import java.util.Scanner;

public class Greetings {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("What is your name? ");
		String name;
		name = in.nextLine();
		
		System.out.println("Where are you from? ");
		String home;
		home = in.nextLine();
		
		System.out.println("How old are you? ");
		String age;
		age = in.nextLine();
		
		System.out.println("Hello, " + name + " from " + home + ". You are " + age + " years old.");
		
		System.out.println("What's your favorite hobby? ");
		String hobby;
		hobby = in.nextLine();
		System.out.println("Have fun with " + hobby + "!");
		
		System.out.println("How much money will you donate today? ");
		String cash;
		cash = in.nextLine();
		System.out.println("Thank you for your generous donation of " + cash + "!");

	}

}
