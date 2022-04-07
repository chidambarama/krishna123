package abstract1;

public class Prgm6 extends Prgm5{
	
	public void mul(int a,int b)
	{
		
		int c=a*b;
		System.out.println(" the mul of 2 nos are "+c);

	}
	
	public static void main(String[] args) {
		
		
		Prgm6 a1=new Prgm6();
		a1.add();
		a1.mul(10, 20);
	}

}
