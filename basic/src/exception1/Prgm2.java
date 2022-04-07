package exception1;

public class Prgm2 {

	public static void main(String[] args) {
	System.out.println("main starts");	
		try
		{
			System.out.println("try starts");
			int a=4,b=0;
			int c=a/b;
			System.out.println("the value of c");
			System.out.println("try ends");
		}
		
		
		catch(ArithmeticException c)
		{
			System.out.println("in the catchblock starts");
			System.out.println("in catch block ends");
			
		}
		
		System.out.println("main ends");
		
	}
}
