package abstract1;

public class Class2 extends Class1 implements Int1 {
	
	public void hungry()
	{
		System.out.println(" i am hungry");
	}
	
	public static void main(String[] args) {
		
		Class2 a1=new Class2();
		a1.hungry();
		a1.tea();
	}

}
