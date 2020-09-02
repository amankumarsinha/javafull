package calculator1;

public class divide implements operation
{
	public void op(int x,int y)
	{ try
	{
		float result=(float)x/y;
		System.out.println("division of two"+x+","+y+"-->"+result);
	}
	catch(Exception e)
	{
		System.out.print(e);
		System.out.print("\n");
	}
	}
	
	

}
