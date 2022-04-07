package casting;

public class Prgm2 {
	
	public static void main(String[] args) {
		
		Prgm2 a1=new Prgm2();
		
		Prgm1 a2=new Prgm1();
		
		Prgm2 a3=null;
		
		System.out.println(a1 instanceof Prgm2);
		System.out.println(a2 instanceof Prgm1);
		
		System.out.println(a3 instanceof  Prgm2);
		
		
	}

}
