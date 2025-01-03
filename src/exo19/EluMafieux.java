package exo19;

public class EluMafieux extends Elu {
	
	public EluMafieux(String nom, String prenom){
		super(nom, prenom);
	}
	
	@Override
	public void embaucheAssistant(String nom, String prenom) {
		if(nom.equals(this.nom))
			super.embaucheAssistant(nom, prenom);
	}
}
