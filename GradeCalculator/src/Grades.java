import java.util.Scanner;

public class Grades {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double grade;
		System.out.println("Enter your grade: ");
		grade = in.nextDouble();
		
		// take care of invalid numbers
		while (grade < 0) {
			System.out.println("That's not a valid grade. Try again: ");
			grade = in.nextDouble();
		}
		
		// output letter grade
		if (grade < 60) {
			System.out.println("Your grade is F");
		} else if (grade < 67) {
			System.out.println("Your grade is D");
		} else if (grade < 69) {
			System.out.println("Your grade is D+");
		} else if (grade < 72) {
			System.out.println("Your grade is C-");
		} else if (grade < 77) {
			System.out.println("Your grade is C");
		} else if (grade < 79) {
			System.out.println("Your grade is C+");
		} else if (grade < 82) {
			System.out.println("Your grade is B-");
		} else if (grade < 87) {
			System.out.println("Your grade is B");
		} else if (grade < 89) {
			System.out.println("Your grade is B+");
		} else if (grade < 92) {
			System.out.println("Your grade is A-");
		} else if (grade >= 92) {
			System.out.println("Your grade is A");
		}
	}

}
