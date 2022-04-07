//in order to handle multiple exceptions we can include multiple try catch blocks 
package exception1;

public class Prgm8 {

	public static void main(String[] args) {
		try
		{
			System.out.println(10/0);
		}
		
		catch(Exception c)
		{
			System.out.println("catch 1");
			System.out.println(c.getMessage());
		}
		
		try
		{
			int []arr=new int[5];
			arr[6]=0;
			System.out.println(arr[6]);
		}
		
		catch(Exception c)
		{
			System.out.println("catch 2");
			System.out.println(c.getMessage());
			
		}
	}
}
