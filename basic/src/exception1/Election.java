package exception1;
import java.util.Scanner;
public class Election {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the age");
		int age=sc.nextInt();
		if(age>=18)
		{
			System.out.println("welcome to voting ,vote wisely!!!");
		}
		
		else
		{
			
			throw new NotEligibleToVoteException();
			
		}
		
		System.out.println("end of voting");
		
	}

}
