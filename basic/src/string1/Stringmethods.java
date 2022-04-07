package string1;

public class Stringmethods {
	public static void main(String[] args) {
		String s="qspiders";
		String s1="QSPIDERS";
		String s2=" hebbal";
		String s3=" hi everyone how are you all";
		
		System.out.println("length of the String is "+s.length());
		System.out.println("char present at index 3 is "+s.charAt(3));
		char ch[]=s.toCharArray();
			System.out.println("char array elements are");
			for(int i=0;i<ch.length;i++)
			{
				System.out.println(ch[i]);
			}
			System.out.println("index of q in String "+s.indexOf('q'));
			System.out.println("index of s in String is "+s.indexOf('s'));
			System.out.println("last index of s in string is "+s.lastIndexOf('s'));
			System.out.println("substring from index 4 is "+s.substring(4));
			System.out.println("substring from index 6 is "+s.substring(6));
			System.out.println("substring of string from index 2 to 5 is "+s.substring(2, 5));
			System.out.println("do string contain spider?"+s.contains("spider"));
			System.out.println("loercase s1 is "+s1.toLowerCase());
			System.out.println("upper case s is "+s.toUpperCase());
			System.out.println("concat of s and s2 is "+s.concat(s2));
			System.out.println(s.compareTo(s2));//s-8//s2--7
			System.out.println(s2.compareTo(s));//s2--7 and s-8);
			System.out.println(s2.replace('b', 's'));
			String[] ch1=s3.split(" ");
			for(int i=0;i<ch1.length;i++)
			{
				System.out.println(ch1[i]);
			}
			
	}

}
