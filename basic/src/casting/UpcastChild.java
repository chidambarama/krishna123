package casting;

public class UpcastChild extends Upcast {
	
	int y=20;
	public void m2()
	{
		System.out.println("in m2 of child");
		
	}
	
	public static void main(String[] args) {
		
		Upcast a1=new UpcastChild();//implicit upcasting
		//a1.m1();
	//	a1.m2();//hidden due to upcasting
		
		//Upcast a2=(Upcast) new UpcastChild();//explicit upcasting
		//a2.m1();
		
				UpcastChild	x1	=(UpcastChild)a1;//----converting parent ---into the child properties
				x1.m1();
				x1.m2();
				
	//			UpcastChild	x2	=(UpcastChild);
		
	}

}
