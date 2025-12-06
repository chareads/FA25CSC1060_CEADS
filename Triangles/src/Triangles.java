import java.util.Scanner;

public class Triangles {

	public static void main(String[] args) {
		int size = 0;
		char fill;
		boolean go = true; // going to check this later to see if we need to run it again
		
		Scanner in = new Scanner(System.in);
		
		while (go) {
			System.out.println("Enter triangle size (1-50): ");
			size = in.nextInt();
			
			while (size < 1 || size > 50) { // keep pestering until size is in range
				System.out.println("Try again, between 1 and 50: ");
				size = in.nextInt();
			}
			
			System.out.println("Enter fill character: "); // any char will do
			fill = in.next().charAt(0);
			
			for (int i = 0; i < size; i++) { // "rows"
				for (int j = size; j > i; j--) {
					System.out.print(" "); // space buffers, one fewer per row
				}
				for (int k = 0; k <= i; k++) { // actual fill characters
					System.out.print(fill + " ");
				}
				System.out.println();
			}
			
			char check; // flip that go boolean if necessary
			System.out.println("Go again Y/N?: ");
			check = in.next().charAt(0);
			
			while (check != 'Y' && check != 'N') { // make sure it's a valid input
				System.out.println("Invalid; enter Y or N: ");
				check = in.next().charAt(0);
			}

			if (check == 'N') {
				go = false; // breaks the loop
				System.out.println("Thanks for triangling!");
			}
		}
	}

}
