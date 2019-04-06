package smallProgramProject.loopDemo;

public class LoopDemo {
	public static void main(String[] args) {
		
		int sum = 0;
		int i;
		
		for (i = 1; i <= 10; i++) {
			
			sum = sum + i;
		}
		
		System.out.println("The sum is: " +sum);
	}

}
