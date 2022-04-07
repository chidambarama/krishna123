package abstract1;

public class Abconst1 extends Abconst {
	
	
	public Abconst1()
	{
		super(10,20);
		
	}
	
	
	
	public void m2()
	{
		System.out.println(" the sum is "+(1+1));
	}
	
	public static void main(String[] args) {
	
		Abconst1 a1=new Abconst1();
		a1.m2();
		System.out.println(a1.x);//10
		System.out.println(a1.y);//20
	 
		
		
	}

}
