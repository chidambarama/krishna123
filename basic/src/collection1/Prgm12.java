package collection1;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Prgm12 {
	public static void main(String[] args) {
		
		HashMap a1=new HashMap();
		a1.put(1, "manual");
		a1.put(2, "sql");
		a1.put(3, "java");
		a1.put(4, "Selenium");
		
		System.out.println(a1);
					
				Set  h1=	a1.entrySet();
				System.out.println(h1);
				
			Iterator itr=	h1.iterator();
			while(itr.hasNext())
			{
				Object obj=itr.next();
				System.out.println(obj);
			}
			
			
			
			
		Set h2=	a1.keySet();
		System.out.println(h2);
	Iterator itr1=	h2.iterator();
	while(itr1.hasNext())
	{
		
	Object obj1=itr1.next();
	System.out.println(obj1);
	
	}
	
Collection h3=a1.values();
System.out.println(h3);
	}
		
			
		
	}


