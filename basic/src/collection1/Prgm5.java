//Create ArraYList and add objects
//Print only doubletype objects and print number of character objects
package collection1;

import java.util.ArrayList;

public class Prgm5 {
	public static void main(String[] args) {
		
		ArrayList a1=new ArrayList();
		a1.add(1);
		a1.add(10.1);
		a1.add(1.1);
		a1.add('a');
		a1.add(3.3);
		a1.add('s');
		a1.add("java");
		int count=0;
		
		for(int i=0;i<a1.size();i++)
		{
						Object obj =a1.get(i);
						if(obj instanceof Double)
						{
							System.out.println(obj);
						}
						
						if(obj instanceof Character)
						{
							count++;
						}
		}
		System.out.println("the number of character objects is "+count);
	}

}
