package exo18;

import java.util.ArrayList;

public class SujetExamen {
	protected ArrayList<QuestionNote> questions;
	
	public SujetExamen() {
		this.questions = new ArrayList<QuestionNote>();
	}
	
	public void addQuestion(QuestionNote question) {
		this.questions.add(question);
	}
	
	public void removeQuestion(QuestionNote question) {
		this.questions.add(question);
	}
	
	public int difficulteMoyenne() {
		int n = 0;
		for(QuestionNote question:this.questions) {
			n = n + question.getDifficulte();
		}
		return n/this.questions.size();
	}
}
