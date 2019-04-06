package controlStatement.selection;

import java.util.Scanner;

public class IfSelectionFirst {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int x, y;
		
		System.out.printf("Enter your 1st Value: ");
		x = scanner.nextInt();
		System.out.printf("Enter your 2nd Value: ");
		y = scanner.nextInt();
		
		System.out.println();
		if(x > y) {
			System.out.println("x is greater than y");
		}
	}

}
