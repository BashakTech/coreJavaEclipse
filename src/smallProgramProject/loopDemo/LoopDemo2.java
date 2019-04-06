package smallProgramProject.loopDemo;

import java.util.Scanner;

public class LoopDemo2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int sum = 0;
		int m, n, i;
		
		System.out.print("Enter initial number: ");
		m = input.nextInt();
		
		System.out.print("Enter final number: ");
		n = input.nextInt();
		
		for (i = m; i <= n; i++) {
			sum = sum + i;
		}
		
		System.out.println("The sum is = " +sum);

	}

}
