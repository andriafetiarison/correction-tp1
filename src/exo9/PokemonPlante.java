package exo9;

public class PokemonPlante extends Pokemon {

	public PokemonPlante(String nom, int hp, int atk) {
		super(nom, hp, atk);
	}
	
	@Override
    public void attaquer(Pokemon p) {
        int damage = this.getAtk();
        if (p instanceof PokemonEau) {
            damage *= 2;
        } else if (p instanceof PokemonPlante || p instanceof PokemonFeu) {
            damage *= 0.5;
        }
        p.setHp(Math.max(0, p.getHp() - damage));
    }
}
