package demo1;

public class Private1 {
	
	private static int a=45;
	private double  marks=21.2;
	
	private void m1()
	{
		
		System.out.println("inside the m1");
	}

	public static void main(String[] args) {
		
		System.out.println(a);
		
		Private1 a1=new Private1();
		System.out.println(a1.marks);
		a1.m1();
		
		
	}
	

}
