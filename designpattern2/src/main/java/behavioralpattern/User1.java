package behavioralpattern;


public class User1 extends Participant {
	
	private String name;
	private messageapp chat;
	
	public void sendMsg(String msg) {
	chat.showMsg(msg,this);
		
	}

	public void setname(String name) {
		this.name=name;
	}

	
	public String getName() {
		return name;
	}
	
	public User1(messageapp chat){
		this.chat=chat;
	}
	
	
}
