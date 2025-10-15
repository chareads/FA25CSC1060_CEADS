
public class Bookwork {

	public static void main(String[] args) {
		// we're doing RECURSION oh boyyy
		countdown(10);
		System.out.println(factorial(5));
		for (int i = 0; i < 5; i++) { // KEEP i UNDER 40 LMAO THIS WILL ANNIHILATE YOUR RAM
			System.out.print(fibonacci(i) + ", ");
			if(i % 10 == 0)System.out.println();
		}
		
		System.out.println();
		displayBin(255);
		System.out.println();
		System.out.println(triangle(10));

	}
	
	private static int triangle(int i) {
		int sum = 0;
		for (int j = 0; j <= i; j++) {
			sum += j;
		}
		return sum;
		
	}

	private static void displayBin(int i) { // super simple binary converter
		if(i > 0) {
			displayBin(i / 2);
			System.out.print(i % 2);
		}
		
	}

	public static void countdown(int n) {
		// recursion loops w/o for or while, then stops
		// base case:
		if(n == 0) {
			System.out.println("Blast off!");
		}
		else {
		countdown(n - 1); // call THE SAME METHOD to take n and subtract one from it
		// recursion is rough on memory bc it's gotta store everything all at once
		System.out.println(n); // LAST IN FIRST OUT << if this goes before countdown(n-1) it'll print in reverse??? ladder up ladder down
		}
	}
	
	public static int factorial(int n) {
		if(n==0) {
			return 1;
		}
		int recurse = factorial(n-1);
		int result = n * recurse;
		return result;
	}
	
	//she fibbin' on my nacci til i--
	public static int fibonacci(int n) {
		if(n==0) return 0;
		if(n==1 || n==2) return 1; // set the first three numbers, then do the actual calculations ...
		return fibonacci(n-1) + fibonacci(n-2);
	}

}
