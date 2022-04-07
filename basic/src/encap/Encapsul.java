package encap;

public class Encapsul {
	
	public static void main(String[] args) {
		
		Account a1=new Account();
		
		a1.setacc_no(1234567894);
		a1.setname("sindhu");
		a1.setemail("sindu@gmail.com");
		a1.setamount(50000000f);
		
		
		System.out.println(a1.getacc_no()+ " "+a1.getname()+ " "+a1.getemail()+ " "+a1.getamount());
		
	}

}
