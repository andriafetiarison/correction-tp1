package exo9;

public class PokemonFeu extends Pokemon {
	
	public PokemonFeu(String nom, int hp, int atk) {
		super(nom, hp, atk);
	}
	
	 @Override
    public void attaquer(Pokemon p) {
        int damage = this.getAtk();
        if (p instanceof PokemonPlante) {
            damage *= 2;
        } else if (p instanceof PokemonEau || p instanceof PokemonFeu) {
            damage *= 0.5;
        }
        p.setHp(Math.max(0, p.getHp() - damage));
    }
}
