//custom unchecked exception
//create a exception class and extend it from runtimeexception class and override the get message
package exception1;

public class NotEligibleToVoteException extends RuntimeException {
	
public String getMessage()
{
	return "keep calm and wait till you turn 18";
}

}
