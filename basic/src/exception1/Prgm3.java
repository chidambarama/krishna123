package exception1;

public class Prgm3 {
	public static void main(String[] args) {
		int x=10;
		int y=0;
		System.out.println("hello");
		try
		{
			System.out.println("entering try block");
			System.out.println(x/y);//causing exception
			System.out.println("exiting try block");
		}
		
		catch(ArithmeticException c)
		{
			System.out.println("entering catch block");
			System.out.println(c.getMessage());
			System.out.println("exiting catch block");
		}
		
		System.out.println("hi");
		System.out.println("good evening");
		System.out.println("busy day");
	}

}
