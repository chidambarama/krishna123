package exception1;

public class Prgm7 {
	
	public static void main(String[] args) {
		
		try
		{
			System.out.println(10/0);
		}
		
		catch(Exception c)
		{
			System.out.println("generalised");
			System.out.println(c.getMessage());
			
		}
		
//		//catch(ArrayIndexOutOfBoundsException c)//cte
//		{
//			System.out.println("specialised");
//			System.out.println(c.getMessage());
//			
//		}
		
	}

}
