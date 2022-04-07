package string1;

public class Prgm3 {
	public static void main(String[] args) {
		StringBuffer s1=new StringBuffer("java");
		StringBuffer s6=new StringBuffer("java");
		s1.append("class");
		System.out.println("String buffer");
		System.out.println(s1.hashCode());
		System.out.println(s6.hashCode());
		System.out.println(s1.equals(s6));
		
		StringBuilder s2=new StringBuilder("manual");
		StringBuilder s5=new StringBuilder("manual");
		s2.append("testing");
		System.out.println("String builder");
		System.out.println(s2.hashCode());
		System.out.println(s5.hashCode());
		System.out.println(s2.equals(s5));
		
		String  s3=new String("selenium");
		String s4=new String("selenium");
		s3.concat("class");
		System.out.println("String class");
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
		System.out.println(s3.equals(s4));
	}
	

}

// toString() of object class is overriden in string,string builder,string buffer but, hashcode() and equals() of object class are
//overidden in string but not overriden in StringBuffer and StringBuilder.
