package exo19;

import java.util.ArrayList;

public class Elu extends Personne {
	protected ArrayList<Personne> assistants;
	
	public Elu(String nom, String prenom){
		super(nom, prenom);
		this.assistants = new ArrayList<Personne>();
	}
	
	public void embaucheAssistant(String nom, String prenom) {
		this.assistants.add(new Personne(nom,prenom));
	}
	
	public void licencieAssistant(Personne p) {
		this.assistants.remove(p);
	}
	
	public void depenseDotation(int montant) {
		for(Personne p:this.assistants)
			p.addSous(montant / this.assistants.size());
	}
}
