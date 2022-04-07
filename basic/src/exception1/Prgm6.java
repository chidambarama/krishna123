package exception1;

public class Prgm6 {
	
		int x=10;
		String s="hello";
				
		
		public static void main(String[] args) {
			
			Prgm6 a1=null;
			try
			{
				System.out.println(a1.s);
			}
			
			catch(ArithmeticException e)
			{
				System.out.println("catching ArithmeticException");
				System.out.println(e.getMessage());
				
			}
			
			catch(NullPointerException e)
			{
				System.out.println("NullPointerException");
				System.out.println(e.getMessage());
			}
			
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("ArrayIndexOutofbounds exception");
				System.out.println(e.getMessage());
			}
			
		}
		
		
		
	

}
