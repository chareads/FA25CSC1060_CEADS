import java.util.Scanner;
import java.util.Arrays;

public class StringSorting {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("How many strings? ");
		int numStrings = in.nextInt();
		
		String[] inputs = new String[numStrings];
		System.out.println("Enter a string: ");
		for (int i = 0; i < numStrings+1; i++) { // SOMETHING here is wrong ...
			inputs[i] = in.nextLine(); 
		}
		
		boolean alpha;
		bubble(inputs, true);
		bubble(inputs, false);

	}

	private static void bubble(String[] inputs, boolean alpha) {
		int n = inputs.length;
		if (alpha) { // alphabetical
			for (int i = 0; i < n-1; i++) {
				for (int j = 0; j < n-i-1; j++) {
					if (inputs[j].compareTo(inputs[j+1]) > 0) {
						String temp = inputs[j];
						inputs[j] = inputs[j+1];
						inputs[j+1] = temp;
					}
				}
			}
		}
		else { // reverse alphabetical
			for (int i = 0; i < n-1; i++) {
				for (int j = 0; j < n-i-1; j++) {
					if (inputs[j].compareTo(inputs[j+1]) < 0) {
						String temp = inputs[j+1];
						inputs[j+1] = inputs[j];
						inputs[j] = temp;
					}
				}
			}
		}
		System.out.println(Arrays.toString(inputs));
	}

}
