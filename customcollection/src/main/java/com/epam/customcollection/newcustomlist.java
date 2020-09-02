package com.epam.customcollection;
public class newcustomlist extends customlist
{
	public static void main(String[] args) 
	{
		customlist clist=new customlist();
		//element added into the list
		clist.adds("aman");
		clist.adds("kumar");
		clist.adds("sinha");
		clist.adds("studying");
		clist.adds("in");
		clist.adds("btech");
		clist.adds("IIIrd");
		clist.adds("in");
		clist.adds("CMR Technical campus");
		clist.adds("Hyderabad");
		clist.adds("EPAM");
		clist.adds("Custom Collection");
		
		System.out.println("1.elements of list");
		System.out.println("--------------------");
		
		clist.print();
		  System.out.println();
		  System.out.println();
		System.out.println("2.element to be deleted-->kumar");
	   clist.delete("kumar");
	   System.out.println("element deleted");
	   System.out.println();
	   System.out.println();
		System.out.println("3.element to be deleted-->Hyderabad");
		   clist.delete("Hyderabad");
		   System.out.println("element deleted");
		   System.out.println();
		   System.out.println();
	   System.out.println("4.after deletion arary elements");
	   System.out.println("--------------------");
	   clist.print();
	  
	   System.out.println();
	   System.out.println();
	   System.out.println("6.element at position -5");
	   System.out.println("--------------------");
	   clist.getelement(4);
	   System.out.println();
	   System.out.println();
	   System.out.println("7.element at position -8");
	   System.out.println("--------------------");
	   clist.getelement(8);
	  
	}

}
