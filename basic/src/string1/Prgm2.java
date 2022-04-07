package string1;

public class Prgm2 {
	public static void main(String[] args) {
		
		StringBuffer a1=new StringBuffer("java");
		a1.append("class");
		System.out.println("StringBuffer object "+a1 );
		
		StringBuilder a2=new StringBuilder("java");
		a2.append("class");
		System.out.println("StringBuilder object is "+a2);
		
		String a3=new String("java");
		a3.concat("class");
		System.out.println("string object is "+a3);
	}

}
