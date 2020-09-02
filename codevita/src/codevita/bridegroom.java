package codevita;

import java.util.Scanner;

public class bridegroom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int l=sc.nextInt();
		String b=sc.next();
		String g=sc.next();
		int c=0;
		boolean found=false;
		for(int i=0;i<b.length();i++)
		{
			found=false;
			for(int j=0;j<g.length();j++)
			{
				if(b.charAt(i)==g.charAt(0))
				{
					c++;
					found=true;
					g=g.substring(1);
					break;
				}
				else
				{
					if(g.length()>1)
						g=g.substring(1, g.length()) + g.charAt(0);
				}
				if(!found)
					break;
					
			}
			
		}
		System.out.print(l-c);
		sc.close();
		
		

	}

}
