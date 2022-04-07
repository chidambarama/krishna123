package collection1;

import java.util.LinkedList;



public class Prgm8 {
public static void main(String[] args) {
	
	LinkedList a1=new LinkedList();
	a1.add(1);
	a1.add(1);
	a1.add("hello");
	a1.add(null);
	a1.add(1.1);
	System.out.println("LinnkedlIst objecrs are "+a1);
	a1.addFirst(20);
	System.out.println("after adding 20 aS FIRST"+a1);
	a1.addLast(222);
	System.out.println("after adding 222 as last"+a1);
	a1.removeFirst();
	System.out.println("after removinf first "+a1);
	a1.removeLast();
	System.out.println("after removing last"+a1);
	System.out.println("first object is"+a1.getFirst());
	System.out.println("last object is "+a1.getLast());
	System.out.println(a1.get(0));
}

		
	
}
