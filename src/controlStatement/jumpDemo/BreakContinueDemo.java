package controlStatement.jumpDemo;

public class BreakContinueDemo {
	public static void main(String[] args) {
		
		int x;
		
		for(x = 1; x <= 200; x++) {
			
			if(x == 100) {
				continue;
			}
			
			if(x > 50) {
				break;
			}
			
			System.out.println(x);
		}
	}

}
