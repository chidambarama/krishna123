package demo1;

public class Protect1 {
	protected static int a=2;
	protected String s="chidu";
	
	protected static void m1()
	{
		System.out.println("in the static method");
	}
	
	protected void m2()
	{
		System.out.println("in the non static method");
	}
	
	public static void main(String[] args) {
		System.out.println(a);
		m1();
		Protect1 a1=new Protect1();
		System.out.println(a1.s);
		a1.m2();
	}

}
