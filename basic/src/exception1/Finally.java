//finally block is used to writing closing statements such as database connection closing //file closing statements.

//finally block will excecute even if exception occurs or not.

package exception1;

public class Finally {
	public static void main(String[] args) {
		try
		{
			int []arr=new int[4];
			//arr[10]=2;
			System.out.println(arr[10]);
		}
		
		catch(Exception c)
		{
			System.out.println(c.getMessage());
			
			
		}
		
		finally
		{
			System.out.println("closing connection");
		}
		
		
		System.out.println("hello");
		
	}

}
