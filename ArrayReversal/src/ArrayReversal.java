import java.util.Scanner;
public class ArrayReversal {

	public static void main(String[] args) {
		int size = 100; // hard cap on length
		int[] nums = new int[size];
		int newNum = 0;
		int count = 0; // keeping track of where we stopped
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter values for array (-1 to stop): ");
		
		for (int i = 0; i < size; i++) {
			newNum = in.nextInt();
			nums[i] = newNum;
			if (newNum == -1) {
				size = count-1;
			}
			count++;
		}
		
		System.out.println("Mirror universe version: ");
		for (int i = count-2; i > -1; i--) { // print 'em backwards
			System.out.println(nums[i]);
		}

	}

}
