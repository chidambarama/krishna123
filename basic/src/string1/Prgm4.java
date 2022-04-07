package string1;

public class Prgm4 {
	public static void main(String[] args) {
		
		int x=1;
		 Integer y=x;//implicit boxing
		 System.out.println(y);
		 System.out.println(y.hashCode());
		 
		 double z=2.1;
		 Double a=Double.valueOf(z);//explicit boxing
		 System.out.println(a);
		 System.out.println(a.hashCode());
	
		 
		 
		 				 int x1=y;//implicit unboxing
		 				 System.out.println(x1);
		 				 
		 				 
		 				 double a1=a.doubleValue();//explicit unboxing
		 				 	System.out.println(a1);
	
	
	}
	
	

}
