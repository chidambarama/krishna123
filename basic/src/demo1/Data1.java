package demo1;

public class Data1 {
	private  int  a=10;
	private String b="qsp";
	
	
	public  int geta()
	{
		return a;
		
	}
	
	public String getb()
	{
		return b;
	}
	
	
	public  void seta(int a)
	{
		this.a=a;
		
	}
	
	
	public void setb(String b)
	{
		
	this.b=b;	
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		Data1 a1=new Data1();
		System.out.println(a1.a);
		System.out.println(a1.b);
	}

}
