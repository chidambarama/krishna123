package demo2;
import demo1.Protect1;
public class Protect3 extends Protect1 {
	
	public static void main(String[] args) {
		System.out.println(Protect1.a);
		Protect1.m1();
		Protect3 a1=new Protect3();
		a1.m2();
		System.out.println(a1.s);
		
		
	}

}
