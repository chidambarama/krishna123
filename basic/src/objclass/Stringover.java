package objclass;

public class Stringover {
	
	public String toString()
	{
		return "hi everyone";
	}

	
	public int hashCode()
	{
		return 23333;
	}
	public static void main(String[] args) {
		final int []arr=new int[2];
		Stringover a1=new Stringover();
		System.out.println(a1.toString());
		System.out.println(a1.hashCode());
		
		Stringover a2=new Stringover();
		System.out.println(a2.hashCode());
		
		
		
		
	}
}
