package behavioralpattern;

public class MediatorPatternDemo {
	
	public static void main(String args[])
	{
		
	      messageapp chat = new messageappImpl();
	
	      User1 u1=new User1(chat);
	      u1.setname("aman kumar sinha");
	      u1.sendMsg("hello how are you doing?");
	  
	          
		  User2 u2=new User2(chat);
		  u2.setname("ankit pahalania");
		  u2.sendMsg("I am good! how you doing?");
		  
		  
		   User1 u11=new User1(chat);
		      u11.setname("aman kumar sinha");
		      u11.sendMsg(" how is uncle nd aunty?");
		      
		      
			  User2 u21=new User2(chat);
			  u21.setname("ankit pahalania");
			  u21.sendMsg("enjoying vacation?");
			  
		  
	}

}
