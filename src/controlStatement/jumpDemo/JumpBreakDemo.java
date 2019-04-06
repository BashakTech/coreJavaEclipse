package controlStatement.jumpDemo;

public class JumpBreakDemo {
	public static void main(String[] args) {
		
		int i;
		
		for(i = 1; i <= 100; i++) {
			
			if(i == 10) {
				break;
			}
			
			System.out.println(i);
		}
	}

}
