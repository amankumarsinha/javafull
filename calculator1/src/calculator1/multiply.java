package calculator1;

public class multiply implements operation
{
	public void op(int x,int y)
	{
		long result=x*y;
		System.out.println("multiplication of two"+x+","+y+"-->"+result);
	}

}
