package exception1;

public class Prgm4 {
public static void main(String[] args) {
	int[]a1=new int[3];
	
	try
	{
		a1[0]=1;
		System.out.println(a1[0]);
		a1[1]=2;
		System.out.println(a1[1]);
		a1[2]=3;
		System.out.println(a1[2]);
		a1[3]=4;
		System.out.println(a1[3]);
		System.out.println("end of the program");
		}
	
	catch(ArrayIndexOutOfBoundsException c1)
	{
		System.out.println("entering catch block");
		System.out.println(c1.getMessage());
	}
	
}
}
