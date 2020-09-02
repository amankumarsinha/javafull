package com.epam.customcollection;
import java.util.ArrayList;
import java.util.Iterator;
public class customlist 
{
	 int size=0;
	ArrayList<String> newlist=new ArrayList<String>();
	 
     void adds(String data)
   { 
	  newlist.add(data);
	  size++;
   }
  
   void print()
  {
	   for(String obj:newlist)  
		    System.out.println(obj);  
  }
  void delete(String e)
  { if (newlist.contains(e))
	  newlist.remove(e);
  else
	  System.out.println("element not foud in list");
  }
  void getelement(int index)
  {
	  System.out.println(newlist.get(index));
  }
}
