package coupling;

public class D {
	
	public static void main(String[] args) {
		LooseCouple l;
		
		int choice=3;
		switch(choice)
		{
		case 1: l=new A();
				l.subject();
				break;
				
		case 2: l=new B();
				l.subject();
				break;
				
		case 3:	l=new C();
				l.subject();
				break;
				
		}
		}
		
	}


