package demo2;
import demo1.Public1;
public class Public2 {	
public 	double d=3.45;
public static void m2()
{
	
	System.out.println("inside the method m2");
}

public static void main(String[] args) {
	
	m2();
	Public2 a2=new Public2();
	System.out.println(a2.d);
	System.out.println(Public1.a);
	Public1 a1=new Public1();
	a1.m1();
	
	
}

}
