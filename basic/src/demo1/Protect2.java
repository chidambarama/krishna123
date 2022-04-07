package demo1;

public class Protect2 {
	
	public static void main(String[] args) {
		
		System.out.println(Protect1.a);
		Protect1.m1();
		
		Protect1 a1=new Protect1();
		a1.m2();
		System.out.println(a1.s);
		
		
		
	}

}
