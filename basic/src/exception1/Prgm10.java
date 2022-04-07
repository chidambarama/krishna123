package exception1;

import java.io.IOException;

public class Prgm10 {

	public static void main(String[] args) throws IOException {
		System.out.println("main starts");
		m1();
		System.out.println("main ends");
		
	}
	
	public static void m1() throws IOException
	{
		System.out.println("m1 starts");
		m2();
		System.out.println("m1 ends ");
	}
	
	public static void m2() throws IOException
	{
		System.out.println("m2 starts");
		m3();
		System.out.println("m2 ends ");
	}
	
	public static void m3() throws IOException
	{
		System.out.println("m2 starts");
		throw new IOException();

	}
	
	
	
}
