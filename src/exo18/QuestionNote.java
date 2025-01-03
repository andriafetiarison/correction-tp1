package exo18;

public class QuestionNote {
	protected Question question;
	protected int points;
	
	QuestionNote(Question question, int points){
		this.question = question;
		this.points = points;
	}
	
	public int getPoints() {
		return this.points;
	}
	
	public int getDifficulte() {
		return this.question.getDifficulte();
	}
	
	public void setDifficulte(int d) {
		this.question.setDifficulte(d);
	}
	
	public String getEnonce() {
		return this.question.getEnonce();
	}

}
