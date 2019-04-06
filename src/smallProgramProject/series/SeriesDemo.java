package smallProgramProject.series;

import java.util.Scanner;

public class SeriesDemo {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n, i;
		int sum = 0;
		
		System.out.print("Enter the last number: ");
		n = input.nextInt();
		
		for (i = 1; i <= n; i = i + 1) {
			
			System.out.print(" " +i);
			sum = sum + i;
		}
		System.out.println("\n");
		System.out.println(sum);
	}

}
