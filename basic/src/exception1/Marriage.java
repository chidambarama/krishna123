package exception1;
import java.util.Scanner;
public class Marriage {
	public static void main(String[] args) throws NotEligibleToMarry {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the gender");
		char gender=sc.next().charAt(0);
		System.out.println("enter age");
		int age=sc.nextInt();
		
		if((gender=='m'&& age>=21)||(gender=='f'&&age>=18))
	{
	
		System.out.println("happy married life");
	}
	
	else
	{
		try
		{
		throw new NotEligibleToMarry();
		
	}
		catch(NotEligibleToMarry c)
		{
			System.out.println(c.getMessage());
		}
	}

}

}