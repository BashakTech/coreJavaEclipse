package smallProgramProject.loopDemo;

import java.util.Scanner;

public class LoopDemo4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int sum = 0;
		int m, n, i;
		
		System.out.print("Enter initial number: ");
		m = input.nextInt();
		
		System.out.print("Enter final number: ");
		n = input.nextInt();
		
		for (i = m; i <= n; i++) {
			
			if (i % 2 == 1) {
				sum = sum + i;
				System.out.print("\t" +i);
			}
			
		}
		
		System.out.println();
		System.out.println("The sum is = " +sum);
	}

}
