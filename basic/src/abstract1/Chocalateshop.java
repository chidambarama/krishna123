package abstract1;
import java.util.Scanner;
public class Chocalateshop {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to the chocalate shop");
		System.out.println("Enter your choice of chocalate");
		int c=sc.nextInt();
		
		switch(c)
		{
		case 1: Diarymilk d=new Diarymilk();
				d.chocalatename();
				break;
		
		case 2: Eclairs e=new Eclairs();
					e.chocalatename();
					break;
					
		case 3:	Perk p=new Perk();
					p.chocalatename();
					break;
		
		default:   System.out.println("invalid choice");
		}
		
		
	}

}
