package exo9;

public class Main {

	public static void main(String[] args) {
		Pokemon c = new PokemonFeu("C", 100, 20);
        Pokemon s = new PokemonEau("S", 100, 15);
        Pokemon b = new PokemonPlante("B", 100, 10);

        System.out.println("--- Combat 1: C vs B ---");
        c.attaquer(b);
        System.out.println(b);
        b.attaquer(c);
        System.out.println(c);

        System.out.println("\n--- Combat 2: S vs C ---");
        s.attaquer(c);
        System.out.println(c);
        c.attaquer(s);
        System.out.println(s);

        System.out.println("\n--- Combat 3: B vs S ---");
        b.attaquer(s);
        System.out.println(s);
        s.attaquer(b);
        System.out.println(b);
	}

}
