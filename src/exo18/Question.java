package exo18;

public class Question {
	protected String enonce;
	protected int difficulte = 50;
	
	public Question(String e){
		this.enonce = e;
	}
	
	public int getDifficulte() {
		return this.difficulte;
	}
	
	public void setDifficulte(int d) {
		this.difficulte = d;
	}
	
	public String getEnonce() {
		return this.enonce;
	}
}
