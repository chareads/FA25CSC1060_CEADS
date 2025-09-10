import java.util.Scanner;

public class Methods {

	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		//public is an access modifier, could also be protected (only things inside this pckg can access), or private (nobody else can access)
		//static means you're "dealing from one deck of cards," not separate decks--it's all coming from this one thing
		//void is the "return"--what it's gonna spit out. could be an int, a float, a string, a boolean ... or nothing (void)
		//main is the name of the method, with arguments & parameters inside parentheses
		System.out.println("First line");
		newLine();
//		newLine();
//		newLine();
		System.out.println("Second line");
		threeLine();
		System.out.println("Third line");
		
		printTwice("Hello"); //void method, but it's taking a string ... creates string param
		
		printNTimes("Hello", 4); // prints 4x
		
		double root = Math.sqrt(17.0);
		System.out.printf("%.2f\n", root);
		
		System.out.println(Math.round(Math.toRadians(180.0)));
		
		String name = getName();
		System.out.println(name);
		
		//what is the radius
		//get input for radius
		//call the diameter method sending radius to it
		//call the area method sending radius to it
		//call the circumference method sending radius to it

	}
	private static String getName() {
		System.out.println("Enter your full name:");
		String name = input.nextLine();
		return name;
	}
	private static void printNTimes(String word, int num) {
		for(int i=0; i<num; i++)
		{
			System.out.print(word + " ");
		}
	}
	private static void printTwice(String word) {
		System.out.println(word);
		System.out.println(word);
		
	}
	private static void threeLine() {
		System.out.println();
		System.out.println();
		System.out.println();
		
	}
	public static void newLine()
	{
		System.out.println();
	}
	
}
