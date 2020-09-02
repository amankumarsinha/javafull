package structuralpattern;

public class ProxyInternetAccess implements customeraccess {
	
	
	private String custname;
	
	private RealInternetAccess  realaccess;
	

	public ProxyInternetAccess(String custname) 
	{
		this.custname = custname;
	}
	

	
	public void grantInternetAccess() 
	{
		if (getRole(custname) == "no due") 
		{
			realaccess = new RealInternetAccess(custname);
			realaccess.grantInternetAccess();
		} 
		else 
		{
			System.out.println("No Internet access granted. Your payment is due");
		}

	}

	
	
	public String getRole(String custname) {
		   return  "no due";
	}


}



