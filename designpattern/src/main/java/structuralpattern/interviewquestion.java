package structuralpattern;

import java.util.ArrayList;
import java.util.List;


public class interviewquestion implements Question {
	
	
	private List <String> questions = new ArrayList<String>();

	private int current = 0;

	public interviewquestion() {
	questions.add("Introduceyourself? ");
	questions.add("overview of resume");
	questions.add("why you know about this firm ? ");
	questions.add("where do you see yourself in 5 years? ");
	questions.add("what is your working style? ");


	}

	public void nextQuestion() {
	if( current <= questions.size()-1 )
	current++;
	}

	public void previousQuestion() {
	if( current > 0 )
	current--;
	
	}

	public void newQuestion(String quest) {
	questions.add(quest);
	}

	public void deleteQuestion(String quest) {
	questions.remove(quest);
	}

	public void displayQuestion() {
	System.out.println( questions.get(current) );
	}

	public void displayAllQuestions() {
	for (String quest : questions) {
	System.out.println(quest);
	}
	}

}

