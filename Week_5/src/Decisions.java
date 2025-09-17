import java.util.Scanner;

public class Decisions {

	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		int x = -10;
		
		// ==
		// !=
		// <= and >=
		// BOOLEANS: either true or false
		
		if(x > 0) {
			System.out.println("X is positive");
		}
		else {
			System.out.println("X is negative");
		}
		if(x % 2 == 0) {
			System.out.println("X is even");
		}
		else {
			System.out.println("X is odd");
		}
		
		int temp = 75;
		
		if (temp < 60) {
			System.out.println("Better wear a jacket and pants");
		}
		else if (temp < 70) {
			System.out.println("Wear a jacket and shorts");
		}
		else if (temp < 80) {
			System.out.println("Shorts and a tee");
		}
		else {
			System.out.println("AAAAAAAAAAAAA");
		}
		
		
		int age = 8;
		int height = 50;
		
		if (age > 7) {
			System.out.print("You are old enough ");
			if (height < 50) {
				System.out.println("but you are not tall enough");
			}
			else {
				System.out.println("and you are of sufficient altitude!");
			}
		}
		
		int weekday = 6;
		
	switch (weekday) {
		case 1:
			System.out.println("Sunday");
			break;
		case 2:
			System.out.println("Monday");
			break;
		case 3:
			System.out.println("Tuesday");
			break;
		case 4:
			System.out.println("Wednesday");
			break;
		case 5:
			System.out.println("Thursday");
			break;
		case 6:
			System.out.println("Friday");
			break;
		case 7:
			System.out.println("Saturday");
			break;
		default:
			System.out.println("The hell kinda fantasy world you living in?");
			break;
	}
	
	if (age < 7 || height < 50) {
		System.out.println("You may ride the ride");
	}
	else {
		System.out.println("You may not ride the ride");
	}
	
	// && is "and" in an if-then (use <=/>=); || is "or" (use >/<)
	// De Morgan's Laws!
	
	System.out.println("Enter a number: ");
	int num = input.nextInt();
	
	boolean isP = isPositive(num);
	
	if(isP) {
		System.out.println("Positive");
	}
	else {
		System.out.println("Negative");
	}
	
	// WHILE LOOPS for unknown number of loops, until some condition is met
	System.out.println("Enter a number between 1 and 6");
	int num2 = input.nextInt();
	
	while (num2 > 6 || num2 < 1) {
		System.out.println("That's not between 1 and 6. Try again.");
		num2 = input.nextInt();
	}
	
	System.out.println("You entered " + num2);
	
	
	}
	
	
	private static boolean isPositive(int num) {
		return num >= 0;
	}

}
