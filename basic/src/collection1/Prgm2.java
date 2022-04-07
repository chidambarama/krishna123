package collection1;

import java.util.ArrayList;

public class Prgm2 {
	public static void main(String[] args) {
		ArrayList a1=new ArrayList();
		a1.add(1);
		a1.add("java");
		a1.add('a');
		System.out.println("before adding a2 to a1, a1 :"+a1);
		
		ArrayList a2=new ArrayList();
		a2.add(10);
		a2.add("java");
		a2.add('s');
		a2.add(2.1);
		a1.addAll(a2);//adding a2 to a1
		System.out.println("after adding a2 to a1, a1 :"+a1);
		System.out.println("after adding a2 to a1, a2 :"+a2);
		System.out.println("is object java is present in a1 ?"+a1.contains("java"));
		System.out.println("are all objects of a2 present in a1 ?"+a1.containsAll(a2));
		a1.remove("java");
		System.out.println("after removing java, a1:"+a1);
		a1.retainAll(a2);
		System.out.println("after retaining a2 in a1 , a1"+a1);
		System.out.println("after retaining a2 in a1 , a2"+a2);
		System.out.println("size of a1 is "+a1.size());
		a1.removeAll(a2);
		System.out.println("after removing a2 from a1 , a1 is "+a1);
		System.out.println("is a1 empty ?"+a1.isEmpty());
		System.out.println(a1 instanceof ArrayList);
		
		
	}

}
