//wap to print only integer objects from the arrayList
package collection1;

import java.util.ArrayList;

public class Prgm4 {
	public static void main(String[] args) {
		ArrayList a1=new ArrayList();
		a1.add(1);
		a1.add('a');
		a1.add("java");
		a1.add(2.1);
		a1.add(true);
		
		for(int i=0;i<a1.size();i++)
		{
				 Object obj=a1.get(i);
				 if(obj instanceof Integer)
				 {
					 System.out.println(obj);
					 
				 }
				 
		}
			
		
		
		
		
	}

}
