package encap;

public class Account {

	private long acc_no;
	private String name;
	private String email;
	private float amount;
	
	//getter methods//
	public long getacc_no()
	{
		return acc_no;
	}
	
	public String getname()
	{
		return name;
	}
	
	public String getemail()
	{
		return email;
	}
	
	public float getamount()
	{
			return amount;
	}
	
	
	//setter methods//
	
	public void setacc_no(long acc_no)
	{
			this.acc_no=acc_no;
			
	}
	
	
	public void setname(String name)
	{
		
		this.name=name;
	}
	
	public void setemail(String email)
	{
		
			this.email=email;
	}
	
	
	public void setamount(float amount)
	{
		this.amount=amount;
	
	}
	
}
