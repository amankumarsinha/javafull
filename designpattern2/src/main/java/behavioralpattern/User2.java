package behavioralpattern;


public class User2 extends Participant {

	private String name;
	private messageapp chat;
	
	
	public void sendMsg(String msg) {
	this.chat.showMsg(msg,this);
		
	}

	
	public void setname(String name) {
		this.name=name;
	}

	
	public String getName() {
		return name;
	}
	
	public User2(messageapp chat){
		this.chat=chat;
	}

	
	
}
