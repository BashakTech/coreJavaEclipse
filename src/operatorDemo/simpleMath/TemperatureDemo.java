package operatorDemo.simpleMath;

import java.util.Scanner;

public class TemperatureDemo {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		double cels, farn;
		
		System.out.print("Enter celsius: ");
		cels = input.nextDouble();
		
		farn = (1.8 * cels ) + 32;
		
		System.out.println("Fahrenheit: " +farn);
		
	}

}
