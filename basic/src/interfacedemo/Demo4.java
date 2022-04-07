package interfacedemo;

public class Demo4 implements Prgm3,Prgm4 {
	
	public void even()
	{
		int x=2;
		if(x%2==0)
		{
			System.out.println("even");
		}
	}
	
	public void odd()
	{
		int x=3;
		if(x%2!=0)
		{
			System.out.println("odd");
		}
	}
	
	public static void main(String[] args) {
		
		Demo4 a1=new Demo4();
		a1.even();
		a1.odd();
		
	}
	
	

}
