package structuralpattern;



public class RealInternetAccess implements customeraccess {
	
	private String custname;

	public RealInternetAccess(String custname) {
		this.custname =custname;
	}


	public void grantInternetAccess() {
		System.out.println(" \n Internet Access granted for : "+ custname);
	}

}
