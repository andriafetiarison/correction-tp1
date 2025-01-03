package exo18;

import java.util.ArrayList;

public class QuestionQCM extends Question {
	protected ArrayList<Reponse> reponses;
	
	public QuestionQCM(String e) {
		super(e);
		this.reponses= new ArrayList<>();
	}
	
	public void addReponse(String texte, boolean validite) {
		this.reponses.add(new Reponse(texte,validite));
	}
	
	public String getText() {
		String resultat = this.enonce + ":";
		for(Reponse s:this.reponses)
			resultat = resultat + "/" + s.texte;
		
		return resultat;
	}
}
