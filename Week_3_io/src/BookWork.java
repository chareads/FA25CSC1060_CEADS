import java.util.Scanner;

public class BookWork {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
//		System.out.println("Type Something");
//		String words = input.nextLine();
//		System.out.println(words);
//		
//		System.out.println("type one word");
//		String word = input.next();
//		System.out.println(word);
//		
//		input.nextLine(); //clears the nextLine buffer out, apparently this is a deeeep deep bug
//		
//		System.out.println("Type Something");
//		String words2 = input.nextLine();
//		System.out.println(words2);
		//ctrl + forward slash = comment out highlighted text
		
//		int inch;
		double cm;
		final double CM_PER_INCH = 2.54; //cm per inch will not change, all caps for const variables
		final int IN_PER_FOOT = 12;
//		System.out.println("How many inches?");
//		inch = input.nextInt();
//		cm = inch * CM_PER_INCH;
//		
//		System.out.printf("in = %d and cm = %.2f", inch, cm);
//		
//		System.out.println(4.0/3.0);
//		System.out.printf("Four thirds = %.3f", 4.0/3.0);
		
//		String num = "73";
//		int iNum = 73;
//		System.out.println(2 + Integer.parseInt(num)); //without integer.parseint this would just concatenate 2+73 = 273
//		
//		double pi = 3.14159;
//		int x = (int) pi;
//		System.out.println(x); // this will just be 3 since it's an integer
		
		int feet = 76/12;
		int inches = 76%12; // % in math shit is modulus, aka remainder
		int remainder;
		
		System.out.print("exactly how many cm?");
		cm = input.nextDouble();
		inches = (int)(cm / CM_PER_INCH);
		feet = inches / IN_PER_FOOT;
		remainder = inches % IN_PER_FOOT;
		System.out.printf("%.2f cm = %d ft, %d in \n", cm, feet, remainder);

	}

}
