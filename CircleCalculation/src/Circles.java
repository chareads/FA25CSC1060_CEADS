import java.util.Scanner;

public class Circles {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double radius;
		double diameter;
		double area;
		double circ;
		
		System.out.println("What is the radius? ");
		radius = in.nextDouble();
		
		// turn radius into diameter
		diameter = makeDiameter(radius);
		// turn radius into area
		area = makeArea(radius);
		// turn radius into circumference
		circ = makeCirc(radius);
		
		// print results
		System.out.printf("Diameter: %.2f \n", diameter);
		System.out.printf("Area: %.2f \n", area);
		System.out.printf("Circumference: %.2f \n", circ);

	}

	private static double makeCirc(double radius) {
		double circ;
		circ = 2 * Math.PI * radius;
		return circ;
	}

	private static double makeArea(double radius) {
		double area;
		area = Math.PI * radius * radius;
		return area;
	}

	private static double makeDiameter(double radius) {
		double diameter;
		diameter = radius * 2;
		return diameter;
	}

}
