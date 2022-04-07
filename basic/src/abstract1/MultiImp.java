package abstract1;

public class MultiImp implements Multichild {
	
	public void m1()
	{
		System.out.println("in the m1 of the parent 1");
	}
	
	public void m2()
	{
		System.out.println("in the m2 of the parent 2");
	}
	
	public void m3()
	{
		System.out.println("in the m3 of child");
	}
	
	
	public static void main(String[] args) {
		MultiImp a1=new MultiImp();
		a1.m1();
		a1.m2();
		a1.m3();
	}

}
