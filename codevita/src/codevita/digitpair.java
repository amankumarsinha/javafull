//package codevita;
import java.util.*;

public class digitpair {
	static int paircan(int n)
	{
		if(n==2)
			return 1;
		else if(n>2)
			return 2;
		return 0;
	}
	static int largest(int n)
	{
		String s=String.valueOf(n);
		for(int i=9;i>=0;i--)
		{
			if(s.contains(String.valueOf(i)))
				return i;
		}
		return 0;
	}
	static int smallest(int n)
	{
		String s=String.valueOf(n);
		for(int i=0;i<=9;i++)
		{
			if(s.contains(String.valueOf(i)))
				return i;
		}
		return 0;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int l=sc.nextInt();
		sc.nextLine();
		String inpt=sc.nextLine();
		
		//System.out.print(inpt);
		String s1[]=inpt.split(" ");
		//System.out.print(inpt+" "+s1.length);
		//int l=Integer.parseInt(s1[0]);
		
		String bitsc[]=new String[l];
		for(int i=0;i<l;i++)
		{
			int num=Integer.parseInt(s1[i]);
			String s=String.valueOf((11*largest(num))+(7*smallest(num)));
			if(s.length()>=3)
				s=s.substring(1,s.length());
			bitsc[i]=s;
			//System.out.println(s);
		}
		int even[]=new int[10];
		int odd[]=new int[10];
		for(int i=0;i<l;i++)
		{
			int ind=Integer.parseInt(String.valueOf(bitsc[i].charAt(0)));
			//System.out.println(ind);
			if(i%2==0)
				odd[ind]++;
			else
				even[ind]++;
		}
		int pair[]=new int[10];
		for(int i=0;i<10;i++)
		{
			if(even[i]<2 && odd[i]<2)
				continue;
			pair[i]=paircan(even[i])+paircan(odd[i]);
			pair[i]=Math.min(pair[i], 2);
			//System.out.println(pair[i]);
		}
		int sum=0;
		
		for(int i=0;i<l;i++)
		{
			sum+=pair[i];
		}
		//System.out.println("$$$$$$$$$$$$$");

		System.out.print(sum);
		sc.close();


	}

}
