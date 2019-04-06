package operatorDemo;

public class AssignmentOperatorDemo {
	public static void main(String[] args) {
		/*
		 * Assignment Operator are:
		 * 		=	+=	-=	*=	/=	%=
		 * */
		int x = 3;
		int y = 2;
		
		System.out.println("int x = " +x);
		System.out.println("int y = " +y);
		
		x +=y;  // x = x+y; x = 3+2= 5;
		System.out.println("\nx = " +x);
		
		x -=y;  // x = x-y; x = 5-2= 3;
		System.out.println("x = " +x);
		
		x *=y;  // x = x*y; x = 3*2= 6;
		System.out.println("x = " +x);
		
		x /=y;  // x = x/y; x = 6/2= 3;
		System.out.println("x = " +x);
		
		x %=y;  // x = x%y; x = 2%2= 1;
		System.out.println("x = " +x);
		
		
	}

}
