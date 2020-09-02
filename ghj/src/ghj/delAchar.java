package ghj;
import java.util.*;

public class delAchar {
	public static void main(String args[])
	{
		String test="AAWER";
		String l=test.substring(0,2);
		String q=test.substring(2,test.length());
		String t=l.replaceAll("A","");
		System.out.println(t+q);
	}
	
}
