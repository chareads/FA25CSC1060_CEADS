import java.util.Scanner;

public class Conversion {

	public static void main(String[] args) {
		double fahrenheit; // declare variable/create bucket
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter a temperature in degrees Fahrenheit: "); // get input temperature
		fahrenheit = in.nextDouble();
		
		double celsius;
		celsius = (fahrenheit - 32)*5/9; // convert F->C
		System.out.print("That's " + celsius + " degrees Celsius");
		
		double kelvin;
		kelvin = celsius + 273.15; // convert C->K
		System.out.println(", or " + kelvin + " degrees Kelvin.");

	}

}
