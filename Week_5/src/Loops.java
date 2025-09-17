import java.util.Scanner;

public class Loops {

	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		// THE WHILE LOOP (unknown number of iterations)
		int num = 10; // initialization
		while(num > 0) { // conditions of loop
			System.out.println(num); // what do you do each loop
			num = num - 1; // changer (can also be written num--
		}
		System.out.println("Blast off!");
		
		// THE FOR LOOP (known number of iterations)
		for(int i = 10; i > 0; i--) {
			System.out.println(i);
		}
		System.out.println("Blast off again!");
		
		// NESTED LOOPS FOR MULTIPLICATION TABLES
		System.out.println("Enter the number of rows");
		int rows = input.nextInt();
		System.out.println("Enter the number of columns");
		int cols = input.nextInt();
		
		for(int i = 1; i <= rows; i++) {
			for(int j = 1; j <= cols; j++) {
				System.out.printf("%4d", i*j); // 4 means 4 spaces wide no matter how many spaces the number takes
			}
			System.out.println(); // ADD A LINE BREAK
		}
		
		for(char c = 'A'; c <= 'Z'; c++) {
			System.out.print(c);
		}
		System.out.println("\nGreek Alphabet"); // \n gives you a new line
		for(int i = 913; i <= 937; i++) {
			System.out.print(((char) i));
		}

	}

}

// thurs class: triangles & bottles of beer!
