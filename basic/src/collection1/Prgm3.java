package collection1;

import java.util.ArrayList;

public class Prgm3 {
	
	public static void main(String[] args) {
		
		ArrayList a1=new ArrayList();
		a1.add('a');
		a1.add('b');
		System.out.println("a1 arraylist "+a1);
		ArrayList a2=new ArrayList();
		a2.add('c');
		a2.add('d');
		a2.add('c');
		System.out.println("a2 arrayList "+a2);
		
		a1.addAll(1, a2);
		System.out.println(a1);
		
		a1.add(2, 3);
		System.out.println("after adding 3 at index 2 "+a1);
		System.out.println("index of 1 in a1 is "+a1.indexOf('c'));
		System.out.println("last index of object in a1 is "+a1.lastIndexOf('c'));
		System.out.println("object at index 3 is "+a1.get(3));
		a1.set(0, 100);
		System.out.println("after replacing object at index 0 with 100"+a1);
		a1.remove(0);
		System.out.println("after removing object at index 0"+a1);
		
		
		
		
	}

}
