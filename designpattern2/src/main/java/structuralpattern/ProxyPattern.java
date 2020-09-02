package structuralpattern;

public class ProxyPattern{
	
	public static void main(String[] args) 
	{
		customeraccess access = new ProxyInternetAccess("aman kumar sinha");
		
		access.grantInternetAccess();
	}


}

