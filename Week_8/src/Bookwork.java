import java.util.Random;

public class Bookwork {

	public static void main(String[] args) {
		int[] counts; // an array of counts, unspecified length, but it's all integers
		double[] values; // an array of values, unspecified length, all doubles <- DECLARE
		
		counts = new int[10];
		
		int[] otherCounts = new int[4];
		
		values = new double[10];
		String poem = "The quick brown fox jumps over the lazy dog";
		
		String[] words = poem.split(" "); // without space will print letter by letter, with space will print word by word
		
		int[] arr = {1,2,3,4,5,6,7,8};
		
		System.out.println(counts[1]); // will give zero
		System.out.println(words[2]); // will give null--not even zero, there's nothing there, just the box you created
		System.out.println(arr[3]); // will give a 4, since arr has stuff in the bucket
		System.out.println(arr); // will give the MEMORY LOCATION of the array
		
		// traversing an array: go forward or backwards one element at a time
		
		for(int i = 0; i < counts.length; i++) {
			counts[i] = i; // sets numbers to 0 1 2 3
		}
		System.out.println("Other Counts at 2 is " + otherCounts[2]); // otherCounts gets filled by same for loop as counts
		for(int i = 0; i < counts.length; i++) {
			System.out.println(counts[i]); // prints what's in counts array
		}
		
		// printArray(arr);
		printArray(arr);
	//	copyArrays(counts, otherCounts);
		System.out.println();
		
		int index = search(arr, 5);
		System.out.println("Five is located at index " + index);
		
		
		fillArray(counts);
		printArray(counts);
		System.out.println();
		for(int num : counts) { // only cares about the contents of the buckets, not the locations; can't do much with this
			System.out.println(num);
		}

	}


	private static void fillArray(int[] counts) {
		Random rand = new Random();
		for (int i=0; i < counts.length; i++) {
			counts[i] = rand.nextInt(100) + 1;
		}
		
	}


	private static int search(int[] arr, int target) {
		for (int j = 0; j < arr.length; j++) {
			if(arr[j] == target) return j;
		}
		return -1;
	}


	private static void printArray(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " "); // not printline, just print: won't print 1 word per line
			if(i==4) System.out.println(); // new line after 5th word
		}
		
	}
	
//	private static void copyArrays(int[] counts, int[] otherCounts) {
//		for (int i= 0; i< counts.length; i++); {
//			otherCounts[i] = counts[i];
//		}
//		
//	}



}
