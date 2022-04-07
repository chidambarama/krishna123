//WaP to add objects to ArraYlist and print only even numbers
package collection1;

import java.util.ArrayList;

public class Prgm6 {
	public static void main(String[] args) {
		ArrayList a1=new ArrayList();
		a1.add(1);
		a1.add(2);
		a1.add(3);
		a1.add(4);
		a1.add(1.1);
		a1.add('s');
		
		for(int i=0;i<a1.size();i++)
		{
						Object obj=a1.get(i);
						if(obj instanceof Integer)
						{
							Integer itr=(Integer)obj;//downcasting
							if(itr%2==0)
							{
								System.out.println(itr);
							}
							
							
						}
						
		}
	}

}
