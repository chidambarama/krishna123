package interfacedemo;

public class Demo3 extends Demo2{
	
	public void mul()
	{
		int x=4,y=5;
		System.out.println("the prod is "+(x*y));
	}
	
	public static void main(String[] args) {
		Demo3 a1=new Demo3();
		a1.add();
		a1.sub();
		a1.mul();
		
		
	}

}
