package exo9;

public class PokemonEau extends Pokemon {
	
	public PokemonEau(String nom, int hp, int atk) {
		super(nom, hp, atk);
	}
	
	@Override
    public void attaquer(Pokemon p) {
        int damage = this.getAtk();
        if (p instanceof PokemonFeu) {
            damage *= 2;
        } else if (p instanceof PokemonEau || p instanceof PokemonPlante) {
            damage *= 0.5;
        }
        p.setHp(Math.max(0, p.getHp() - damage));
    }
}
