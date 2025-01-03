package exo19;

public class EluEconome extends Elu {
	
	public EluEconome(String nom, String prenom) {
		super(nom, prenom);
	}
	
	public void depenseDotation(int montant) {
		for(Personne p:this.assistants) {
			if(montant>1480) {
				p.addSous(1480);
				montant = montant - 1480;
			}
		}
	}
}
