package collection1;

import java.util.HashSet;
import java.util.Iterator;

public class Prgm10 {
	public static void main(String[] args) {
		HashSet h=new HashSet();
		h.add(1);
		h.add(1.1);
		h.add("java");
		h.add(2);
	Iterator itr=h.iterator();
	while(itr.hasNext())
	{
		Object obj=itr.next();
		if(obj instanceof Integer)
		{
			System.out.println(obj);
		}
		else
		{
			itr.remove();
		}
			
		
	}
	
	System.out.println(h);
		
	}

}
