//custom checked exception
//create exception class and extend it from exception class and override the getmessage method
package exception1;

public class NotEligibleToMarry extends Exception {
	
	public String getMessage()
	{
		return "please wait ";
	}

}
