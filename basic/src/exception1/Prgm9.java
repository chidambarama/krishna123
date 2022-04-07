//if exception is handled in m2.
package exception1;

public class Prgm9 {
	public static void main(String[] args) {
		System.out.println("main starts");
		m1();
		System.out.println("main ends");
	}
	
	
	public static void m1()
	{
		System.out.println("m1 starts");
			m2();
		System.out.println("m1 ends");
	}
	
	
	public static void m2()
	{
		System.out.println("m2 starts");
		
		try {
			m3();
		}
		
		catch(Exception c)
		{
			System.out.println(c.getMessage());
		}
		System.out.println("m2 ends");
	}
	
	
	public static void m3()
	{
		System.out.println("m3 starts");
		System.out.println(10/0);
		System.out.println("m3 ends");
	}

}
