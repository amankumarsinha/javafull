package structuralpattern;


public class BridgePattern {
	
	public static void main(String[] args) 
	{
		
	QuestionFormat questions = new QuestionFormat("interview");
	
	questions.q = new interviewquestion();
	
    questions.next();
	questions.display();
	questions.delete("greetings?");
	
  
	questions.newOne("tell me about your project? ");
	
	questions.newOne("do you participated in any event & and get certified?");

	questions.displayAll();
	}

}

