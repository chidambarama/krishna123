package exception1;

public class Prgm5 {
	public static void main(String[] args) {
		String s="chidu";
		System.out.println("inside the main method");
		try
		{
			System.out.println(s.charAt(0));
			System.out.println(s.charAt(1));
			System.out.println(s.charAt(2));
			System.out.println(s.charAt(3));
			System.out.println(s.charAt(4));
			System.out.println(s.charAt(5));
			
		}
		
		catch(StringIndexOutOfBoundsException e )
		{
			System.out.println("inside the catch block");
			System.out.println("display message "+e.getMessage());
			System.out.println("outside the catch block");
		}
		
		System.out.println("end of the prgm");
		
	}

}//Just writing the catch block and not writing the correct exception then default exception handler will handle it.
