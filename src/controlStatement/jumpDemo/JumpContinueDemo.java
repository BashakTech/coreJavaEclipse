package controlStatement.jumpDemo;

public class JumpContinueDemo {
	public static void main(String[] args) {
		
		int x;
		
		for(x = 1; x <= 100; x++) {
			
			if(x == 15) {
				continue;
			}
			
			System.out.println(x);
		}
	}

}
