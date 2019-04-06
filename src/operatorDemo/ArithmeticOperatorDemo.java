package operatorDemo;

import java.util.Scanner;

public class ArithmeticOperatorDemo {
	public static void main(String[] args) {
		
		int num1, num2, result;
		/*
		 * Arithmetic Operator are
		 * 		+ , - , * , /, %
		 * */
		//num1 = 30;
		//num2 = 5;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your 1st int number: ");
		num1 = scanner.nextInt();
		
		System.out.println("Enter your 2nd int number: ");
		num2 = scanner.nextInt();
		
		result = num1 + num2;
		System.out.println("num1 + num2 = " +result);
		
		System.out.println("num1 - num2 = "+(num1-num2));
		System.out.println("num1 * num2 = "+(num1*num2));
		System.out.println("num1 / num2 = "+(num1/num2));
		System.out.println("num1 % num2 = "+(num1%num2));
	}

}
