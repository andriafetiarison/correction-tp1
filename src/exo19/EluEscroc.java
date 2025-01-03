package exo19;

public class EluEscroc extends Elu {
	protected int compteSuisse;
	
	public EluEscroc(String nom, String prenom) {
		super(nom, prenom);
		this.compteSuisse = 0;
	}
	
	public void depenseDotation(int montant) {
		for(Personne p:this.assistants) {
			if(montant>1480) {
				p.addSous(1480);
				montant = montant - 1480;
			}
		}
		if(montant>0) {
			this.compteSuisse = this.compteSuisse + montant;
		}
	}
}
