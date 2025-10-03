import java.util.Scanner;

public class ExamAnswers {

	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		// call method for Q2
		messagePrinter();
		// call method for Q3
		beverageSelector();
		// call method for Q4
		divider();
		// call method for Q5
		accumulator();
	}

	// method for Q2
	private static void messagePrinter() {
		System.out.println("This is my first programming test");
	}
	
	// method for Q3
	private static void beverageSelector() {
		System.out.println("Which beverage would you like?");
		int drink = input.nextInt();
		
		switch (drink) {
		case 1:
			System.out.println("Water");
			break;
		case 2:
			System.out.println("Coke");
			break;
		case 3:
			System.out.println("Coffee");
			break;
		}
		
	}
	
	// method for Q4
	private static void divider() {
		System.out.println("Enter first number: ");
		float input1 = input.nextFloat();
		System.out.println("Enter second number: ");
		float input2 = input.nextFloat();
		
		while (input2 == 0) {
			System.out.println("Enter a second number that ISN'T zero: ");
			input2 = input.nextFloat();
		}
		float answer = input1 / input2;
		System.out.printf("The answer is %.2f when you divide %.2f by %.2f \n", answer, input1, input2);
		
	}
	
	// method for Q5
	private static void accumulator() {
		float number;
		float total;
		System.out.println("Enter a number: "); // get an initial number
		number = input.nextFloat();
		total = number; // set that as the initial total
		
		while (number != 0) { // keep asking for more until user inputs 0
			System.out.println("Enter another number: ");
			number = input.nextFloat();
			total = total + number; // add current number to running total
		}
		System.out.printf("Total: %.2f", total); // print total
		
	}

}
